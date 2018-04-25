package com.hw.reply;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.Reply;
@Service("replyBiz")
public class ReplyBiz implements Biz<Reply, String> {

	@Resource(name="replyDao")
	Dao<Reply, String> dao;
	
	public ReplyBiz() {
		dao = new ReplyDao();
	}
	
	@Transactional	// 이거때문에 롤백 가능
	@Override
	public void register(Reply t) {	// 두개(주문내역, 배송내역)를 해주는 이유는 하나가 실패하면 하나는 자동으로 rollback 됨
		dao.insert(t);
	}
	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);

	}
	@Transactional
	@Override
	public void modify(Reply t) {
		dao.update(t);
	}

	@Override
	public Reply get(String s) {
		return dao.select(s);
	}

	@Override
	public List<Reply> get() {
		return dao.select();
	}

	@Override
	public List<Reply> getif(Reply t) {
	
		return dao.selectif(t);
	}

}





