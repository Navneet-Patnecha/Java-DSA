package com.navneet.Linked_List;

public class DLL_Main {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.InsertFirst(12);
        list.InsertFirst(13);
        list.InsertFirst(14);
        list.InsertFirst(18);
        //list.display();
        list.InsertLast(19);
       // list.display();
        list.Insert(3,100);
        list.display();


    }

}
