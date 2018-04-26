package com.hw.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.inject.Qualifier;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.frame.Biz;
import com.hw.vo.Contents;
import com.hw.vo.User;

@Controller
public class UserController {

	
	
	
	@Resource(name="userBiz")
	Biz<User,String> biz;
	
	@Resource(name="contentsBiz")
	Biz<Contents,String> biz2;
	
	@RequestMapping(value="login.do" ,produces = "application/text; charset=utf8", method=RequestMethod.POST)
	@ResponseBody
	public String signin(User user) throws IOException {
		User checkuser = biz.get(user.getEmail());		
		System.out.println(user.getEmail()+": (email)login.do立加");
		
		JSONArray jr = new JSONArray();
		JSONObject jo = new JSONObject();
		if (checkuser !=null && (checkuser.getPwd()).equals(user.getPwd())){			
			jo.put("LoginSucess", "true");
			jo.put("email",checkuser.getEmail());
			jo.put("name", checkuser.getName());
			jo.put("age", checkuser.getAge());
			jo.put("gender", checkuser.getGender());
			jo.put("uidx", checkuser.getUidx());
			jo.put("pwd", checkuser.getPwd());
			
			/*Contents contents = new Contents();
			contents.setLat(user.getLat());
			contents.setLon(user.getLon());
			contents.setDistance("0.5");
			System.out.println(contents.toString());
			List<Contents> contentslist = biz2.getif(contents);
			
			int size =contentslist.size();
			if (size>5)
				size= 5;
			if (size!=0) {
				for (int i =0;i<size;i++) {
					jo = new JSONObject();
					contents = contentslist.get(i);
					jo.put("pidx",contents.getPidx());
					jo.put("uidx",contents.getUidx());
					jo.put("dt",contents.getDt());
					jo.put("heart",contents.getHeart());
					jo.put("cmt",contents.getCmt());
					System.out.println(jo.toJSONString());
					System.out.println(contentslist.get(i).getDistance());
					jr.add(jo);
				}
			}*/						
		}else {
			jo.put("LoginSucess", "false");
		}
		jr.add(jo);
		System.out.println(jr.toJSONString());	
		return jr.toJSONString();
		
	}
	
	@RequestMapping(value="register.do", produces = "application/text; charset=utf8",  method=RequestMethod.POST)
	@ResponseBody
	public String resister(User user) throws IOException {
		System.out.println(user.getEmail()+": (email)register.do 立加");
		User checkuser = biz.get(user.getEmail());		
		JSONObject jo = new JSONObject();
		JSONArray jr = new JSONArray();
		if (checkuser ==null){
			biz.register(user);
			jo.put("registerSucess", "true");
		}else {
			jo.put("registerSucess", "false");
		}
		jr.add(jo);
		System.out.println(jr.toJSONString());
		return jr.toJSONString();
	}
}


