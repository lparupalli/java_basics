package com.lalitha.dataStructures;
 public class LinkedList {

    private Node head;

    //used to insert node at start of linked list
    public void insertFirst(int data) {
        Node newNode = new Node(data);
        newNode.data = data;
        newNode.next = head;
        head = newNode;
    }
    public Node deleteFirst(Node node){
        Node temp = head;
        head = head.next;
        return temp;
    }

}

class Node {
    int data;
    Node next;
     Node(int data){
        this.data = data;
        this.next = null;
    }
}
