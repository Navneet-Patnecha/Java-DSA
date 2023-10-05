package com.navneet.Linked_List;

public class Circular_LL {
    private Node head;
    private Node tail;



    private class Node{
        private int value;
        private Node next;


        public Node(int value){
            this.value = value;
        }
    }

    //Inserting the value
    public void Insert(int value){
        Node node = new Node(value);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        node.next = head;
        tail.next = node;
        tail = node;

    }

    //displaying the content of circular linked list
    public void display(){
        Node temp = head;
        if(head != null){
            do{
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            }while(temp != head);
        }
        System.out.println("head");
    }


    //deletion in circular linked list
    public void delete(int value){
        Node node = head;
        if(node == null)
        {
            return;
        }
        if(node.value == value){
            head = head.next;
            tail.next = head;
            return;
        }
        do{
            Node n = node.next;
            if(n.value == value){
                node.next = n.next;
                break;
            }
            node = node.next;

        }while(node!= head);

    }

}
