package maveric;

import java.util.Objects;

public class Employee {

    private String Name; // First Name
    private double salary;

    public Employee(String name, double salary) {
        Name = name;
        this.salary = salary;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && Objects.equals(Name, employee.Name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Name='" + Name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
