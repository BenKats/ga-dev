package com.example;

//generall put the interface in its own file and have LabmdaExpressionDemo implement it
interface Compute{
    int operation(int a, int b);
}
public class LambdaExpressionDemo {
    public static void main(String[] args) {
        Compute add = (a,b) -> a + b;
        System.out.println("1 + 1= " + add.operation(1,1));

        Compute sub = (a,b) -> a - b;
        System.out.println("1 - 1= " + sub.operation(1,1));
    }
}
