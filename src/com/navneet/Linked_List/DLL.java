package com.navneet.Linked_List;

public class DLL {
    private Node head;
    // Node tail;
    private int size;

    public DLL() {
        this.size = 0 ;
    }


    private class Node{
       private int value;
       private Node next;
       private Node prev;


        public Node(int value){
            this.value = value;
        }
        public Node(int value , Node next , Node prev){
            this.value = value ;
            this.next = next;
            this.prev = prev;
        }
    }

    //Inserting a Node
    public void InsertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

    }

    //for displaying
    public void display(){
        Node temp = head;
        Node last = null;
        while(temp != null){
            System.out.print(temp.value + " ->");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println("Printing in reverse");
        while(last != null){
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.print("NULL");
    }

    public void InsertLast(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            node.prev = null;
            //node.next = null;
            return;
        }
        Node last = head;
        while(last.next != null){
            last = last.next;
        }
        node.next = null;
        last.next = node;
        node.prev = last;
        last = node;
    }
    //this function returns the node of previous node of the index
    public Node get(int index){
        Node node = head;
        for(int i = 0; i<index ; i++){
            node = node.next;
        }
        return node;

    }
    public void Insert(int after , int value){
        Node P = get(after);
        if(P == null){
            System.out.println("does not exists");
        }
        Node node = new Node(value);
        node.next = P.next;
        P.next = node;
        node.prev = P;
        if(node.next == null) {
            node.next.prev = node;
        }
        size++;

    }


}
