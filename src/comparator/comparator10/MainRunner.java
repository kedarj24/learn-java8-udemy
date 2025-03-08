package comparator.comparator10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("Shyam",7.12f));
        list.add(new Student("Suraj",6.72f));
        list.add(new Student("Swarup",9.12f));
        list.add(new Student("Sanket",8.72f));
        list.add(new Student("Shubham",9.92f));
        list.add(new Student("Sudhir",8.43f));

        List<Student> listnew = list.stream().sorted(Comparator.comparing(Student::getGpa).reversed()).toList();

        System.out.println(listnew);
    }
}
