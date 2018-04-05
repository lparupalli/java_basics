package com.lalitha.dataStructures;

  class Node1{
    int data;
    Node next;
    public Node1(int key){
        data = key;
        next = null;
    }

}
class LinkedList1{
    Node first;
    public LinkedList1(){
        first = null;
    }
    public void insert(int i){
        Node newNode = new Node(i);
        newNode.next = first;
        first = newNode;
    }
    public Node delete(){
        Node temp;
        temp = first;
        first = first.next;
        return temp;
    }
    public void displayNode(int data){
        System.out.println("item"+ data);
    }
    public void display() {
        System.out.println("here is the linked list");

        Node current = first;
        while (current != null){
            //current.displayNode();
        current = current.next;
    }
        System.out.println(" ");
    }

}
class  Stack1{
    private LinkedList1 listObj;
    public Stack1(){
        listObj = new LinkedList1();
    }
    public void push(int i){
        listObj.insert(i);
    }
    public Node pop(){
        return listObj.delete();
    }
    public void displayStack(){
        System.out.println("stack:");
        listObj.display();
    }


}