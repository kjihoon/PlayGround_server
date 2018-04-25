package com.hw.controller;

import java.io.IOException;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.frame.Biz;
import com.hw.vo.Reply;

@Controller
public class ReplyController {
   
   @Resource(name="replyBiz")
   Biz<Reply,String> biz;
   
   @RequestMapping(value="registerReply.do" ,produces = "application/text; charset=utf8", method=RequestMethod.POST)
   @ResponseBody
   public String register(Reply reply) throws IOException {
	  System.out.println(reply.getPidx()+": (pidx) registerReply立加");
	  biz.register(reply);
	  JSONObject jo = new JSONObject();
	  JSONArray jr = new JSONArray();
	  jo.put("registerReplySucess", "true");
	  jr.add(jo);
      return jr.toJSONString();      
   }
   @RequestMapping(value="replyView.do" ,produces = "application/text; charset=utf8", method=RequestMethod.POST)
   @ResponseBody
   public String replyView(Reply reply) throws IOException {   
	  System.out.println(reply.getPidx()+": (pidx) replyView 立加");
	   List<Reply> replylist = biz.getif(reply);	   
	  JSONObject jo = null;
	  JSONArray jr = new JSONArray();
	  for (int i =0;i<replylist.size();i++) {
		  jo = new JSONObject();
		  jo.put("pidx",replylist.get(i).getPidx());
		  jo.put("uidx",replylist.get(i).getUidx());
		  jo.put("dt",replylist.get(i).getDt());
		  jo.put("reply",replylist.get(i).getReply());
		  jr.add(jo);
	  } 
	  System.out.println(jr.toJSONString());
      return jr.toJSONString();      
   }
}