package edu.handong.csee.java.exmple.collections.linkedlist;

import java.util.Comparator;

public class StringComparator implements Comparator<String>{
	public int compare(String a, String b) {
		return a.compareToIgnoreCase(b);
	}
	//if a is smaller than b (아스키 코드 상 번호가 앞에) 
	//-> return negative value
	
}
