package comparator.comparator2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kedar",40000D));
        list.add(new Employee("Mandar",48000D));
        list.add(new Employee("Soham",70000D));


       Optional<Employee> emp =  list.stream().max(Comparator.comparing(Employee::getSalary));
        System.out.println(emp);
    }
}
