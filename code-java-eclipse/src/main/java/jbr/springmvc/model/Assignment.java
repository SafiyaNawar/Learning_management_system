package jbr.springmvc.model;

import java.sql.Date;

public class Assignment {


	  private String idc;
	  private String namec;
	  private int assignnum;
	  private Date due;
	 
	  
	  public String getIdc() {
		  return idc;
	  }

		  public void setIdc(String idc) {
		  this.idc = idc;
	  }
		  
		  
		  
	  public String getNamec() {
		  return namec;
	  }

	  public void setNamec(String namec) {
		  this.namec = namec;
	  }

	 
	  public int getAssignnum() {
	  return assignnum;
		  }

	  public void setAssignnum(int assignnum) {
	  this.assignnum = assignnum;
		  }

	 

	  public Date getDate() {
	  return due;
	  }

	  public void setDate(Date due) {
	  this.due = due;
	  }
	  
}
