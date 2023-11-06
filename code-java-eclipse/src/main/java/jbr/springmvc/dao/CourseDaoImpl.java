package jbr.springmvc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import jbr.springmvc.model.Assignment;
import jbr.springmvc.model.Course;
import jbr.springmvc.model.Coursedelete;
import jbr.springmvc.model.Coursedetails;
//import jbr.springmvc.model.ResultHistory;


public class CourseDaoImpl implements CourseDao 
{

  @Autowired
  DataSource datasource;
  @Autowired
  JdbcTemplate jdbcTemplate;

  //addcourse
  public int addCourse(Course namecourse) 
  {
	  String sql = "insert into courses values(?,?,?,?,?,?,?)";
    return jdbcTemplate.update(sql, new Object[] { namecourse.getIdcourse(), namecourse.getAddedby(),namecourse.getCourse(), namecourse.getFaculty(),
    		namecourse.getDuration(), namecourse.getCertificate(), namecourse.getDomain()});
  }
 
  
  
  
  
  public int addCoursedetails(Coursedetails namecrs) 
  {
	  String sql = "insert into coursedetails values(?,?,?,?)";
    return jdbcTemplate.update(sql, new Object[] { namecrs.getIdcrs(), namecrs.getCrs(), namecrs.getUnit1(),
    		namecrs.getUnit2()});
  }
  
  
  
  
  public int deleteCourse(Coursedelete namecr)
  {
	  String sql = "delete from course WHERE namecourse= ?;";
    return jdbcTemplate.update(sql, new Object[] { namecr.getCr()});
  }
 
  
  public int addAssignment(Assignment assignment) 
  {
	  String sql = "insert into assignments values(?,?,?,?)";
    return jdbcTemplate.update(sql, new Object[] { assignment.getIdc(), assignment.getNamec(),assignment.getAssignnum(), 
    		assignment.getDate()});
  }
 
   
  
   
  
  
  
 //getalldomain
  public List<String> getAllDomains() 
  {
	    String sql = "SELECT DISTINCT domain FROM course";
	    List<Map<String, Object>> rows = jdbcTemplate.queryForList(sql);
	    List<String> domains = new ArrayList<String>();
	    for (Map<String, Object> row : rows) {
	        String domain = (String) row.get("domain");
	        domains.add(domain);
	    }
	    return domains;
	}
  
  
  
// getcoursebydomain  public List<Course> getCourseByDomain(String namecourse);  
  
  public List<Course> getCourseByDomain(String domain) 
  {
      String sql = "SELECT DISTINCT * FROM course WHERE domain = ? ORDER BY RAND() LIMIT 5";
      return jdbcTemplate.query(sql, new Object[]{domain}, new RowMapper<Course>() {
		@Override
		public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Course namecourse = new Course();
		      namecourse.setIdcourse(rs.getString("idcourse"));
		      namecourse.setCourse(rs.getString("namecourse"));
		      namecourse.setFaculty(rs.getString("faculty"));
		      namecourse.setDuration(rs.getInt("duration"));
		      namecourse.setCertificate(rs.getBoolean("certificate"));
		      namecourse.setDomain(rs.getString("domain"));
		      return namecourse;
		  }
	});
  }
  
  
  
  
  
  
  
  
  
  public List<Course> getAllCourses() 
  
  {
      String sql = "SELECT idcourse, namecourse, faculty, duration, certificate, domain FROM course ORDER BY domain";
      List<Course> courses = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Course>(Course.class));
      return courses;
  }
  
  
  
  
  public List<Coursedetails> getAllDetails()
  {
	  String sql = "SELECT idcrs, namecrs, unit1, unit2 FROM coursedetails ";
      List<Coursedetails> coursedetails = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Coursedetails>(Coursedetails.class));
      return coursedetails;
	  
	  
  }
  
  
  
  
  
  
  public Course getCourseByFaculty(String course) 
  {
	  String sql = "SELECT DISTINCT * FROM course WHERE faculty = ?";
      return jdbcTemplate.queryForObject(sql, new Object[]{course}, new RowMapper<Course>() {
		@Override
		public Course mapRow(ResultSet rs, int rowNum) throws SQLException {
		      Course namecourse = new Course();
		      namecourse.setIdcourse(rs.getString("idcourse"));
		      namecourse.setCourse(rs.getString("namecourse"));
		      namecourse.setFaculty(rs.getString("faculty"));
		      namecourse.setDuration(rs.getInt("duration"));
		      namecourse.setCertificate(rs.getBoolean("certificate"));
		      namecourse.setDomain(rs.getString("domain"));
		      return namecourse;
		  }
	});
  }
}



//  
//  public void saveQuestion(Course question) {
//      String sql = "UPDATE questions SET option1 = ?, option2 = ?, option3 = ?, option4 = ?, answer = ? WHERE question = ?";
//      Object[] params = new Object[]{question.getOption1(), question.getOption2(), question.getOption3(), question.getOption4(), question.getAnswer(), question.getQuestion()};
//      jdbcTemplate.update(sql, params);
//  }
//  
//  public void deleteQuestion(String question) {
//	  String sql = "DELETE FROM questions WHERE question = ?";
//      Object[] params = new Object[]{question};
//      jdbcTemplate.update(sql, params);
//  }
//  
//  public int saveResult(String username, Timestamp time, int score, String topic) {
//	  String sql = "insert into results values(?,?,?,?)";
//	  return jdbcTemplate.update(sql, new Object[] {username,time,score,topic});
//  }
//  
//  public List<ResultHistory> getAllResultHistory(String username) {
//	  String sql = "SELECT * FROM results where username = ?";
//      return jdbcTemplate.query(sql, new Object[]{username}, new RowMapper<ResultHistory>() {
//		@Override
//		public ResultHistory mapRow(ResultSet rs, int rowNum) throws SQLException {
//		      ResultHistory result = new ResultHistory();
//		      result.setUsername(rs.getString("username"));
//		      result.setTime(rs.getTimestamp("time"));
//		      result.setScore(rs.getInt("score"));
//		      result.setTopic(rs.getString("topic"));
//		      return result;
//		  }
//	});
//  }


 
