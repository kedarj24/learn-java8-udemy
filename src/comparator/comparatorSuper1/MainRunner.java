package comparator.comparatorSuper1;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MainRunner {
    public static void main(String[] args) {
        List<Student> listStudents = Stream.of(
                new Student("Arpit","male","Nagpur",1,25,12,"Electrical",
                        Arrays.asList("92341843,12938746")),
                new Student("Kedar","male","Pune",5,24,9,"ENTC",
                        Arrays.asList("87603874,37498509")),
                new Student("Aditya","male","Belgaon",2,27,5,"Computer",
                        Arrays.asList("85554547,14153962")),
                new Student("Sushmita","female","Kolkata",4,31,3,"IT",
                        Arrays.asList("93553256,90469208")),
                new Student("Gaurav","male","Jalgaon",3,19,32,"Mechanical",
                        Arrays.asList("45514154,06971537")),
                new Student("Niharika","female","Bhopal",6,30,10,"Electrical",
                        Arrays.asList("79772855,50437692")),
                new Student("Depali","female","Nagpur",7,35,4,"Electrical",
                        Arrays.asList("79772855,50437692")),
                new Student("Tejas","female","Nashik",9,26,10,"Mechanical",
                        Arrays.asList("79772855,50437692"))
        ).toList();

       // System.out.println(listStudents);

        //1.Find the list of Students whose rank is between 3 and 5.

        List<Student> sortRank = listStudents.stream().filter(e -> e.getRank() >= 3 && e.getRank() <= 5).toList();

        //System.out.println(sortRank);

        //2. Find the list of students who stays in Nagpur and sort them by there name.

        List<Student> nagpurStudents = listStudents.stream()
                .filter(student -> student.getCity().equals("Nagpur"))
                .sorted(Comparator.comparing(Student::getName,Comparator.reverseOrder()))
                .toList();

        //System.out.println(nagpurStudents);

        //3. Find all department names

        List<String> depList = listStudents.stream().map(Student::getDepartment)
                .distinct().toList();

        //System.out.println(depList);

        //4. Find all the contact numbers

        List<String> contList = listStudents.stream()
                .flatMap(student -> student.getContacts().stream()).toList();

        //System.out.println(contList);

        //one2one --> map
        //one2many --> flatmap

        //5. Group Number of students by Department name

        Map<String,Long> studDept = listStudents.stream()
                .collect(Collectors.groupingBy(Student::getDepartment , Collectors.counting()));

        //System.out.println(studDept);

        //6. Find the department who is having maximum number of students.

        Optional<Map.Entry<String, Long>> result = listStudents.stream().collect(Collectors.groupingBy(Student::getDepartment, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());

        //System.out.println(result);

        //7. Find the average age of male and female

        Map<String,Double> avgAgeByGender  = listStudents.stream().collect(Collectors.groupingBy(Student::getGender,Collectors.averagingInt(Student::getAge)));

        //System.out.println(avgAgeByGender);

        //8. Find the highest rank in each department

        Map<String,Optional<Student>> sortByrank = listStudents.stream()
                .collect(Collectors.groupingBy(Student::getDepartment,
                        Collectors.minBy(Comparator.comparing(Student::getRank))));

        //System.out.println(sortByrank);

        //9. Find the student who has second rank

        Optional<Student> student1 =listStudents.stream().sorted(Comparator.comparing(Student::getRank)).skip(1).findFirst();

        System.out.println(student1);



    }
}
