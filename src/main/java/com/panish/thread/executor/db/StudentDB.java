package main.java.com.panish.thread.executor.db;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentDB {

    public static List<Student> getStudents() {

        int count = 100000;
        List<Student> mainList = new ArrayList<>();
        List<Student> clieldList = null;

        for (int i = 1; i <= count; i++) {
            clieldList = Arrays.asList(
                    new Student(1, "name1", "city1", 10.00),
                    new Student(1, "name1", "city1", 40.00),
                    new Student(1, "name1", "city1", 50.00),
                    new Student(1, "name1", "city1", 60.00),
                    new Student(1, "name1", "city1", 70.00),
                    new Student(2, "name2", "city2", 20.00),
                    new Student(2, "name2", "city2", 30.00),
                    new Student(2, "name2", "city2", 40.00),
                    new Student(2, "name2", "city2", 50.00),
                    new Student(3, "name3", "city3", 30.00),
                    new Student(3, "name3", "city3", 40.00),
                    new Student(4, "name4", "city4", 40.00),
                    new Student(4, "name4", "city4", 50.00),
                    new Student(4, "name4", "city4", 60.00),
                    new Student(4, "name4", "city4", 70.00),
                    new Student(5, "name5", "city4", 40.00),
                    new Student(5, "name5", "city4", 50.00),
                    new Student(5, "name5", "city4", 60.00),
                    new Student(5, "name5", "city4", 70.00),
                    new Student(6, "name6", "city4", 40.00),
                    new Student(6, "name6", "city4", 50.00),
                    new Student(6, "name6", "city4", 60.00),
                    new Student(7, "name7", "city4", 40.00),
                    new Student(7, "name7", "city4", 50.00),
                    new Student(7, "name7", "city4", 60.00),
                    new Student(7, "name7", "city4", 70.00),
                    new Student(7, "name7", "city4", 80.00),
                    new Student(8, "name8", "city4", 40.00),
                    new Student(8, "name8", "city4", 50.00),
                    new Student(8, "name8", "city4", 60.00),
                    new Student(8, "name8", "city4", 70.00),
                    new Student(8, "name8", "city4", 80.00),
                    new Student(9, "name9", "city4", 40.00),
                    new Student(9, "name9", "city4", 50.00),
                    new Student(9, "name9", "city4", 60.00),
                    new Student(9, "name9", "city4", 70.00)
            );
            mainList.addAll(clieldList);
        }

        return mainList;
    }
}
