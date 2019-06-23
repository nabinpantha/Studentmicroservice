package edu.myschool.project.student.bussiness.service.impl;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import edu.myschool.project.student.bussiness.service.StudentService;
import edu.myschool.project.student.pojo.Student;
import edu.myschool.project.student.util.TestData;

@Service
public class StudentServiceImpl implements StudentService {

	@Override
	public Student getFisrtStudent() {
		List<Student> myStudentList = new ArrayList<>();
		try {
			myStudentList = TestData.createStudentList();
		} catch (ParseException e) {
			System.out.println("Parsed Exception caught " + e.getMessage());
		}

		// to print the first student

		System.out.println("THE first student in the list is as follows : \n" + myStudentList.get(0));

		return myStudentList.get(0);
	}

	@Override
	public List<Student> getAllMaleStudent() {
		List<Student> myStudentList = new ArrayList<>();
		try {
			myStudentList = TestData.createStudentList();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		List<Student> maleStudent = new ArrayList<>();

		for (Student student : myStudentList) {
			if (student.getSex() == 'M') {
				maleStudent.add(student);
			}
		}
		return maleStudent;
	}

	@Override
	public List<Student> getAllFemaleStudent() {
		List<Student> myStudentList = new ArrayList<>();
		try {
			myStudentList = TestData.createStudentList();
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		List<Student> femaleList = new ArrayList<>();
		for(Student student : myStudentList) {
			if(student.getSex()== 'F') {
				femaleList.add(student);
			}
		}
		return femaleList;
	}

}
