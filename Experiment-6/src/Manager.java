// Manager is a specialized FullTimeEmployee with extra allowances
public class Manager extends FullTimeEmployee {
    private double travelAllowance;
    private double eduAllowance;

    public Manager(String name, String panNo, String joiningDate, 
                   String designation, String empId, 
                   double baseSalary, double perfBonus, 
                   double hiringCommission, String role,
                   double travelAllowance, double eduAllowance) {
        // Pass full-time details to superclass
        super(name, panNo, joiningDate, designation, empId, 
              baseSalary, perfBonus, hiringCommission, role);
        this.travelAllowance = travelAllowance;
        this.eduAllowance = eduAllowance;
    }

    @Override
    public double calcCTC() {
        // Manager CTC adds TA and education allowance to the base calculation
        // First get the base + bonus from superclass logic
        double baseCtc = super.calcCTC();
        return baseCtc + travelAllowance + eduAllowance;
    }
}