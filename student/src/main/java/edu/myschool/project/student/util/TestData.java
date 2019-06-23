package edu.myschool.project.student.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import edu.myschool.project.student.pojo.Address;
import edu.myschool.project.student.pojo.Course;
import edu.myschool.project.student.pojo.Student;

public class TestData {

public static List<Student> createStudentList() throws ParseException {
	
	List<Student> myList = new ArrayList<>();
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 

	
	//Date date1 = formatter.parse("12/10/2001");
	Student student1 = new Student();
	student1.setId(1);
	student1.setDob(formatter.parse("1/10/2001"));
	student1.setName("Ram Kafle");
	student1.setSex('M');
	
	
	Address address1 = new Address();
	address1.setStreet("corona");
	address1.setCity("coro");
	address1.setPostalCode(11368);
	address1.setCountry("USA");	
	
	student1.setAddress(address1);
	
	
	
	Course course1= new Course();
	course1.setCourseName("Physics");
	course1.setCourseId(1213);
	course1.setProfessorName("Hari");
	course1.setCourseCredit(3);
	
	
	List<Course> courseList = new ArrayList<Course>();
	
	courseList.add(course1);
	
	student1.setCourseList(courseList);
	
	myList.add(student1);
	
	Student student2 = new Student();
	student2.setId(2);
	student2.setDob(formatter.parse("2/10/2001"));
	student2.setName("Raju Hari");
	student2.setSex('M');
	
	Address address2 = new Address();
	address2.setStreet("corona");
	address2.setCity("coro");
	address2.setPostalCode(11368);
	address2.setCountry("USA");
	
	
	
	student2.setAddress(address2);
	
	Student student3 = new Student();
	student3.setId(3);
	student3.setDob(formatter.parse("3/10/2001"));
	student3.setName("musi");
	student3.setSex('F');
	
	Address address3 = new Address();
	address3.setStreet("tex");
	address3.setCity("texas");
	address3.setPostalCode(114538);
	address3.setCountry("USA");
	
	
	
	student3.setAddress(address3);
	
	Student student4 = new Student();
	student4.setId(4);
	student4.setDob(formatter.parse("4/10/2001"));
	student4.setName("sari");
	student4.setSex('F');
	
	Address address4 = new Address();
	address4.setStreet("campa");
	address4.setCity("california");
	address4.setPostalCode(116768);
	address4.setCountry("USA");
	
	
	
	student4.setAddress(address4);
	
	
	Student student5 = new Student();
	student5.setId(5);
	student5.setDob(formatter.parse("5/10/2001"));
	student5.setName("mari");
	student5.setSex('F');
	
	Address address5 = new Address();
	address5.setStreet("corona");
	address5.setCity("coro");
	address5.setPostalCode(11368);
	address5.setCountry("USA");
	
	
	
	student5.setAddress(address5);
	myList.addAll(Arrays.asList(student2,student3,student4,student5));
	
	
	
	return myList;
	
}
public static List<Student> createStudentListWithIdenticalValues() throws ParseException{
	List<Student> myIdenticalList = new ArrayList<>();
	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); 
	Student student1 = new Student();
	student1.setId(1);
	student1.setDob(formatter.parse("1/10/2001"));
	student1.setName("Ram Kafle");
	student1.setSex('M');
	
	
	myIdenticalList.add(student1);
	
	
	Student student2 = new Student();
	student2.setId(1);
	student2.setDob(formatter.parse("1/10/2001"));
	student2.setName("Ram Kafle");
	student2.setSex('M');
	myIdenticalList.add(student2);
	return myIdenticalList;
}


}

