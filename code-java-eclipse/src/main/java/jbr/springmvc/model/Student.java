package jbr.springmvc.model;

public class Student {
	
  private int studid;
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String email;

  public int getStudid() {
	  return studid;
	  }

	  public void setStudid(int studid) {
	  this.studid = studid;
	  }
  
  public String getUsername() {
  return username;
  }

  public void setUsername(String username) {
  this.username = username;
  }

  public String getPassword() {
  return password;
  }

  public void setPassword(String password) {
  this.password = password;
  }

  public String getFirstname() {
  return firstname;
  }

  public void setFirstname(String firstname) {
  this.firstname = firstname;
  }

  public String getLastname() {
  return lastname;
  }

  public void setLastname(String lastname) {
  this.lastname = lastname;
  }

  public String getEmail() {
  return email;
  }

  public void setEmail(String email) {
  this.email = email;
  }

}