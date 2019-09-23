package com.example;

import java.util.ArrayList;
import java.util.List;

public class Example3 {
    public static void main(String[] args) {
        List<String> newArrayList;
        List<String> myList = new ArrayList<String>();
        myList.add("Laptop");
        myList.add("Book");
        myList.add("Hat");
        myList.add("Ring");

        //Before Java SE 8
        for(int i  = 0; i < myList.size(); i++){
            System.out.println(myList.get(i));
        }

        for (String item : myList){
            System.out.println(item);
        }

        //Jva SE 8 +
        myList.forEach(item -> System.out.println(item));
    }

}
