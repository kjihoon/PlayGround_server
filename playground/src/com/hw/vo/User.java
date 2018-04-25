package com.hw.vo;

public class User {
   private String uidx;
   private String email;
   private String pwd;
   private String name;
   private String age;
   private String gender;
   private String lat;
   private String lon;

   
   
   @Override
	public String toString() {
		   System.out.println("toString:");
		return "User [uidx=" + uidx + ", email=" + email + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender="
				+ gender + ", lat=" + lat + ", lon=" + lon + "]";
	}

   
   public String getLat() {
	return lat;
}


public void setLat(String lat) {
	this.lat = lat;
}


public String getLon() {
	return lon;
}


public void setLon(String lon) {
	this.lon = lon;
}


public User() {
   }
   

   public User(String uidx, String email, String pwd, String name, String age, String gender) {
      super();
      this.uidx = uidx;
      this.email = email;
      this.pwd = pwd;
      this.name = name;
      this.age = age;
      this.gender = gender;
   }

public String getUidx() {
	return uidx;
}

public void setUidx(String uidx) {
	this.uidx = uidx;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

  
   
   
}