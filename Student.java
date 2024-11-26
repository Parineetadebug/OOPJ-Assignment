package pkg1;
public class Student {
    private int studentID;
    private String name;
    private int[] marks;
    private int totalMarks;
    private char grade;

    // Setter methods
    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    // Method to calculate total marks
    public void calculateTotalMarks() {
        totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
    }

    // Method to calculate grade
    public void calculateGrade() {
        double average = totalMarks / (double) marks.length;
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 75) {
            grade = 'B';
        } else if (average >= 50) {
            grade = 'C';
        } else {
            grade = 'F';
        }
    }

    // Getter methods
    public int getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getTotalMarks() {
        return totalMarks;
    }

    public char getGrade() {
        return grade;
    }

    // Display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentID);
        System.out.println("Name: " + name);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Grade: " + grade);
    }
}