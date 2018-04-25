package com.hw.mapper;

import java.util.List;

import com.hw.vo.Reply;

public interface ReplyMapper {
   public void insert(Reply obj);
   public void delete(String obj);
   public void update(Reply obj);
   public Reply select(String obj);
   public List<Reply> selectall();
   public List<Reply> selectif(Reply obj);
}