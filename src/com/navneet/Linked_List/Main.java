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
        list.insert(11,6);
        list.display();
//        System.out.println(list.delete(3));
//        System.out.println();
//        list.display();
//        int value = 88;
//        System.out.println(value);
//        System.out.println("found at index value = " + list.find(value));
        list.insertRec(12,2);
        list.display();

    }
}
