package jbr.springmvc.service;

//import java.sql.Timestamp;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.CourseDao;
import jbr.springmvc.model.Assignment;
import jbr.springmvc.model.Course;
import jbr.springmvc.model.Coursedelete;
import jbr.springmvc.model.Coursedetails;
//import jbr.springmvc.model.ResultHistory;

public class CourseServiceImpl implements CourseService {

  @Autowired
  public CourseDao courseDao;

  public int addCourse(Course namecourse) {
    return courseDao.addCourse(namecourse);
  }
  
  

  public int deleteCourse(Coursedelete namecr) {
    return courseDao.deleteCourse(namecr);
  }
  
  
  
  public int addCoursedetails(Coursedetails namecrs) {
	    return courseDao.addCoursedetails(namecrs);
	  }


public List<String> getAllDomains() {
	return courseDao.getAllDomains();
}

public List<Course> getCourseByDomain(String domain) { 
	return courseDao.getCourseByDomain(domain);
}

public List<Course> getAllCourses() {
	return courseDao.getAllCourses();
}
	
	
	public List<Coursedetails> getAllDetails(){
	return courseDao.getAllDetails();
	}
	
	


public Course getCourseByFaculty(String course) {
	return courseDao.getCourseByFaculty(course);
}



@Override
public int addAssignment(Assignment assignment) {
	return courseDao.addAssignment(assignment);
	
}

//public void saveQuestion(Course question) {
//	questionDao.saveQuestion(question);
//}
//
//public void deleteQuestion(String question) {
//	questionDao.deleteQuestion(question);
//}
//
//public int saveResult(String username, Timestamp time, int score, String topic) {
//	return questionDao.saveResult(username, time, score, topic);
//}
//
//public List<ResultHistory> getAllResultHistory(String username) {
//	return questionDao.getAllResultHistory(username);
}

