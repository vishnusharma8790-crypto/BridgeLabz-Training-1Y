package com.generics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class collectionframeworkprobleum {
     public static void main(String[] args) {
        List l = new ArrayList();
        List a = new LinkedList();
        List b =  new Vector();

        l.add(4);
        l.add(7);
        l.add("string");
        l.add("ch");
         System.out.println(l);


         //creating array list
         ArrayList<String> al = new ArrayList<>();
         System.out.println("Array list "+al);
         al.add("same");
         al.add("kuch");
         al.add("bhi");
         System.out.println(al);

         System.out.println("using simple for loop");
         for(int i= 0;i<al.size();i++){
             System.out.println(al.get(i));
         }
         // using each for loop
         System.out.println("using for each loop");

         for(String s :al){
             System.out.println(s);
         }
         ArrayList<String> al2 = new ArrayList<>();
         al2.add("3");
         al2.add("4");
         al2.add("5");
         al2.add("6");
         System.out.println(al2);

         // add all method
         al.addAll(al2);
         System.out.println("adding all element in al : " +al);



    }
}
