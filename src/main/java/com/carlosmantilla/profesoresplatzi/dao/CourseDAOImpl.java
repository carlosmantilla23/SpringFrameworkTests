package com.carlosmantilla.profesoresplatzi.dao;

import java.util.List;

import com.carlosmantilla.profesoresplatzi.model.Course;
import com.carlosmantilla.profesoresplatzi.model.Teacher;

public class CourseDAOImpl extends AbstractSession implements CourseDAO {

	@Override
	public void saveCourse(Course course) {
		// TODO Auto-generated method stub
		getSession().persist(course);
	}

	@Override
	public List<Course> findAllCourses() {
		// TODO Auto-generated method stub
		return getSession().createQuery("from Course").list();
	}

	@Override
	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		getSession().update(course);
	}

	@Override
	public void deteleCourseById(Long idCourse) {
		// TODO Auto-generated method stub
		Course course = findById(idCourse);
		if (course != null) {
			getSession().delete(course);
		}
	}

	@Override
	public Course findById(Long idCourse) {
		// TODO Auto-generated method stub
		return (Course) getSession().get(Course.class, idCourse);
	}

	@Override
	public Course findByName(String name) {
		// TODO Auto-generated method stub
		return (Course) getSession().createQuery("FROM Course WHERE name = :name").setParameter("name", name)
				.uniqueResult();
	}

	@Override
	public List<Course> findByIdTeacher(Long idTeacher) {
		// TODO Auto-generated method stub
		return getSession().createQuery("FROM Course c join ").list();
	}

}
