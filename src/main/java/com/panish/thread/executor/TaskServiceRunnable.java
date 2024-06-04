package main.java.com.panish.thread.executor;

import main.java.com.panish.thread.executor.db.Student;
import main.java.com.panish.thread.executor.db.StudentDB;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class TaskServiceRunnable implements Runnable {

    long hour;

    private static List<Student> list;

    static {
        list = StudentDB.getStudents();
    }

    public TaskServiceRunnable(long hour) {
        this.hour = hour;
    }

    @Override
    public void run() {
        executeTask(hour);
    }

    private static void executeTask(long hour) {
        try {
            System.out.println("executeTask method: " + hour);
            String csvData = fetchDataFromDatabase(hour);

            // Generate CSV file with a timestamp
            String timestamp = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd_HHmmss"));
            String csvFileName = "D:\\temp\\ftp\\data_" + timestamp + "_hour_" + hour + ".csv";
            generateCSVFile(csvFileName, csvData);

            System.out.println("Data fetched and CSV file generated for four " + hour);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String fetchDataFromDatabase(long hour) throws Exception {
        StringBuilder csvData = new StringBuilder("id,name,city,salary\n");
        try {

            for (Student student : list) {
                if (student.getId() == hour) {
                    csvData.append(student.getId()).append(",")
                            .append(student.getName()).append(",")
                            .append(student.getCity()).append(",")
                            .append(student.getSalary()).append("\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return csvData.toString();
    }

    private static void generateCSVFile(String fileName, String csvData) throws IOException {
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(csvData);
        }
    }
}
