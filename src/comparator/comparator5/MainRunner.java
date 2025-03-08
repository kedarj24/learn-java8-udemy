package comparator.comparator5;

import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class MainRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kedar",40000d, LocalDate.of(2021,2,17)));
        list.add(new Employee("Ketan",50000d, LocalDate.of(2025,7,16)));
        list.add(new Employee("Krish",30000d, LocalDate.of(2023,8,15)));
        list.add(new Employee("Arish",30000d, LocalDate.of(2026,8,19)));
        list.add(new Employee("Karan",70000d, LocalDate.of(2022,6,14)));


       Optional<Employee> minSal =  list.stream().min(Comparator.comparing(Employee::getSalary)
                .thenComparing(Employee::getName));

        Map<Double,List<Employee>> groupSalary =list.stream().collect(Collectors.groupingBy(Employee::getSalary));

        List<Employee> salary30k = groupSalary.get(30000d);

        System.out.println("salary30k :" + salary30k);

        System.out.println(minSal);
    }
}
