/* Entry point: orchestrates all CRUD operations and shows output */
public class StudentRecordManager {
	public static void main(String[] args) {
		CSVHandler.display("Initial CSV Contents");
		
		/* CREATE: add 3 new students with marks4 and marks5 as 0 */
        System.out.println("\n--- CREATE: Adding 3 new students (marks4, marks5 = 0) ---");
        
        StudentDAO.addStudent("103", "Carol White",  "Mechanical",            80, 74, 88, 0, 0);
        StudentDAO.addStudent("104", "David Brown",  "Civil",                 65, 70, 78, 0, 0);
        StudentDAO.addStudent("105", "Eva Martinez", "Information Technology",90, 85, 92, 0, 0);
        
        CSVHandler.display("After Adding 3 Students");
        
        
        /* UPDATE: fill in the correct marks for every student */
        System.out.println("\n--- UPDATE: Setting correct marks for all students ---");
        CSVHandler.display("After Updating All Marks");
        
        /* UPDATE: compute and write percentage for each student */
        System.out.println("\n--- UPDATE: Calculating and writing percentages ---");
        StudentDAO.updateAllPercentages();

        CSVHandler.display("After Updating Percentages");
        
        /* READ: show final state */
        System.out.println("\n--- READ: Final state of all records ---");

        CSVHandler.display("All Student Records");
        
        /* DELETE: remove student 103 */
        System.out.println("\n--- DELETE: Removing student 103 ---");

        StudentDAO.deleteStudent("103");
        CSVHandler.display("After Deletion");


         /* IOException demo */
        CSVHandler.demonstrateIOException();
    }
}
