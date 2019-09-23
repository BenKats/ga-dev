package com.example;

import java.util.HashMap;
import java.util.Map;

public class Example4 {

    public static void main(String[] args) {
        Map<String, String> sportMap = new HashMap<String, String>();
        sportMap.put("C", "Cricket");
        sportMap.put("F", "Football");
        sportMap.put("H", "Hockey");

        String[] myList = {"C","F","H"};

        //pre SE8 method
        for (int i = 0; i < sportMap.size(); i++){
            System.out.println(sportMap.get(myList[i]));
        }

        //Simpler method for each
        for (String key: sportMap.keySet()){
            String value = sportMap.get(key);
            System.out.println(key + " " + value);
        }

        //Suresh Method for each
        for (Map.Entry<String, String> entry : sportMap.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        //SE8 Lambda for each
        sportMap.forEach((k,v) -> System.out.println(k + " " + v));
    }
}
