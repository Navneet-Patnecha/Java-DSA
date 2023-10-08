package com.company.stackQueue;

import java.util.LinkedList;
import java.util.Queue;

public class InBuiltQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(12);
        queue.add(3);
        queue.add(56);
        queue.add(7);

        System.out.println(queue.size());
        System.out.println(queue.peek());
        System.out.println(queue.remove());

    }
}
