package com.company.stackQueue;

import java.util.ArrayDeque;

public class Deque {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.addFirst(34);
        deque.offerFirst(45);
    }
}
