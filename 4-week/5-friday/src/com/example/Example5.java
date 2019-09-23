package com.example;

import java.util.*;

public class Example5 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("John", "Smith", 25));
        employeeList.add(new Employee("Mike", "Smith", 35));
        employeeList.add(new Employee("Stacy", "Smith", 45));
        Collections.sort(employeeList, Comparator.comparing(Employee::getFirstName));
        for(Employee e: employeeList){
            System.out.println(e);
        }
    }


}
