package com.hw.vo;



public class Contents {
   private String pidx;
   private String uidx;
   private String dt;
   private String lat;
   private String lon;
   private String heart;
   private String cmt;
   private String distance;
public String getPidx() {
	return pidx;
}
public void setPidx(String pidx) {
	this.pidx = pidx;
}
public String getUidx() {
	return uidx;
}
public void setUidx(String uidx) {
	this.uidx = uidx;
}
public String getDt() {
	return dt;
}
public void setDt(String dt) {
	this.dt = dt;
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
public String getHeart() {
	return heart;
}
public void setHeart(String heart) {
	this.heart = heart;
}
public String getCmt() {
	return cmt;
}
public void setCmt(String cmt) {
	this.cmt = cmt;
}
public String getDistance() {
	return distance;
}
public void setDistance(String distance) {
	this.distance = distance;
}
@Override
public String toString() {
	return "Contents [pidx=" + pidx + ", uidx=" + uidx + ", dt=" + dt + ", lat=" + lat + ", lon=" + lon + ", heart="
			+ heart + ", cmt=" + cmt + ", distance=" + distance + "]";
}

}