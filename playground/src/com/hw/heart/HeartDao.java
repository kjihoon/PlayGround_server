package com.hw.heart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.HeartMapper;
import com.hw.vo.Heart;

@Repository("heartDao")
public class HeartDao implements Dao<Heart, String> {

	@Autowired
	HeartMapper mapper;
	
	@Override
	public void insert(Heart t) {
		mapper.insert(t);
	}
	

	@Override
	public void delete(String s) {
		mapper.delete(s);
	}

	@Override
	public void update(Heart t) {
		mapper.update(t);
	}

	@Override
	public Heart select(String s) {
		
		return mapper.select(s);
	}

	@Override
	public List<Heart> select() {
		return mapper.selectall();
	}


	@Override
	public List<Heart> selectif(Heart s) {
		// TODO Auto-generated method stub
		return mapper.selectif(s);
	}

}











