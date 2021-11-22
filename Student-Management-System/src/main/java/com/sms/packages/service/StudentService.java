package com.sms.packages.service;

import java.util.List;

import com.sms.packages.entity.Student;

public interface StudentService {
	
	List<Student> getAllStudents();
	
	Student saveStudent(Student student);
	
	Student getStudentbyId(Long id);
	
	Student updateStudent(Student student);
	
	void deleteStudent(Long id);

}
