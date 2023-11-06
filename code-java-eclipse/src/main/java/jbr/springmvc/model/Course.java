package jbr.springmvc.model;

public class Course 
{
	
	  private String idcourse;
	  private String addedby;
	  private String namecourse;
	  private String faculty;
	  private int duration;
	  private boolean certificate;
	  private String domain;
	  
	  public String getIdcourse() {
		  return idcourse;
	  }

		  public void setIdcourse(String idcourse) {
		  this.idcourse = idcourse;
	  }
		  
		  
		  public String getAddedby() {
			  return addedby;
		  }

			  public void setAddedby(String addedby) {
			  this.addedby = addedby;
		  }	  
		  
	  public String getCourse() {
		  return namecourse;
	  }

	  public void setCourse(String namecourse) {
		  this.namecourse = namecourse;
	  }

	  public String getFaculty() {
	  return faculty;
	  }

	  public void setFaculty(String faculty) {
	  this.faculty = faculty;
	  }
	  
	  public int getDuration() {
	  return duration;
		  }

	  public void setDuration(int duration) {
	  this.duration = duration;
		  }

	  public boolean getCertificate() {
	  return certificate;
	  }

	  public void setCertificate(boolean certificate) {
	  this.certificate = certificate;
	  }
	  

	  public String getDomain() {
	  return domain;
	  }

	  public void setDomain(String domain) {
	  this.domain = domain;
	  }
	  
}
