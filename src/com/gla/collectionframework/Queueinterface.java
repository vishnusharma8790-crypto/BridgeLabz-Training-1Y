package com.generics;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queueinterface {
    public  static void main(String[] args) {
        Queue<String> q = new LinkedList<>();
        // We can follow all method beside it
        Queue<String> q1 = new ArrayDeque<>();

// priorityqueue

        PriorityQueue<String> p = new PriorityQueue<>();
        // ye peek value me sabse minimum value ko first pe rakhta h
        p.add("5");
        p.add("6");
        p.add("4");
        p.add("3");
        p.add("9");
        System.out.println(p);
        System.out.println(p.peek());
        p.poll();
        System.out.println(p);
        // offer and add both are same
        // pop means remove top most value
        // peek means the value present in top most
        //add and offer means add the value
        // remove and poll means delete the value
        q.add("1");
        q.add("2");
        q.offer("3");
        q.offer("4");
        System.out.println("the elements are " +q);
        System.out.println("the top most value is " +q.peek());

        System.out.println(q.element());
        q.remove();
       // q.poll();
        System.out.println("  after  removing  the value is " + q);
        System.out.println("the size is " +q.size());


    }
}
