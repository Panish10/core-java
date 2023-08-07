package com.panish.Java8.filter;

import com.panish.Java8.db.Student;
import com.panish.Java8.db.StudentDB;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateEx {

    public static void main(String[] args) {
        List<Student> students = StudentDB.getStudents();

        Set<Student> solution1 = solution1(students);
        //System.out.println(solution1);

        List<Student> solution1v2 = solution1v2(students);
        //System.out.println(solution1v2);

        List<Student> solution2 = solution2(students);
        //System.out.println(solution2);

        //List<Student> solution3 = solution3(students);

    }

    public static Set<Student> solution1(List<Student> studentList) {
        Set<Student> unique = new HashSet<>();
        return studentList.stream()
                .filter(student -> !unique.add(student))
                .collect(Collectors.toSet());
    }

    public static List<Student> solution1v2(List<Student> studentList) {
        Set<Student> unique = new HashSet<>();
        Set<Student> duplicate = studentList.stream()
                .filter(student -> !unique.add(student))
                .collect(Collectors.toSet());

        List<Student> list = new ArrayList<Student>();
        list.addAll(duplicate);
        return list;
    }

    public static List<Student> solution2(List<Student> studentList) {

        return studentList.stream().collect(Collectors.groupingBy(Function.identity(),
                Collectors.counting()))
                .entrySet().stream()
                .filter(e -> e.getValue() > 1L)
                .map(e -> e.getKey())
                .collect(Collectors.toList());
    }

    /*public static List<Student> solution3(List<Student> studentList) {

        Set<String> unique = new HashSet<>();
        Map<String, Student> map = new HashMap<>();
        Map<String, Student> smap = studentList.stream()
                .collect(Collectors.toMap(Student::getName, Student.class, (oldValue, newValue) -> oldValue));

        System.out.println(smap);
        return null;
    }*/
}
