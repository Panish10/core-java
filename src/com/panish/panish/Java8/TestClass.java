package panish.Java8;

import panish.Java8.db.Student;
import panish.Java8.db.StudentDB;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestClass {
    public static void main(String[] args) {
        m3();
    }

    public static void m3() {
        List<Student> students = StudentDB.getStudents();
        List<Student> duplicate = students.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream().filter(item -> item.getValue() > 1L)
                .map(item -> item.getKey())
                .collect(Collectors.toList());

        duplicate.stream().forEach(item -> System.out.println(item));
    }

    public static void m2() {
        List<Student> students = StudentDB.getStudents();

        /*
        * Result: {Student{name='name3', city='city3'}=1, Student{name='name2', city='city2'}=2, Student{name='name1', city='city1'}=3}
        */
        Map<Student, Long> sm = students.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(sm);

        /*
        * Result: [Student{name='name3', city='city3'}=1, Student{name='name2', city='city2'}=2, Student{name='name1', city='city1'}=3]
        * */
        Set<Map.Entry<Student, Long>> set = students.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet();
        System.out.println(set);

        /*
        * Reslut: [Student{name='name2', city='city2'}, Student{name='name1', city='city1'}]
        * */
        List<Student> list = students.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream().filter(e -> e.getValue() > 1L)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
        System.out.println(list);
    }

    public static void m1() {
        List<String> list = Arrays.asList("panish", "neha", "sneha");
        String names = list.stream().distinct().collect(Collectors.joining("-"));
        System.out.println("All names: "+names);
        long count = list.stream().filter(s->s.length()>2).count();
        System.out.println("Count: "+count);
        boolean found = list.stream().anyMatch(s -> s.length() == 6);
        System.out.println("Found: "+found);
        Optional<String> findAny = list.stream().filter(s->s.length() == 6).findAny();
        if(findAny.isPresent())
            System.out.println("Find any name: "+findAny.get());
        else
            System.out.println("No name found");
    }
}
