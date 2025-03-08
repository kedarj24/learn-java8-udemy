package comparator.comparator13;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();

        list.add(new Employee("Kedar", LocalDate.of(2021,8,14)));
        list.add(new Employee("Gaurav", LocalDate.of(2021,8,14)));
        list.add(new Employee("Vishal", LocalDate.of(2022,2,17)));
        list.add(new Employee("Bokesh", LocalDate.of(2020,9,11)));
        list.add(new Employee("Amit", LocalDate.of(2021,8,14)));

        List<Employee> listnew = list.stream().sorted(Comparator.comparing(Employee::getName)
                .thenComparing(Employee::getJoiningDate)).toList();

        System.out.println(listnew);

    }
}
