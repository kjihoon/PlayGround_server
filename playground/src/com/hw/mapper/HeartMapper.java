package com.hw.mapper;

import java.util.List;
import com.hw.vo.Heart;

public interface HeartMapper {
	public void insert(Heart obj);
	public void delete(String obj);
	public void update(Heart obj);
	public Heart select(String obj);
	public List<Heart> selectall();
	public List<Heart> selectif(Heart obj);
}
