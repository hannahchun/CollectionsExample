package edu.handong.csee.java.exmple.collections;

public class Student {

	private String studentID;
	private String name;
	
	public Student(String id, String name) {
		setStudentID(id);
		setName(name);
	}
	
	public String getStudentID() {
		return studentID;
	}
	
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return studentID.hashCode(); // saved in the same memory bucket when they are same.
	}

	@Override
	public boolean equals(Object obj) {
		
		Student studentToCompare = (Student) obj;
		
		if(this.getStudentID().equals(studentToCompare.getStudentID()))
			return true;
		
		return super.equals(obj);
	}
	
}
