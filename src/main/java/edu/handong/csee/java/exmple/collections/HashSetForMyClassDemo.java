package edu.handong.csee.java.exmple.collections;

import java.util.HashSet;

public class HashSetForMyClassDemo {

	public static void main(String[] args) {
		HashSetForMyClassDemo demonstrator = new HashSetForMyClassDemo();
		demonstrator.run();
	}

	private void run() {
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("19800821", "JC Nam"));
		students.add(new Student("19800822", "JC Yoon"));
		students.add(new Student("22000999", "YH Park"));

		printSet(students);
		
		System.out.println("One student removing: 19800821 JC");
		students.remove(new Student("19800821", "JC"));
		printSet(students);
		
		System.out.println("Set contains 22000999: " + students.contains(new Student("22000999", "YH Park")));
		System.out.println("Set contains 19800821: " + students.contains(new Student("19800821", "JC Nam")));
		
	}

	private void printSet(HashSet<Student> students) {
		System.out.println("The set contains");
		for(Student student: students) {
			System.out.println("Student ID: " + student.getStudentID() + "\n" +
								"Name: " + student.getName());
		}
		System.out.println();
	}
}
