package com.navneet.Linked_List;

public class CLL_main {
    public static void main(String[] args) {
        Circular_LL list = new Circular_LL();
        list.Insert(19);
        list.Insert(20);
        list.Insert(21);
        list.Insert(122);
        list.Insert(12);
        list.display();
        list.delete(19);
        list.display();
        list.delete(122);
        list.display();


    }
}
