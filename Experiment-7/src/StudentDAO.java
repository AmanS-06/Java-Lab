import java.io.*;
import java.util.*;

/* Data Access Object: all CRUD operations on the student CSV */
public class StudentDAO {

    /* CREATE: append a new student row with marks4 and marks5 as 0 */
    public static void addStudent(String id, String name, String branch,
                                  double m1, double m2, double m3,
                                  double m4, double m5) {
        try {
            List<String> lines = CSVHandler.readLines();
            Student s = new Student(id, name, branch, m1, m2, m3, m4, m5, 0.0);
            lines.add(s.toCSV());
            CSVHandler.writeLines(lines);
            System.out.println("Created: " + s.toCSV());
        } catch (IOException e) {
            System.out.println("IOException while adding student: " + e.getMessage());
        }
    }

    /* READ: return all students (skips the header row) */
    public static List<Student> getAllStudents() throws IOException {
        List<String> lines = CSVHandler.readLines();
        List<Student> students = new ArrayList<>();
        for (int i = 1; i < lines.size(); i++) {
            students.add(Student.fromCSV(lines.get(i)));
        }
        return students;
    }

    /* UPDATE: replace all five marks for the student with the given id */
    public static void updateMarks(String studentId,
                                   double m1, double m2, double m3,
                                   double m4, double m5) {
        try {
            List<String> lines = CSVHandler.readLines();
            boolean found = false;
            for (int i = 1; i < lines.size(); i++) {
                Student s = Student.fromCSV(lines.get(i));
                if (s.getStudentId().equals(studentId)) {
                    s.setMarks1(m1);
                    s.setMarks2(m2);
                    s.setMarks3(m3);
                    s.setMarks4(m4);
                    s.setMarks5(m5);
                    lines.set(i, s.toCSV());
                    found = true;
                    System.out.println("Updated marks for studentId " + studentId + ": " + s.toCSV());
                    break;
                }
            }
            if (!found) {
                System.out.println("Student " + studentId + " not found for update.");
            }
            CSVHandler.writeLines(lines);
        } catch (IOException e) {
            System.out.println("IOException while updating marks: " + e.getMessage());
        }
    }

    /* UPDATE: recalculate and persist percentage for every student */
    public static void updateAllPercentages() {
        try {
            List<String> lines = CSVHandler.readLines();
            for (int i = 1; i < lines.size(); i++) {
                Student s = Student.fromCSV(lines.get(i));
                s.setPercentage(PercentageCalculator.calculate(s));
                lines.set(i, s.toCSV());
            }
            CSVHandler.writeLines(lines);
            System.out.println("Percentages recalculated for all students.");
        } catch (IOException e) {
            System.out.println("IOException while updating percentages: " + e.getMessage());
        }
    }

    /* DELETE: remove the row whose studentId matches */
    public static void deleteStudent(String studentId) {
        try {
            List<String> lines = CSVHandler.readLines();
            boolean removed = false;
            Iterator<String> iter = lines.iterator();
            iter.next(); // skip header
            while (iter.hasNext()) {
                String row = iter.next();
                Student s = Student.fromCSV(row);
                if (s.getStudentId().equals(studentId)) {
                    iter.remove();
                    removed = true;
                    System.out.println("Deleted student with studentId " + studentId + ": " + row);
                    break;
                }
            }
            if (!removed) {
                System.out.println("Student " + studentId + " not found for deletion.");
            }
            CSVHandler.writeLines(lines);
        } catch (IOException e) {
            System.out.println("IOException while deleting student: " + e.getMessage());
        }
    }
}
