package com.panish.comp.maveric;

import java.util.*;
import java.util.stream.Collectors;

public class EmpliyeeTest {

    public static void main(String[] args) {
        List<Employee> list =  Arrays.asList(new Employee("panish", 10),
                new Employee("aniket", 20),
                new Employee("panish", 10));


        Set<Employee> uniq = new HashSet<>();
        // remove duplicate sol 1
        List<Employee> list2 = list.stream().filter(employee -> uniq.add(employee)).collect(Collectors.toList());
        System.out.println(list2);

        // remove duplicate sol 2
        List<Employee> list4 = list.stream().distinct().collect(Collectors.toList());
        System.out.println(list4);

        // Filter start with "Panish" and give 10% Bonus
        List<Double> list3 = list.stream().filter(employee -> employee.getName().equals("panish"))
                .map(employee -> employee.getSalary() + employee.getSalary()*0.1).collect(Collectors.toList());
        System.out.println(list3);
    }
}
