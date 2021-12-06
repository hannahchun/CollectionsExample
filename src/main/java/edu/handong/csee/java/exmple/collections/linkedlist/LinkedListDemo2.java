package edu.handong.csee.java.exmple.collections.linkedlist;

public class LinkedListDemo2 {
	
	public static void main(String[] args) {
		LinkedListDemo2 demonstrator = new LinkedListDemo2();
		demonstrator.run();
	}
	
	private void run() {
		StringLinkedListSelfContained list2 = new StringLinkedListSelfContained();
		list2.addANodeToStart("One");
		list2.addANodeToStart("Two");
		list2.addANodeToStart("Three");
		System.out.println("List has " + list2.length() + " entries");
		
		list2.showList();
		
		if(list2.onList("Three"))
			System.out.println("Three is on list");
		else
			System.out.println("Three is NOT on list");
		
		//list2.deleteHeadNode();
		//list2.deleteHeadNode();
		System.out.println("Start of list: ");
		list2.showList();
		System.out.println("End of list: "); 
		
		System.out.println("Convert list to Array: "); 
		for(String s: list2.toArray()) {
			System.out.println(s);
		}
	}
}
