package jbr.springmvc.service;

import jbr.springmvc.model.Login;
import jbr.springmvc.model.User;
import jbr.springmvc.model.Student;
import jbr.springmvc.model.Teacher;
import jbr.springmvc.model.LoginStudent;
import jbr.springmvc.model.LoginTeacher;

public interface UserService {

  int register(User user);
  User validateUser(Login login);
  
  int registerStudent(Student student);  
  Student validateStudent(LoginStudent login);

  int registerTeacher(Teacher teacher);
  Teacher validateTeacher(LoginTeacher login);
}