package panish.Java8.db;

import java.util.Arrays;
import java.util.List;

public class StudentDB {

    public static List<Student> getStudents() {
        Student student1 = new Student("name1", "city1", 10.00);
        Student student2 = new Student("name2", "city2", 20.00);
        Student student3 = new Student("name3", "city3", 30.00);
        Student student4 = new Student("name2", "city2", 10.00);
        Student student5 = new Student("name1", "city1", 40.00);
        Student student6 = new Student("name1", "city1", 50.00);

        return Arrays.asList(student1, student2, student3, student4, student5, student6);
    }
}
