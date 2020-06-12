

import java.util.HashSet;

public class CondensedList {

	Node head;
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	public static void main(String[] args) {

		// creating SLL with inserting nodes and data
		CondensedList cdlist = new CondensedList();
		cdlist = insert(cdlist , 3);
		cdlist = insert(cdlist , 4);
		cdlist = insert(cdlist , 5);
		cdlist = insert(cdlist , 6);
		cdlist = insert(cdlist , 3);
		cdlist = insert(cdlist , 8);
		printList(cdlist);

		cdlist = removeduplicates(cdlist);
		System.out.println("After removing duplicate data in the CondensedList");
		printList(cdlist);
	}

	private static CondensedList removeduplicates(CondensedList cdlist) {
		
		// USing HashSet duplicates are removed from the list;
		
		HashSet<Integer> set = new HashSet<Integer>();
		
		Node ptr = cdlist.head;
		Node prev = null;
		while(ptr!=null)
		{
			if(set.contains(ptr.data))
			{
				prev.next = ptr.next;
				
			}
			else {
				set.add(ptr.data);
				prev = ptr;
			}
			ptr=ptr.next;
		}
		
		return cdlist;
	}

	private static void printList(CondensedList cdlist) {

		Node ptr = cdlist.head;
		while(ptr!=null)
		{
			System.err.print(ptr.data+" -> ");
			ptr=ptr.next;
		}
		System.err.println("null");
	}

	private static CondensedList insert(CondensedList cdlist, int i) {

		if(cdlist.head == null)
		{
			cdlist.head =new Node(i);
		}
		else
		{
			Node ptr = cdlist.head;
			
			while(ptr.next != null)
			{
				ptr= ptr.next;
			}
			ptr.next = new Node(i);
			return cdlist;
		}
		return cdlist;
	}

}