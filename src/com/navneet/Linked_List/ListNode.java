package com.navneet.Linked_List;
// removing nth noe from last , leet code medium question
 //Definition for singly-linked list.
 public class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null){
            return null;
        }


        ListNode temp = head;

        int size = 0;
        while(temp  != null){
            size++;
            temp = temp.next;
        }
        if(n == size){
            return head.next;
        }
        ListNode prev = head;
        int i =1 ;
        int IndexToSearch = size - n;
        while(i < IndexToSearch){
            prev =prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;


    }
}
