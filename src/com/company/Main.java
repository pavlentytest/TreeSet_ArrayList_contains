package com.company;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        for(int i=0;i<100000;i++) {
            arrayList.add(i);
            treeSet.add(i);
        }

        long startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            arrayList.contains(i);
        }
        long endTime = System.nanoTime();
        long elapsed = endTime - startTime;
        System.out.println("ArrayList Contains: "+elapsed);
        startTime = System.nanoTime();
        for(int i=0;i<100000;i++) {
            treeSet.contains(i);
        }
        endTime = System.nanoTime();
        elapsed = endTime - startTime;
        System.out.println("TreeSet Contains:   "+elapsed);

         /*
        TreeSet<String> states = new TreeSet<>();
        states.add("Germany");
        states.add("USA");
        states.add("Russia");
        states.add("Australia");
        states.add("USA");

        for(String s: states) {
            System.out.print(s + " ");
        }
*/
        //Set<String> sdfsadfsdf = new Set<String>();
    }
}
