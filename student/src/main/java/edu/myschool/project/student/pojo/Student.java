package edu.myschool.project.student.pojo;

import java.util.Date;
import java.util.List;

public class Student {
	private int id;
	private String name;
	private Date dob;
	private char sex;
	private Address address;
	public Address getAddress() {
		return address;
	}
	private List<Course> courseList;
	public List<Course> getCourseList() {
		return courseList;
	}
	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", dob=" + dob + ", sex=" + sex + ", address=" + address
				+ ", courseList=" + courseList + "]";
	}
	
	
	
	
}
