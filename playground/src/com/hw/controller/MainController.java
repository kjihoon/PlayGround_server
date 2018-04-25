package com.hw.controller;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hw.vo.Contents;

@Controller
public class MainController {
	
	@RequestMapping("main.do")	
	public String main() {		
		return "main";
	}
	
	@RequestMapping("yw.do")
	@ResponseBody
	public String yw(){
		Contents contents = new Contents();
		contents.setCmt("hihi");
		JSONObject jocontents = new JSONObject();
		jocontents.put("hihi", contents);
		return jocontents.toString();
	}
	
	
}
