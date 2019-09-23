package com.hw;

import org.junit.Test;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class Lab {

    private List<Employee> employees = Arrays.asList(
            new Employee("Bezos, Jeff", LocalDate.of(2004, 4, 2), 68_109.00, "Male"),
            new Employee("Sheryl Sandberg", LocalDate.of(2014, 7, 1), 87_846.00,"Female"),
            new Employee("Buffet, Warren", LocalDate.of(2011, 7, 23), 95_035.00, "Male"),
            new Employee("Susan Wojcick", LocalDate.of(2015, 6, 1), 37_210.00, "Female"),
            new Employee("Zuckerberg, Mark", LocalDate.of(2016, 5, 12), 48_450.00, "Male"),
            new Employee("Brin, Sergey", LocalDate.of(2016, 8, 5), 74_416.00, "Male")
    );

    private <T> void printList(List<T> list) {
       list.forEach(System.out::println);

    }

    @Test
    public void getEmployeesOver50k() {
        this.employees
                .stream()
                .filter(employee -> employee.getSalary() > 50_000)
                .sorted((Comparator.comparing(Employee::getName)))
                .forEach(System.out::println);


    }

    @Test
    public void getEmployeeNamesHiredAfter2012() {
       LocalDate year2012 = LocalDate.of(2012, 1, 1);
       this.employees
               .stream()
               .filter(employee -> employee.getHireDate().isAfter(year2012))
               .forEach(System.out::println);
    }

    @Test
    public void getMaxSalary() {
        double max = this.employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .max()
                .orElse(0);
        System.out.println("Max:$" + max);

    }

    @Test
    public void getMinSalary() {
        double min = this.employees
                .stream()
                .mapToDouble(Employee::getSalary)
                .min()
                .orElse(0);
        System.out.println("Min:$" + min);
    }

    @Test
    public void getAverageSalaries() {
        double averageMale = this.employees
                .stream()
                .filter(employee -> employee.getGender().equals("Male"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        double averageFemale = this.employees
                .stream()
                .filter(employee -> employee.getGender().equals("Female"))
                .mapToDouble(Employee::getSalary)
                .average()
                .orElse(0);

        System.out.println("Averages: Male:$" + averageMale + " Female:$" + averageFemale);
    }

    @Test
    public void getMaximumPaidEmployee() {
        this.employees
                .parallelStream()
                .reduce((e1, e2) -> e1.getSalary() >= e2.getSalary() ? e1 : e2)
                .ifPresent(System.out::println);
    }
}

