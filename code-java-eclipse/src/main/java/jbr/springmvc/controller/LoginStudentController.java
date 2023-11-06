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
import jbr.springmvc.model.LoginStudent;
import jbr.springmvc.model.Student;
//import jbr.springmvc.model.User;
import jbr.springmvc.service.UserService;

@Controller
public class LoginStudentController {

  @Autowired
  UserService userService;

  @RequestMapping(value = "/loginstudent", method = RequestMethod.GET)
  public ModelAndView showLogin(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("loginstudent");
    mav.addObject("loginstudent", new LoginStudent());

    return mav;
  }

  @RequestMapping(value = "/loginstudentProcess", method = RequestMethod.POST)
  public ModelAndView loginProcess(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("loginstudent") LoginStudent login, HttpSession session) {
    ModelAndView mav = null;

    Student user = userService.validateStudent(login);
    session.setAttribute("username", login.getUsername());

    if (null != user) {
    mav = new ModelAndView("studentpage");
    mav.addObject("firstname", user.getFirstname());
    } else {
    mav = new ModelAndView("loginstudent");
    mav.addObject("message", "Username or Password is wrong!!");
    }

    return mav;
  }
//   
  @RequestMapping(value="/logout")
  public ModelAndView deleteQuestion(HttpSession session) {
	  session.invalidate();
      ModelAndView mav = new ModelAndView("redirect:/homestudent.jsp");
      return mav;
  }
//  }

}