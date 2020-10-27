package com.models;

import java.util.ArrayList;

public class Queue<T> {
    private int maxSize;
    private ArrayList<T> queue;
    public Queue(int size) {

    }
    public void enQueue(T value) {
        queue = new ArrayList<T>();
        queue.add(value);
    }
    public T deQueue() {
        System.out.println("Size of queue "+queue.size());
        if(queue.size()==0){
            System.out.println("Size Empty");
            return null;
        }else{
            return queue.get(queue.size()-(queue.size()-1));
        }
    }

    @Override
    public String toString() {
        return "Queue{" +
                "maxSize=" + maxSize +
                ", queue=" + queue +
                '}';
    }
}
