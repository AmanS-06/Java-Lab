// FullTimeEmployee extends Employee and adds full-time specific fields
public class FullTimeEmployee extends Employee {
    protected double baseSalary;
    protected double perfBonus;
    protected double hiringCommission;
    protected String role; // "SWE", "HR", etc.

    public FullTimeEmployee(String name, String panNo, String joiningDate, 
                            String designation, String empId, 
                            double baseSalary, double perfBonus, 
                            double hiringCommission, String role) {
        super(name, panNo, joiningDate, designation, empId);
        this.baseSalary = baseSalary;
        this.perfBonus = perfBonus;
        this.hiringCommission = hiringCommission;
        this.role = role;
    }

    @Override
    public double calcCTC() {
        // CTC calculation depends on the role
        if (role.equalsIgnoreCase("SWE")) {
            return baseSalary + perfBonus;
        } else if (role.equalsIgnoreCase("HR")) {
            return baseSalary + hiringCommission;
        } else {
            // Default for other full-time roles
            return baseSalary;
        }
    }

    // Getters for subclass use
    public double getBaseSalary() { return baseSalary; }
    public double getPerfBonus() { return perfBonus; }
}