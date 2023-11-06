package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Student;
//import jbr.springmvc.model.Admin;
import jbr.springmvc.service.UserService;

@Controller
public class RegistrationStudentController {
  @Autowired
  public UserService userService;

  @RequestMapping(value = "/registerstudent", method = RequestMethod.GET)
  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("registerstudent");
    mav.addObject("student", new Student());

    return mav;
  }

  @RequestMapping(value = "/registerstudentProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("student") Student user, HttpSession session) {

  userService.registerStudent(user);
  session.setAttribute("username", user.getUsername());
  return new ModelAndView("studentpage", "firstname", user.getFirstname());
  }
}