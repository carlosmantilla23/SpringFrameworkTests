package com.carlosmantilla.profesoresplatzi.dao;

import java.util.List;

import com.carlosmantilla.profesoresplatzi.model.Course;

public interface CourseDAO {
	
	void saveCourse (Course course);
	
	List<Course> findAllCourses();
	
	void updateCourse (Course course);
	
	void deteleCourseById (Long idCourse);
	
	Course findById (Long idCourse);
	
	Course findByName (String name);
	
	List <Course> findByIdTeacher (Long idTeacher);

}
