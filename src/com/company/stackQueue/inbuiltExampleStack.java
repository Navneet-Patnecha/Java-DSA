package com.company.stackQueue;

import java.util.Stack;

public class inbuiltExampleStack {

    public static void main(String[] args) {
	// write your code here
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(10);

        stack.push(11);
        stack.push(11);
        System.out.println(stack.pop());


    }
}
