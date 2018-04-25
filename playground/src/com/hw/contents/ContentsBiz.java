package com.hw.contents;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hw.frame.Biz;
import com.hw.frame.Dao;
import com.hw.vo.Contents;
@Service("contentsBiz")
public class ContentsBiz implements Biz<Contents, String> {

	@Resource(name="contentsDao")
	Dao<Contents, String> dao;
	
	public ContentsBiz() {
		dao = new ContentsDao();
	}
	
	@Transactional
	@Override
	public void register(Contents t) {	
		dao.insert(t);
	}
	@Transactional
	@Override
	public void remove(String s) {
		dao.delete(s);

	}
	@Transactional
	@Override
	public void modify(Contents t) {
		dao.update(t);
	}

	@Override
	public Contents get(String s) {
		return dao.select(s);
	}

	@Override
	public List<Contents> get() {
		return dao.select();
	}

	@Override
	public List<Contents> getif(Contents s) {
		// TODO Auto-generated method stub
		return dao.selectif(s);
	}

}





