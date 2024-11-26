package pkg1;
public class Grade {

    // Method to calculate the average marks of all students
    public double calculateAverageMarks(Student[] students) {
        int total = 0;
        for (Student student : students) {
            total += student.getTotalMarks();
        }
        return total / (double) students.length;
    }

    // Method to assign grades for a single student (if required)
    public void assignGrade(Student student) {
        student.calculateGrade();
    }
}