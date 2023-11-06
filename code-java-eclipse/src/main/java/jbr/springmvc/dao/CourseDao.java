package jbr.springmvc.dao;

//import java.sql.Timestamp;
import java.util.List;

import jbr.springmvc.model.Assignment;
import jbr.springmvc.model.Course;
import jbr.springmvc.model.Coursedelete;
import jbr.springmvc.model.Coursedetails;
//import jbr.springmvc.model.ResultHistory;

public interface CourseDao {

  int addCourse(Course namecourse);  
  public List<String> getAllDomains();  
  public List<Course> getCourseByDomain(String domain);  
  public List<Course> getAllCourses();  
  public List<Coursedetails> getAllDetails();  
  public Course getCourseByFaculty(String namecourse);
  
  int addCoursedetails(Coursedetails namecrs);
  
  int deleteCourse(Coursedelete namecr);
  
  int addAssignment(Assignment assignment);  
  
//  public int saveResult(String username, Timestamp time, int score, String topic);
//  
//  public List<ResultHistory> getAllResultHistory(String username);
// 
}
