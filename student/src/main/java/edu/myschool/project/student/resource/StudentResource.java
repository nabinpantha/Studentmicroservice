package edu.myschool.project.student.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.myschool.project.student.bussiness.service.StudentService;
import edu.myschool.project.student.pojo.Student;

@RestController
@RequestMapping("student/")
public class StudentResource {
	
	@Autowired
	private StudentService studentService;
	
	
	@RequestMapping("getFirstStudent")
	public Student getFirstStudent() {
		
		Student student = studentService.getFisrtStudent();
		
		return student;
	}
	
	
	@RequestMapping("getMaleStudent")
	public List<Student> getMaleStudent() {
		
		List<Student> maleStudentList = studentService.getAllMaleStudent();
		
		return maleStudentList;
	}
	@RequestMapping("getFemaleStudent")
	public List<Student> getFemaleStudent() {
		
		List<Student> femaleList = studentService.getAllFemaleStudent();
		
		return femaleList;
	}
}
