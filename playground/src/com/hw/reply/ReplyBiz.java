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
	
	@Transactional	
	@Override
	public void register(Reply t) {	
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





