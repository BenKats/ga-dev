package com.sum;

public class Demo {
    public int sumOfTwo(int n1, int n2){
        return n1 + n2;
    }
    public int sumOfThree(int n1, int n2, int n3){
        return n1 + n2 + n3;
    }

    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println(obj.sumOfTwo(10,10));
        System.out.println(obj.sumOfThree(10,10,10));
//        obj.display();
    }
}
