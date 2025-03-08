package comparator.comparator4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainRunner {
    // Employee with Max Salary
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kedar",50000d));
        list.add(new Employee("Arpit",70000d));
        list.add(new Employee("Sushmita",65000d));
        list.add(new Employee("Gaurav",35000d));

        Optional<Employee> newList = list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(newList);

    }
}
