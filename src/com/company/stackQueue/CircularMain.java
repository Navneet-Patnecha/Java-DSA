package com.company.stackQueue;

public class CircularMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.insert(5);
        queue.insert(12);
        queue.insert(12);
        queue.insert(3);
        queue.insert(52);
        queue.display();

    }
}
