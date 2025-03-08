package comparator.comparator12;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class MainRunner {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();

        list.add(new Person("Kedar", LocalDate.of(1999,7,24)));
        list.add(new Person("Sushmita", LocalDate.of(1997,1,11)));
        list.add(new Person("Arpit", LocalDate.of(1998,12,7)));
        list.add(new Person("Niharika", LocalDate.of(1998,3,18)));

        Optional<Person> oldestPerson = list.stream().min(Comparator.comparing(Person::getBirthDate));

        System.out.println(oldestPerson);
    }
}
