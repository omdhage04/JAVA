package com.Student.info;
public class Student {
	
	private int StudentId;
	private String studentName;
	private String studentNumber;
	private String studentCity;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentId, String studentName, String studentNumber, String studentCity) {
		super();
		StudentId = studentId;
		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.studentCity = studentCity;
	}
	public Student(String studentName,String studentNumber,String studentCity) {
		super();

		this.studentName = studentName;
		this.studentNumber = studentNumber;
		this.studentCity = studentCity;
	}
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	@Override
	public String toString() {
		return "Student [StudentId=" + StudentId + ", studentName=" + studentName + ", studentNumber=" + studentNumber
				+ ", studentCity=" + studentCity + "]";
	}
	public String getStudentNumber() {
		return studentNumber;
	}
	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentCity() {
		return studentCity;
	}
	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}
	public Student(int studentId) {
		super();
		StudentId = studentId;
	}

}
