package panish.Java8.db;

import java.util.Objects;

public class Student {

    private String name;
    private String city;
    private double salary;

    public Student(String name, String city, double salary) {
        this.name = name;
        this.city = city;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Double.compare(student.salary, salary) == 0 && Objects.equals(name, student.name) && Objects.equals(city, student.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, city, salary);
    }
}
