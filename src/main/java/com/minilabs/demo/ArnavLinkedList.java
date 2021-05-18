package com.minilabs.demo;

import java.util.LinkedList;
public class ArnavLinkedList {
    public static void main(String[] args) {

        LinkedList Arnav = new LinkedList();

        Arnav.add("JFK");
        Arnav.add("RFK");
        Arnav.add("Ted Kennedy");
        Arnav.add("Franklin Roosevet");
        printthis(Arnav);
        System.out.println("Wait");
        removeStuff(Arnav, 3, 4);
        System.out.println("Wait");
        printthis(Arnav);
        System.out.println(Arnav.getFirst());


    }


    private static void removeStuff(LinkedList<String> x, int from, int to) {

        x.subList(from, to).clear();
    }

    private static void printthis(LinkedList<String> x) {

        for (String y : x) {
            System.out.printf("%s", y);
            System.out.println();
        }
    }
}

