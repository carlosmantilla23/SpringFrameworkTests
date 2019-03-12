package com.carlosmantilla.profesoresplatzi.dao;

import java.util.List;

import com.carlosmantilla.profesoresplatzi.model.Teacher;


public interface TeacherDAO {
	
	void saveTeacher (Teacher teacher);
	
	List<Teacher> findAllTeachers();
	
	void updateTeacher (Teacher teacher);
	
	void deleteTeacherById (Long idTeacher);
	
	Teacher findById (Long idTeacher);
	
	Teacher findByName (String name);
 

}
