package com.hw.contents;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.ContentsMapper;
import com.hw.vo.Contents;

@Repository("contentsDao")
public class ContentsDao implements Dao<Contents, String> {

	@Autowired
	ContentsMapper mapper;
	
	@Override
	public void insert(Contents t) {
		mapper.insert(t);
	}
	

	@Override
	public void delete(String s) {
		mapper.delete(s);
	}

	@Override
	public void update(Contents t) {
		mapper.update(t);
	}

	@Override
	public Contents select(String s) {
		
		return mapper.select(s);
	}

	@Override
	public List<Contents> select() {
		return mapper.selectall();
	}


	@Override
	public List<Contents> selectif(Contents s) {
		// TODO Auto-generated method stub
		return mapper.selectif(s);
	}

}











