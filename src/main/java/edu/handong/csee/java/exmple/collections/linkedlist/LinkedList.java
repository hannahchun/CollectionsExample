package edu.handong.csee.java.exmple.collections.linkedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class LinkedList<D> {
	private ListNode head;
	private ListNode tail;
	
	public LinkedList() {
		head=null;
	}

	public int length() {
		int count = 0;
		ListNode position = head;
		while(position != null) {
			count++;
			position = position.getLink();
			//position=position.link; 도 가능
		}
		return count;
	}
	
	public void addANodeToStart(D addData) {
		if(length()<2)
			tail=head;
		head = new ListNode(addData, head);
	}
	
	//Inner class 
	//usable anywhere within definition of outer class
	//methods of inner and outer classes have access to each other's methods, instance variables
	
	private class ListNode{
		private D data;
		private ListNode link;
		
		public ListNode(D newData, ListNode linkedNode) {
			data = newData;
			link = linkedNode;
		}
		
		public D getData() {
			return data;
		}
		
		public ListNode getLink() {
			return link;
		}
		
	}

	public void showList() {
		ListNode position = head;
		while(position != null) {
			System.out.println(position.data);
			position = position.link;
		}
	}
	
	public ArrayList<D> toArrayList() {
		ArrayList<D> list = new ArrayList<D>(length());
		ListNode position = head;
		while(position !=null) {
			list.add(position.data);
			position=position.link;
		}
		return list;
	}
	
	public ArrayList<D> sort(Comparator<D> comparator) {
		ArrayList<D> list = toArrayList();
		Collections.sort(list, comparator);
		
		return list;
	}

	public void deleteHeadNode() {
		if(head != null) {
			head=head.link;
			if(head==null)
				tail=null;
		}
		else {
			System.out.println("Deleting from an empty list.");
			System.exit(0);
		}
	}

	public void deleteTailNode() {
		// Get previous node
		ListNode previous = getPreviousNode();
		tail=previous;
		previous.link=null;
	}

	private ListNode getPreviousNode() {
		ListNode current=head;
		ListNode previous=null;
		while(true) {
			if(current==tail)
				return previous;
			previous=current;
			current=current.link;
		}
	}

	public void addANodeToTail(D addData) {
		if(length()==0) {
			tail=new ListNode(addData, tail);
			head=tail;
		}
		else {
			tail.link=new ListNode(addData,tail.link);
		}
		
	}
	
}