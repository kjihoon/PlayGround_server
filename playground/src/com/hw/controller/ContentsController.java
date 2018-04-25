package com.hw.controller;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.imageio.ImageIO;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.hw.frame.Biz;
import com.hw.vo.Contents;
import com.hw.vo.Heart;



@Controller
public class ContentsController {
	
	@Resource(name="contentsBiz")
	Biz<Contents,String> biz;
	
	@Resource(name="heartBiz")
	Biz<Heart,String> biz2;
	
	@RequestMapping(value="mainView.do", produces = "application/text; charset=utf8",  method=RequestMethod.POST)
	@ResponseBody
	public String mainView(@RequestParam(value = "page", defaultValue = "1") String page,Contents contents
			/*,@RequestParam("lat") String lat,
			@RequestParam("lon") String lon*/) throws IOException {
		
		System.out.println(contents.toString());
		System.out.println(contents.getUidx()+": (uidx)mainView.do立加 pagenum: "+page);
		contents.setUidx(null);
		contents.setDistance("0.5");
		/*if (contents.getDistance().equals("") || contents.getDistance()==null ) {
			
		}*/
		List<Contents> contentslist = biz.getif(contents);		
		contents=null;
		JSONObject jo = null;
		JSONArray jr = new JSONArray();
	
		int pagenum = Integer.parseInt(page);
		int start = pagenum*5-5;
		//sdf
		int end = start+5;
		
		if (contentslist.size()<end) {
			end = contentslist.size();
		}
		for (int i =start;i<end;i++) {
			jo = new JSONObject();
			contents = contentslist.get(i);
			jo.put("pidx",contents.getPidx());
			jo.put("uidx",contents.getUidx());
			jo.put("dt",contents.getDt());
			jo.put("heart",contents.getHeart());
			jo.put("cmt",contents.getCmt());
			jr.add(jo);
		}
	    System.out.println(jr.toJSONString());
	    return jr.toJSONString();
	}
	
	@RequestMapping(value="myView.do", produces = "application/text; charset=utf8",  method=RequestMethod.POST)
	@ResponseBody
	public String myView(@RequestParam("uidx") String uidx) throws IOException {		
		System.out.println(uidx+": (uidx) myView立加");
		Contents contents2 = new Contents();
		contents2.setUidx(uidx);
		List<Contents> contentslist = biz.getif(contents2); 
		Contents contents;
		JSONObject jo = null;
		JSONArray jr = new JSONArray();		
		for (int i =0;i<contentslist.size();i++) {
			jo = new JSONObject();
			contents = contentslist.get(i);
			jo.put("pidx",contents.getPidx());
			jo.put("uidx",contents.getUidx());
			jo.put("dt",contents.getDt());
			jo.put("heart",contents.getHeart());
			jo.put("cmt",contents.getCmt());
			jr.add(jo);
		}	    
	    System.out.println(jr.toJSONString());
	  return jr.toJSONString();
	}
	
	@RequestMapping(value="registerContents.do", produces = "application/text; charset=utf8",  method=RequestMethod.POST)
	@ResponseBody
	public String registerContents(@RequestParam("img") MultipartFile img
			,Contents contents) throws IOException {
			System.out.println(contents.getPidx()+":(pidx)registerContents 立加");
						
			Date crr = new Date();
			SimpleDateFormat sdf = new SimpleDateFormat("YMMdkkms");
			//file name : idx + current time
			String filename =contents.getUidx()+"."+sdf.format(crr);
			contents.setPidx(filename);
			biz.register(contents);		
			System.out.println(contents.toString());
			String filePath = "C:\\Users\\wlwl0\\Desktop\\mv\\web\\img\\";
			String fullPath = filePath + filename +".jpg"; 
			
			
			File file = new File(fullPath);
			img.transferTo(file);
			
			Image image;
			//resize
			try {
				image = ImageIO.read(file);
				Image resizeimg = image.getScaledInstance(1080,1080,Image.SCALE_SMOOTH);
				BufferedImage newImage = new BufferedImage(1080,1080,BufferedImage.TYPE_INT_RGB);
				Graphics g = newImage.getGraphics();
				g.drawImage(resizeimg, 0, 0, null);
				g.dispose();
				ImageIO.write(newImage,"jpg",new File(fullPath));
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			
			JSONObject jo = new JSONObject();
			JSONArray jr = new JSONArray();		
			jo.put("registerContentsSucess", "true");		
			jr.add(jo);			
			System.out.println(jr.toJSONString());
			return jr.toJSONString();
	}
	
	@RequestMapping(value="heartupdate.do", produces = "application/text; charset=utf8",  method=RequestMethod.POST)
	@ResponseBody
	public String heartupdate(Contents contents) {		
		System.out.println(contents.getUidx()+"(uidx 穿弗荤恩)$$$$"+contents.getPidx()+"(pidx) : heartupadate 立加");
		Heart heart = new Heart();
		heart.setPidx(contents.getPidx());
		heart.setUidx(contents.getUidx());
		
		JSONObject jo = new JSONObject();
		JSONArray jr = new JSONArray();	
		
		
		biz.modify(contents);
		if ((contents.getHeart()).equals("true")) {
			biz2.register(heart);
			jo.put("updateHeartSucess","plus");
		}else {
			List<Heart> heartchecker = biz2.getif(heart);
			System.out.println(heartchecker.size());
			for (int i =0;i<heartchecker.size();i++) {
				System.out.println(heartchecker.get(i).getPidx());
				System.out.println(heart.getPidx());
				if (heartchecker.get(i).getPidx().equals(heart.getPidx())) {
					biz2.remove(heartchecker.get(i).getHidx());
				}
			}
			jo.put("updateHeartSucess","minus");
		}
		jr.add(jo);
		return jr.toJSONString();
	}
	
	
}
