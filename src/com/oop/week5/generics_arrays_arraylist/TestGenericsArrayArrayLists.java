package com.oop.week5.generics_arrays_arraylist;

import com.models.Queue;

public class TestGenericsArrayArrayLists {
    public static <T> void main(String[] args) {
        Queue newQueue = new Queue(5);
        newQueue.enQueue("a");
        newQueue.enQueue("b");
        newQueue.enQueue("c");
        newQueue.enQueue("e");
        newQueue.enQueue("f");
        System.out.println((T) newQueue.toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.deQueue().toString());
        System.out.println((T) newQueue.toString());
    }
}

