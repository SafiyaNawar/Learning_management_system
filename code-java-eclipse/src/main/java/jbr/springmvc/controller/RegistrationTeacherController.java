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

	import jbr.springmvc.model.Teacher;
	//import jbr.springmvc.model.Admin;
	import jbr.springmvc.service.UserService;

	@Controller
	public class RegistrationTeacherController {
	  @Autowired
	  public UserService userService;

	  @RequestMapping(value = "/registerteacher", method = RequestMethod.GET)
	  public ModelAndView showRegister(HttpServletRequest request, HttpServletResponse response) {
	    ModelAndView mav = new ModelAndView("registerteacher");
	    mav.addObject("teacher", new Teacher());

	    return mav;
	  }

	  @RequestMapping(value = "/registerteacherProcess", method = RequestMethod.POST)
	  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
	  @ModelAttribute("teacher") Teacher user, HttpSession session) {

	  userService.registerTeacher(user);
	  session.setAttribute("username", user.getUsername());
	  return new ModelAndView("teacherpage", "firstname", user.getFirstname());
	  }
	}
	
	
	


