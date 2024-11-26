package pkg1;
import java.io.*;
import java.util.*;

public class TestClass1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            // Reading input file
            BufferedReader reader = new BufferedReader(new FileReader("input1.txt"));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                int studentID = Integer.parseInt(data[0]);
                String name = data[1];
                int[] marks = new int[data.length - 2];
                for (int i = 0; i < marks.length; i++) {
                    marks[i] = Integer.parseInt(data[i + 2]);
                }

                // Create and initialize a Student object using setters
                Student student = new Student();
                student.setStudentID(studentID);
                student.setName(name);
                student.setMarks(marks);

                // Calculate total marks and grade
                student.calculateTotalMarks();
                student.calculateGrade();

                students.add(student);
            }
            reader.close();

            // Display student details
            for (Student student : students) {
                student.displayDetails();
                System.out.println("----------");
            }

            // Write output to file
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            writer.write("Student ID,Name,Total Marks,Grade\n");
            for (Student student : students) {
                writer.write(student.getStudentID() + "," +
                             student.getName() + "," +
                             student.getTotalMarks() + "," +
                             student.getGrade() + "\n");
            }
            writer.close();

            System.out.println("Program executed successfully. Check output.txt for results.");

        } catch (IOException e) {
            System.err.println("Error processing file: " + e.getMessage());
        }
    }
}
