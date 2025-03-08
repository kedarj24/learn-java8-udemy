package comparator.comparatorSuper1;

import java.util.List;

public class Student {
    String name;
    String gender;
    String city;
    int id;
    int age;
    int rank;
    String department;
    List<String> contacts;

    public Student(String name, String gender, String city, int id, int age, int rank, String department, List<String> contacts) {
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.id = id;
        this.age = age;
        this.rank = rank;
        this.department = department;
        this.contacts = contacts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", city='" + city + '\'' +
                ", id=" + id +
                ", age=" + age +
                ", rank=" + rank +
                ", department='" + department + '\'' +
                ", contacts=" + contacts +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<String> getContacts() {
        return contacts;
    }

    public void setContacts(List<String> contacts) {
        this.contacts = contacts;
    }
}
