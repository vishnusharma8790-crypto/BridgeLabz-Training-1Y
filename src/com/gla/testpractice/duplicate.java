package testpractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class duplicate {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(6);
        list.add(7);
        System.out.println("orignal array : " +list);

        Set<Integer> set = new HashSet<>(list);


        ArrayList<Integer> newList = new ArrayList<>(set);

        System.out.println("After Removing Duplicates: " + newList);
    }

    }

