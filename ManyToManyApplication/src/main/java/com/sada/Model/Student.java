package com.sada.Model;

import java.util.Set;

public class Student {
	
	private int studentId;
	private String studentName;
	private String studentGrp;
	
	private Set course;
	
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getStudentGrp() {
		return studentGrp;
	}
	public void setStudentGrp(String studentGrp) {
		this.studentGrp = studentGrp;
	}
	public Set getCourse() {
		return course;
	}
	public void setCourse(Set course) {
		this.course = course;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentGrp,
			Set course) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentGrp = studentGrp;
		this.course = course;
	}
	public Student(int studentId) {
		super();
		this.studentId = studentId;
	}
}
