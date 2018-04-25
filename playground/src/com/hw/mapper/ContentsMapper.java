package com.hw.mapper;

import java.util.List;

import com.hw.vo.Contents;

public interface ContentsMapper {
	public void insert(Contents obj);
	public void delete(String obj);
	public void update(Contents obj);
	public Contents select(String obj);
	public List<Contents> selectall();
	public List<Contents> selectif(Contents obj);
}
