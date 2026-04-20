import java.io.*;
import java.util.*;

/* Handles all low-level file I/O for the CSV data store */
public class CSVHandler {

    static final String FILE_PATH = "Students.csv";
    static final String HEADER    = "studentId,name,branch,marks1,marks2,marks3,marks4,marks5,percentage";

    /* Read every line from the CSV and return them as a list */
    public static List<String> readLines() throws IOException {
        List<String> lines = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(FILE_PATH));
        String line;
        while ((line = reader.readLine()) != null) {
            lines.add(line);
        }
        reader.close();
        return lines;
    }

    /* Write a list of lines back to the CSV, overwriting previous content */
    public static void writeLines(List<String> lines) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH));
        for (int i = 0; i < lines.size(); i++) {
            writer.write(lines.get(i));
            if (i < lines.size() - 1) {
                writer.newLine();
            }
        }
        writer.close();
    }

    /* Print all rows with a section label */
    public static void display(String label) {
        System.out.println("\n--- " + label + " ---");
        try {
            for (String l : readLines()) {
                System.out.println(l);
            }
        } catch (IOException e) {
            System.out.println("IOException while reading file: " + e.getMessage());
        }
    }

    /* Trigger an IOException by opening a file that does not exist */
    public static void demonstrateIOException() {
        System.out.println("\n--- IOException Demo: reading a non-existent file ---");
        try {
            BufferedReader reader = new BufferedReader(new FileReader("non_existent_file.csv"));
            reader.readLine();
            reader.close();
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        }
    }
}
