package com.navneet.Linked_List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LL list = new LL();
        list.InsertFirst(3);
        list.InsertFirst(8);
        list.InsertFirst(2);
        list.InsertFirst(5);
        list.InsertFirst(2);
        list.InsertLast(99);
        list.insert(88,4);
        System.out.println(list.deleteFirst());
        list.display();

    }
}
