package com.hw.heart;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.Heart;
@Service("heartBiz")
public class HeartBiz implements Biz<Heart, String> {

	@Resource(name="heartDao")
	Dao<Heart, String> dao;
	
	public HeartBiz() {
		dao = new HeartDao();
	}
	
	@Transactional
	@Override
	public void register(Heart t) {	
		dao.insert(t);
	}
	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);

	}
	@Transactional
	@Override
	public void modify(Heart t) {
		dao.update(t);
	}

	@Override
	public Heart get(String s) {
		return dao.select(s);
	}

	@Override
	public List<Heart> get() {
		return dao.select();
	}

	@Override
	public List<Heart> getif(Heart s) {
		// TODO Auto-generated method stub
		return dao.selectif(s);
	}

}





