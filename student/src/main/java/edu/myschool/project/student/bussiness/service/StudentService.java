package edu.myschool.project.student.bussiness.service;

import java.util.List;

import edu.myschool.project.student.pojo.Student;

public interface StudentService {
	
	Student getFisrtStudent();
	
	List<Student> getAllMaleStudent();
	List<Student> getAllFemaleStudent();

}