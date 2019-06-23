package singlyLinkedList;

import java.util.List;

public class SinglyLinkedList {
    public Node head;
    public SinglyLinkedList() {
        // your code here
    	this.head = null;
    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(head == null) {
            head = newNode;
        } else {
            Node runner = head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
        }
    }
    
    // Print
    public void printValues() {
    	Node runner = head;
    	for (runner = head; runner != null; runner = runner.next) {
    		System.out.println(runner.value);
    	}
    }
    
    // Remove
    public void remove() {
    	Node secondToLast = head; // set value to null
    	while(secondToLast.next.next != null) { 
    		secondToLast = secondToLast.next;
    	}
    	secondToLast.next = null;
    	
    }
    
    public void removeVal(int value) {
    	Node remove = head; 
    	Node temp = null;
    	if (remove != null && remove.value == value) {
    		head = remove.next;
    	}
    	while(remove != null && remove.value != value) {
    		temp = remove;
    		remove = remove.next;
    	}
    	if (remove == null)return;
    	temp.next = remove.next;
    }
}
    
