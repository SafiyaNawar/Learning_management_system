package jbr.springmvc.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jbr.springmvc.model.Assignment;
import jbr.springmvc.model.Course;
import jbr.springmvc.model.Coursedelete;
import jbr.springmvc.model.Coursedetails;
//import jbr.springmvc.model.User;
import jbr.springmvc.service.CourseService;

@Controller
public class CourseController {
  @Autowired
  public CourseService courseService;

  @RequestMapping(value = "/addcourse", method = RequestMethod.GET)
  public ModelAndView showCourse(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("addcourse");
    mav.addObject("namecourse", new Course());

    return mav;
  }
  
 
  
  @RequestMapping(value = "/addCourseProcess", method = RequestMethod.POST)
  public ModelAndView addUser(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("namecourse") Course namecourse) {

  courseService.addCourse(namecourse);
  ModelAndView mav = new ModelAndView("addcoursesuccess");
  mav.addObject("idcourse", namecourse.getIdcourse());
  mav.addObject("domain", namecourse.getDomain());
  mav.addObject("namecourse", namecourse.getCourse());
  mav.addObject("faculty", namecourse.getFaculty());
  
  return mav;
  }
  
  
  
  
  
  

  @RequestMapping(value = "/adddetails", method = RequestMethod.GET)
  public ModelAndView showCoursedetails(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("adddetails");
    mav.addObject("namecrs", new Coursedetails());

    return mav;
  }

  
  
  
  @RequestMapping(value = "/addCrsProcess", method = RequestMethod.POST)
  public ModelAndView addUser1(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("namecrs") Coursedetails namecrs) {

  courseService.addCoursedetails(namecrs);
  ModelAndView mav = new ModelAndView("adddetailssuccess");
  mav.addObject("idcrs", namecrs.getIdcrs());
  mav.addObject("namecrs", namecrs.getCrs());
  mav.addObject("unit1", namecrs.getUnit1());
  mav.addObject("unit2", namecrs.getUnit2());
  
  return mav;
  }
  
  
  
  
  
  

  @RequestMapping(value = "/coursedelete", method = RequestMethod.GET)
  public ModelAndView delCourse(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("coursedelete");
    mav.addObject("namecr", new Coursedelete());

    return mav;
  }

  
  
  @RequestMapping(value = "/deleteCourseProcess", method = RequestMethod.POST)
  public ModelAndView addUser2(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("namecr") Coursedelete namecr) {

  courseService.deleteCourse(namecr);
  ModelAndView mav = new ModelAndView("deletecoursesuccess");
  mav.addObject("idcr", namecr.getIdcr());
  //mav.addObject("domain", namecourse.getDomain());
  mav.addObject("namecr", namecr.getCr());
  //mav.addObject("faculty", namecourse.getFaculty());
  
  return mav;
  }
  
  
  
  
  
  @RequestMapping(value = "/assignassignment", method = RequestMethod.GET)
  public ModelAndView assignassignments(HttpServletRequest request, HttpServletResponse response) {
    ModelAndView mav = new ModelAndView("assignassignment");
    mav.addObject("assignment", new Assignment());

    return mav;
  }
  

  
  @RequestMapping(value = "/assignassignmentPrs", method = RequestMethod.POST)
  public ModelAndView addUser4(HttpServletRequest request, HttpServletResponse response,
  @ModelAttribute("assignment") Assignment assignment) {

  courseService.addAssignment(assignment);
  ModelAndView mav = new ModelAndView("addassignmentsuccess");
  mav.addObject("idcourse", assignment.getIdc());
  mav.addObject("domain", assignment.getNamec());
  mav.addObject("namecourse", assignment.getAssignnum());
  mav.addObject("faculty", assignment.getDate());
  
  return mav;
  }
  
  
  
  
  
  

  

 
  
  @RequestMapping(value = "/courselist")
  public ModelAndView displayCourses(HttpServletRequest request, Model model) {
	  List<Course> coursesList = courseService.getAllCourses();
      ModelAndView mav = new ModelAndView("courselist");
      mav.addObject("courses", coursesList);
      return mav;
  }
  
  
  
  @RequestMapping(value = "/courselistteacher")
  public ModelAndView displayCoursesteacher(HttpServletRequest request, Model model) {
	  List<Course> coursesList = courseService.getAllCourses();
      ModelAndView mav = new ModelAndView("courselistteacher");
      mav.addObject("courses", coursesList);
      return mav;
  }
  
  
  
  @RequestMapping(value = "/courseliststudent")
  public ModelAndView displayCoursesstudent(HttpServletRequest request, Model model) {
	  List<Course> coursesList = courseService.getAllCourses();
      ModelAndView mav = new ModelAndView("courseliststudent");
      mav.addObject("courses", coursesList);
      return mav;
  }
  
  
  
  
  
  @RequestMapping(value = "/coursenotes")
  public ModelAndView displayCoursedetails(HttpServletRequest request, Model model) {
	  List<Coursedetails> coursesList = courseService.getAllDetails();
      ModelAndView mav = new ModelAndView("coursenotes");
      mav.addObject("coursedetails", coursesList);
      return mav;
  }
  
  
  
  
  @RequestMapping(value = "/coursenotesteacher")
  public ModelAndView displayCoursedetailsteacher(HttpServletRequest request, Model model) {
	  List<Coursedetails> coursesList = courseService.getAllDetails();
      ModelAndView mav = new ModelAndView("coursenotesteacher");
      mav.addObject("coursedetails", coursesList);
      return mav;
  }
  
  
  

  
  
  
}
//  @RequestMapping(value = "/questionmodify")
//  public ModelAndView displayQuestionsToModify(HttpServletRequest request, Model model) {
//	  List<Course> questionsList = courseService.getAllQuestions();
//      mav.addObject("questions", questionsList);
//      return mav;
//  }
//  
//  @RequestMapping(value = "/questiondelete")
//  public ModelAndView displayQuestionsToDelete(HttpServletRequest request, Model model) {
//	  List<Course> questionsList = courseService.getAllQuestions();
//      ModelAndView mav = new ModelAndView("questiondelete");
//      mav.addObject("questions", questionsList);
//      return mav;
//  }
//  
//  @RequestMapping("/editQuestion")
//  public ModelAndView editQuestion(@RequestParam("question") String question) {
//      Course ques = questionService.getQuestionByQuestion(question);
//      ModelAndView mav = new ModelAndView("editQuestion");
//      mav.addObject("question", ques);
//      return mav;
//  }
//
//  @RequestMapping(value="/saveQuestion", method=RequestMethod.POST)
//  public ModelAndView saveQuestion(@ModelAttribute("question") Course question) {
//      questionService.saveQuestion(question);
//      ModelAndView mav = new ModelAndView("redirect:/questionmodify");
//      return mav;
//  }
//  
//  @RequestMapping(value="/deleteQuestion")
//  public ModelAndView deleteQuestion(@RequestParam("question") String question) {
//      questionService.deleteQuestion(question);
//      ModelAndView mav = new ModelAndView("redirect:/questiondelete");
//      return mav;
//  }
//  

