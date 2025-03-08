package comparator.comparator3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee("Kedar","IT"));
        list.add(new Employee("Mandar","Mech"));
        list.add(new Employee("Soham","IT"));
        list.add(new Employee("Parag","Civil"));
        list.add(new Employee("Tushar","Mech"));
        list.add(new Employee("Ajay","IT"));

        List<Employee> sotedList = list.stream().sorted(Comparator.comparing(Employee::getDepartment)
                .thenComparing(Employee::getName)).toList();

        System.out.println(sotedList);


    }


}
