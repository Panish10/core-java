package lti;

import java.util.*;
import java.util.stream.Collectors;

public class LTIEx {

    public static void main(String[] args) {
       /* List<String> cities = Arrays.asList("pune","mumbai","chennai");
        StringBuffer sb = new StringBuffer();

        for(int i=0; i<cities.size(); i++) {
            if(i != cities.size()-1) {
                sb.append(cities.get(i)+", ");
            } else {
                sb.append(cities.get(i));
            }
        }
*/
        //System.out.println(sb.toString());

        List<Employee> list = new ArrayList<>();
        int max = 0;
        for(Employee emp: list) {
            if(max < emp.getSalary()) {
                max = emp.getSalary();
            }
        }

        Map<String, Integer> map = new HashMap<>();
        for (Employee employee: list) {

            String dept = employee.getDept();
            if(map.containsKey(dept)) {
                map.put(dept, map.get(dept)+1);
            } else {
                map.put(dept, 1);
            }
        }
        list.add(new Employee(1, "pan1", "1", 10));
        list.add(new Employee(2, "pan2", "2", 20));
        list.add(new Employee(3, "pan3", "1", 30));
        Map<String, Long> map2 = list.stream().collect(Collectors.groupingBy(emp -> emp.getDept(), Collectors.counting()));

        System.out.println(map2);
    }
}

class Employee {
    private int id;
    private String name;
    private String dept;
    private int salary;

    public Employee(int id, String name, String dept, int salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}


class contct {
    // select sal from (select sal from emplyee order by decs limt 2)
    //order by salay asc limt 1;

    // select dept, count(*) from employee group by dept;
}

