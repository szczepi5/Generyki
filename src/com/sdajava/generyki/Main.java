package com.sdajava.generyki;
import java.util.*;

public class Main {

    public static <E> void printArray(E[] inArray){

        for(E value: inArray)

            System.out.println(value);
        }

        public static <E> void printList(List<E> myList){

            for(E value: myList){
                System.out.println(value);
            }
        }

    public static  void main(String[] args) {


        Integer[]intArray ={1,5,3,4,5,6};
        Double[]doubleArray = {1.,2.,3.,4.,3.,2.,3.,45.23};
        Character[]charArray = {'s','d','f','g','t','d'};

        printArray(intArray);
        printArray(doubleArray);
        printArray(charArray);

        List<Integer> intList = new ArrayList<Integer>();

        intList.add(2);
        intList.add(21);
        intList.add(32);

        List<String>stringList = new ArrayList<String>();

        stringList.add("czesc");
        stringList.add("yoyoy");
        stringList.add("heyhey");

        printList(stringList);
        printList(intList);


	// write your code here
    }
}
