package edu.handong.csee.java.exmple.collections.linkedlist;

import java.util.ArrayList;
import java.util.Comparator;

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
	
		// Sort
		ArrayList<String> srotedList = strList.sort(new StringComparator());
		System.out.println("==Sorted===");
		for(String value:srotedList) {
			System.out.println(value);
		}
		
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		for(int i = 0; i < 5 ; i++) {
			numberList.addANodeToStart(i);
		}
		numberList.deleteHeadNode();
		numberList.deleteTailNode();
		numberList.addANodeToTail(3);
		numberList.showList();
	}
}

class StringComparator implements Comparator<String> {
    @Override
    public int compare(String a, String b) {
        return a.compareToIgnoreCase(b);
    }
}