package com.navneet.Linked_List;

public class LL {

    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size = 0;
    }
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }

        public Node(int value , Node next)
        {
            this.value = value;
            this.next = next;
        }
    }
     //  TO INSERT AT FIRST POSITION
    public void InsertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size += 1;
    }

    // TO INSERT AT LAST POSITION
    public void InsertLast(int val){
        if(tail == null){
            InsertFirst(val);
            return;
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    // INSERTING AT PARTICULAR INDEX
    public void insert(int val , int index){
        if(index == 0){
            InsertFirst(val);
            return;
        }
        if(index == size - 1){
            InsertLast(val);
            return;
        }
        Node temp = head;
        for(int i =1 ; i < index ; i++){
            temp = temp.next;
        }
        Node node = new Node(val , temp.next);
        temp.next = node;
        size++;

    }

    //DELETING FIRST
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if (head == null) {

            tail = null;
        }
        size -= 1;
        return val;
    }

    public void display(){
        Node temp = head;
        while(temp!= null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }


}
