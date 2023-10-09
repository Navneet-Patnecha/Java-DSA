package com.company.stackQueue;

public class QueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(5);
        queue.insert(5);
        queue.insert(12);
        queue.insert(22);
        System.out.println(queue.front());
        queue.display();
    }
}
