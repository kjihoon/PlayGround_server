package com.hw.reply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hw.frame.Dao;
import com.hw.mapper.ReplyMapper;
import com.hw.vo.Reply;


@Repository("replyDao")
public class ReplyDao implements Dao<Reply, String> {

   @Autowired
   ReplyMapper mapper;
   
   @Override
   public void insert(Reply t) {
      mapper.insert(t);
   }

   @Override
   public void delete(String s) {
      mapper.delete(s);
   }

   @Override
   public void update(Reply t) {
      mapper.update(t);
   }

   @Override
   public Reply select(String s) {
      return mapper.select(s);
   }

   @Override
   public List<Reply> select() {
      return mapper.selectall();
   }


   @Override
   public List<Reply> selectif(Reply s) {
      return mapper.selectif(s);
   }
}




