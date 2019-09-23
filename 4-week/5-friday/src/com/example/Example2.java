package com.example;

interface HelloWorld{
    public void greet(String first, String last);
}
public class Example2 {
    public static void main( String[] args){
        HelloWorld exampleLambda = (String f, String l) -> {
            System.out.println("Welcome " + f +" " + l);
        };
        exampleLambda.greet("John", "Smith");
        exampleLambda.greet("Mike", "Hawk");
    }
}
