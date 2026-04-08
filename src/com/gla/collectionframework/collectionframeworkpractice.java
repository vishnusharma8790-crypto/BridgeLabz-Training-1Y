package com.generics;

import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;

public class collectionframeworkpractice {
   public  static void main(String[] args) {
        LinkedList<Integer> l1 = new  LinkedList<>();
        Vector<Boolean> vector = new Vector();
       Stack<Integer> st = new Stack<>();
       // stack hAVE five operation

       st.push(1);
       st.push(2);
       st.push(3);
       st.push(4);
       System.out.println("all the value of stack" +st);
       st.pop();
       System.out.println("the uppermost value out" +st);
       //st.peek();
       System.out.println("uppermost value :" +st.peek());
       System.out.println( "the size of stack "+st.size());
       System.out.println("true or false : "+st.isEmpty());

       //linkedlist
       l1.add(11);
       l1.add(12);
       l1.add(13);
       System.out.println( "adding number in linkedlist : "+l1);
       l1.set(0,90);
       System.out.println(" index pe number changeb  karna : " +l1);

       // Addall ek collection me dusre collection ko add karna
       LinkedList<Integer> l = new LinkedList<>();
       l.add(1);
       l.add(2);
       l.add(3);
       l1.addAll(l);
       System.out.println(l1);
   }




}
