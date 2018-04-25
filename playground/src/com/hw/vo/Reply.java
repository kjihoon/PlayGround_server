package com.hw.vo;

public class Reply {
   private String ridx;
   public String getRidx() {
	return ridx;
}
public void setRidx(String ridx) {
	this.ridx = ridx;
}
private String pidx;
   private String uidx;
   private String dt;
   private String reply;
   
   public Reply() {
      
   }
   public Reply(String pidx, String uidx, String dt, String reply) {
      super();
      this.pidx = pidx;
      this.uidx = uidx;
      this.dt = dt;
      this.reply = reply;
   }
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
   public String getReply() {
      return reply;
   }
   public void setReply(String reply) {
      this.reply = reply;
   }
}