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
		students.add(new Student("22000999", "YH Park"));
		students.add(new Student("19800821", "JC Nam"));
		students.add(new Student("19800822", "JC Yoon"));
		
		printSet(students);
		
		//The name is different, but the student ID exists --> returns true
		//Because the student class was defined in that way
		//the hashCode() and equals(Object obj) decides whether two instances are the same or not according to the student ID	
		System.out.println("Set contains 22000999 YH Park: " + students.contains(new Student("22000999", "YH Park")));
		System.out.println("Set contains 19800821 JC: " + students.contains(new Student("19800821", "JC")));
		
		System.out.println("\nOne student removed: 19800821 JC");
		students.remove(new Student("19800821", "JC"));
		printSet(students);
		
		System.out.println("Set contains 22000999 YH Park: " + students.contains(new Student("22000999", "YH Park"))); 
		System.out.println("Set contains 19800821 JC Nam: " + students.contains(new Student("19800821", "JC Nam")));
		System.out.println("Set contains 19800821 JC: " + students.contains(new Student("19800821", "JC")));
		
		//Sort data in studentID order
		
		//첫번째 방법
		//Use sort method in Collections framework - comparable interface
		List<Student> newListFromSet = new ArrayList<Student>(students);
		Collections.sort(newListFromSet); //sorts the list into ascending order
		System.out.println("\nSorted in ArrayList");
		printList(newListFromSet);
		
		//두번째 방법
		//Use sort method in Collections framework - comparator interface
		List<Student> newListFromSetDesc = new ArrayList<Student>(students);
		Collections.sort(newListFromSet,new StudentIDComparator()); //sorts the list into ascending order	
		System.out.println("\nSorted in ArrayList - desc");
		printList(newListFromSet);
		
		//세번째 방법
		//Sorting HashSet using TreeSet - comparable interface 
		TreeSet<Student> treeSet = new TreeSet<Student>(students);
		System.out.println("\nSorted in Set");
		printSet(treeSet);
		
		//네번째 방법 
		//Sorting HashSet using TreeSet - comparator interface 
		TreeSet<Student> treeSetDesc = new TreeSet<>(new StudentIDComparator());
		treeSetDesc.addAll(students);
		System.out.println("\nSorted in Set -desc");
		printSet(treeSetDesc);
	}

	private void printList(List<Student> students) {
		System.out.println("The set contains");
		for(Student student : students) {
			System.out.println("Student ID: " + student.getStudentID() + "\n" +
					"Name: " + student.getName());
		}
		System.out.println();
	}

	private void printSet(Set<Student> students) {
		System.out.println("The set contains");
		for(Student student : students) {
			System.out.println("Student ID: " + student.getStudentID() + "\n" + "Name" + student.getName());
		}
		System.out.println();
	}
	
	
}