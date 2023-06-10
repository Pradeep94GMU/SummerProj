package com.springrest.springrest.service;

import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.Dao.CourseDao;
import com.springrest.springrest.entities.Courses;

@Service
public class CourseServiceImp implements CourseService {
	
	@Autowired
	private CourseDao courseDao;
	
	//List<Courses> lc;
	
	public CourseServiceImp() {
		
//		lc = new ArrayList<>();
//		lc.add(new Courses((long) 124, "OS", "Basic COurse"));
//		lc.add(new Courses((long) 123111, "CS", "Basic COurse"));
//		lc.add(new Courses((long) 125, "DS", "Basic COurse"));
//		lc.add(new Courses((long) 126, "MathS", "Need to learn for anything"));
	}
				

	@Override
	public List<Courses> getAllCourse() {
		return courseDao.findAll();
	}


	@Override
	public Courses getCourse(long l) {
//		Courses c = null;
//		for(Courses cou :lc) {
//			if(cou.getId() == l) {
//				c = cou;
//				break;
//			}
//		}
//		
		return courseDao.getReferenceById(l);
	}


	@Override
	public Courses addCourse(Courses course) {
		//i need to add that instance of object into list ls
		//lc.add(course);
		
		//we need to use save()
		courseDao.save(course);
		return course;
	}

	@Override
	public Courses updateCourse(Courses course) {
//		lc.forEach(e -> {
//			if(e.getId() == course.getId()) {
//				e.setTitle(course.getTitle());
//				e.setDescription(course.getDescription());
//			}
//		});
		courseDao.save(course);
		return course;
	}


}
