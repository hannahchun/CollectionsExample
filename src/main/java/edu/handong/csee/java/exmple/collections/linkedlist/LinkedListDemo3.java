package edu.handong.csee.java.exmple.collections.linkedlist;

public class LinkedListDemo3 {
	
	public static void main(String[] args) {
		LinkedListDemo3 demonstrator = new LinkedListDemo3();
		demonstrator.run();
	}
	
	private void run() {
		StringLinkedListWithIterator list3 = new StringLinkedListWithIterator();
		list3.addANodeToStart("Five");
		list3.addANodeToStart("Three");
		list3.addANodeToStart("Two");
		list3.addANodeToStart("One");
		System.out.println("List has " + list3.length() + " entries");
		
		list3.showList();
		
		System.out.println();
		
		list3.resetIteration();
		list3.goToNext();
		list3.goToNext();
		list3.getDataAtCurrent();
		list3.insertNodeAfterCurrent("four");
		list3.goToNext();
		list3.setDataAtCurrent("Four");
		list3.showList();
		
		System.out.println();
		
		list3.deleteCurrentNode();
		list3.showList();
		
		System.out.println();
		
		System.out.println("Convert list to Array: "); 
		for(String s: list3.toArray()) {
			System.out.println(s);
		}
	}
}
