package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Courses;
import com.springrest.springrest.service.CourseService;
import com.springrest.springrest.service.CourseServiceImp;

@RestController
public class MyController {
	
	@Autowired
	private CourseService courseServ;

	@GetMapping("/hello")
	public String hello() {
		return "THis is my anohter hello page";
	}
	
	//get all the list of courses
	@GetMapping("/courses")
	public List<Courses> getAllCourse(){
		 return this.courseServ.getAllCourse();	
	}
	
	//get a single ID
	
	@GetMapping("/courses/{id}")
	public Courses getSingleData(@PathVariable String id) {
		
		return this.courseServ.getCourse(Long.parseLong(id));
		
	}
	
	//using post method
	@PostMapping("/courses")
	public Courses addDataInto(@RequestBody Courses course) {
		return this.courseServ.addCourse(course);
		
	}
	
	//update the data
	@PutMapping("/courses")
	public Courses updateCOurse(@RequestBody Courses course) {
		return this.courseServ.updateCourse(course);
	}
	
	
	
}
