package comparator.comparator6;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Suresh",30000d));
        list.add(new Employee("Ayushi",30000d));
        list.add(new Employee("Bhanu",30000d));
        list.add(new Employee("Deepali",50000d));
        list.add(new Employee("Saloni",70000d));

        List<Employee> emplist = list.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()
                .thenComparing(Employee::getName)).toList();

        System.out.println(emplist);

    }
}
