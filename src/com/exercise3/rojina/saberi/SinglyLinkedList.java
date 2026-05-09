package com.exercise3.rojina.saberi;

public class SinglyLinkedList {

    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    // insert
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // display list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // check if list is empty
    public void delete(int i) {

        if (head == null) {
            System.out.println("List is empty. Node does not exist.");
            return;
        }

        // delete head (i = 0)
        if (i == 0) {
            head = head.next;
            System.out.println("Node at index 0 deleted.");
            return;
        }

        Node temp = head;
        int count = 0;

       
        while (temp != null && count < i - 1) {
            temp = temp.next;
            count++;
        }

        // if node doesn't exist
        if (temp == null || temp.next == null) {
            System.out.println("Node at index " + i + " does not exist.");
            return;
        }

        // delete node
        temp.next = temp.next.next;
        System.out.println("Node at index " + i + " deleted.");
    }


    // Main method for testing
    public static void main(String[] args) {

    	 // Student Number: 301533334
        // Full Name: Rojina Saberi


        SinglyLinkedList list = new SinglyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);
        list.insert(50);

        System.out.println("Original List:");
        list.display();

        list.delete(2);   // delete 30
        list.display();

        list.delete(0);   // delete 10
        list.display();

        list.delete(10);  // invalid index
        list.display();
    }
}