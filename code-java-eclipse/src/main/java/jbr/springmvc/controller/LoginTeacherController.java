package jbr.springmvc.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

//import jbr.springmvc.model.Login;
import jbr.springmvc.model.LoginTeacher;
import jbr.springmvc.model.Teacher;
//import jbr.springmvc.model.Admin;
import jbr.springmvc.service.UserService;

@Controller
public class LoginTeacherController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/loginteacher", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("loginteacher");
    mav.addObject("loginteacher", new LoginTeacher());

    return mav;
  }

  @RequestMapping(value = "/loginteacherProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("loginteacher") LoginTeacher login, HttpSession session) {
    ModelAndView mav = null;

    Teacher user = userService.validateTeacher(login);
    session.setAttribute("username", login.getUsername());

    if (null != user) {
    mav = new ModelAndView("teacherpage");
    mav.addObject("firstname", user.getFirstname());
    } else {
    mav = new ModelAndView("loginteacher");
    mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }
  
  
//  
//  @RequestMapping(value="/logout")
//  public ModelAndView deleteQuestion(HttpSession session) {
//	  session.invalidate();
//      ModelAndView mav = new ModelAndView("redirect:/hometeacher.jsp");
//      return mav;
//  }

}