package comparator.comparator13;

import java.time.LocalDate;

public class Employee {
    String name;

    LocalDate joiningDate;

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", joiningDate=" + joiningDate +
                '}';
    }

    public Employee(String name, LocalDate joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }
}
