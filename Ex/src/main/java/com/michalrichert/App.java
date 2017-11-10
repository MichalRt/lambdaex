package com.michalrichert;

import java.util.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        new Thread(() -> {
            System.out.println("Printing from the Runnable");
            System.out.println("line");
            System.out.format("This is line %d\n", 3);
        }).start();
        Employee adam = new Employee("Adam", 70);
        Employee michal = new Employee("Michal", 40);
        Employee zbyszek = new Employee("Zbyszek", 10);
        List<Employee> employees = new ArrayList<>();
        employees.add(adam);
        employees.add(michal);
        employees.add(zbyszek);

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        employees.forEach(employee -> System.out.println(employee.getName()));
    UpperConcat upperConcat = (s1, s2) ->{
    String result =s1.toUpperCase() + s2.toUpperCase();
    return result;
    };

        upperConcat.uppperAndConcat(adam.getName(), michal.getName());
        employees.forEach(employee -> System.out.println(employee.getName()));
}
    }
class Employee {
     private String name;
     private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

interface UpperConcat {
    public String uppperAndConcat(String s1, String s2);
}