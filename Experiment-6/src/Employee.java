// Abstract base class for all employees
public abstract class Employee {
    protected String name;
    protected String panNo;
    protected String joiningDate;
    protected String designation;
    protected String empId;

    public Employee(String name, String panNo, String joiningDate, String designation, String empId) {
        this.name = name;
        this.panNo = panNo;
        this.joiningDate = joiningDate;
        this.designation = designation;
        this.empId = empId;
    }

    // Abstract method to be implemented by subclasses
    public abstract double calcCTC();

    // Basic getters
    public String getName() { return name; }
    public String getEmpId() { return empId; }
}