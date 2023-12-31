package com.company.stackQueue;

public class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;

    int ptr = -1;

    public CustomStack(){
        this(DEFAULT_SIZE);
    }


    CustomStack(int size){
        this.data = new int[size];
    }

    public boolean push(int item){
        if(isFull()){
            System.out.println("stack is full");
        }
        ptr++;
        data[ptr] = item;
        return true;

    }
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Cannot pop from an empty stack");

        }
//        int removed = data[ptr];
//        ptr--;
        return data[ptr--];

    }

    public int peek() throws StackException{
        if(isEmpty()){
            throw new StackException("stack is empty");

        }
        return data[ptr];
    }
    public boolean isFull() {
        return ptr == data.length-1;
    }
    private boolean isEmpty(){
        return ptr == -1;
    }
}
