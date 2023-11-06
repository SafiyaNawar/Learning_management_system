package jbr.springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;

import jbr.springmvc.dao.UserDao;
import jbr.springmvc.model.Login;
import jbr.springmvc.model.LoginStudent;
import jbr.springmvc.model.LoginTeacher;
import jbr.springmvc.model.Student;
import jbr.springmvc.model.Teacher;
import jbr.springmvc.model.User;

public class UserServiceImpl implements UserService {

  @Autowired
  public UserDao userDao;

  public int register(User user) {
    return userDao.register(user);
  }

  public User validateUser(Login login) {
    return userDao.validateUser(login);
  }

@Override
public int registerStudent(Student student) {
	return userDao.registerStudent(student);
}

@Override
public Student validateStudent(LoginStudent login) {
	return userDao.validateStudent(login);
}


@Override
public int registerTeacher(Teacher teacher) {
	return userDao.registerTeacher(teacher);
}

@Override
public Teacher validateTeacher(LoginTeacher login) {
	return userDao.validateTeacher(login);
}



}












