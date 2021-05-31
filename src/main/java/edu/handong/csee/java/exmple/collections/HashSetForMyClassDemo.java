package edu.handong.csee.java.exmple.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class HashSetForMyClassDemo {

	public static void main(String[] args) {
		HashSetForMyClassDemo demonstrator = new HashSetForMyClassDemo();
		demonstrator.run();
	}

	private void run() {
		HashSet<Student> students = new HashSet<Student>();
		students.add(new Student("19800800", "JH Nam"));
		students.add(new Student("22000999", "YH Park"));
		students.add(new Student("19800821", "JC Nam"));
		students.add(new Student("19800822", "JC Yoon"));

		printSet(students);
		
		System.out.println("Set contains 22000999 YH Park: " + students.contains(new Student("22000999", "YH Park")));
		System.out.println("Set contains 19800821 JC: " + students.contains(new Student("19800821", "JC")));
		
		System.out.println("\nOne student removing: 19800821 JC");
		students.remove(new Student("19800821", "JC"));
		printSet(students);
		
		System.out.println("Set contains 22000999 YH Park: " + students.contains(new Student("22000999", "YH Park")));
		System.out.println("Set contains 19800821 JC Nam: " + students.contains(new Student("19800821", "JC Nam")));
		System.out.println("Set contains 19800821 JC: " + students.contains(new Student("19800821", "JC")));
		
		// https://www.geeksforgeeks.org/how-to-sort-hashset-in-java/
		List<Student> newListFromSet = new ArrayList<Student>(students);
		Collections.sort((List<Student>) newListFromSet);
		
		System.out.println("\nSorted in ArrayList");
		printList(newListFromSet);
		
		// Sorting HashSet using TreeSet
        TreeSet<Student> treeSet = new TreeSet<Student>(students);
		
        System.out.println("\nSorted in Set");
        printSet(treeSet);
		
	}

	private void printSet(Set<Student> students) {
		System.out.println("The set contains");
		for(Student student: students) {
			System.out.println("Student ID: " + student.getStudentID() + "\n" +
								"Name: " + student.getName());
		}
		System.out.println();
	}
	
	private void printList(List<Student> students) {
		System.out.println("The set contains");
		for(Student student: students) {
			System.out.println("Student ID: " + student.getStudentID() + "\n" +
								"Name: " + student.getName());
		}
		System.out.println();
	}
}
