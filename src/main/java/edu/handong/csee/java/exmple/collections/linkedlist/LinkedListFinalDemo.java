package edu.handong.csee.java.exmple.collections.linkedlist;

import java.util.ArrayList;

public class LinkedListFinalDemo {

	public static void main(String[] args) {
		LinkedListFinalDemo demonstrator = new LinkedListFinalDemo();
		demonstrator.run();
	}

	private void run() {
		LinkedList<String> strList = new LinkedList<String>();
		strList.addANodeToStart("Hello");
		strList.addANodeToStart("Good-bye");
		strList.addANodeToStart("Zoo");
		strList.showList();
		
		ArrayList<String> sortedList = strList.sort(new StringComparator());
		System.out.println("==Sorted===");
		for(String value : sortedList) {
			System.out.println(value);
		}
		
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		for(int i=0 ; i<5 ; i++) {
			numberList.addANodeToStart(i);
		}
		numberList.deleteHeadNode();
		numberList.deleteTailNode();
		numberList.addANodeToTail(3);
		numberList.showList();
	}
}
