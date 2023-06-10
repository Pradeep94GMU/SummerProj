package com.springrest.springrest.service;

import java.util.List;

import com.springrest.springrest.entities.Courses;

public interface CourseService {

	
	public List<Courses> getAllCourse();

	public Courses getCourse(long l);

	public Courses addCourse(Courses course);

	public Courses updateCourse(Courses course);
	
}
