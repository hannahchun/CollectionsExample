package edu.handong.csee.java.exmple.collections;

public class Student implements Comparable<Student>{
	private String studentID;
	private String name;
	
	public Student(String id, String name) {
		setStudentID(id);
		setName(name);
	}

	public void setName(String name) {
		this.name=name;
	}

	public void setStudentID(String studentID) {
		this.studentID=studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	@Override 
	public int hashCode() {
		return studentID.hashCode();
	}
	
	@Override 
	public boolean equals(Object obj) {
		Student studentToCompare = (Student) obj;
		
		if(this.getStudentID().equals(studentToCompare.getStudentID()))
			return true;
		else
			return false;
	}
	
	@Override 
	public int compareTo(Student student) {
		return this.getStudentID().compareTo(student.getStudentID());
		/*
		int compareResults = this.getStudentID().compareTo(student.getStudentID());
		if(compareResults>0)
			return 1;
		else if(compareResults<0)
			return -1;
		return 0; */
	}
}
