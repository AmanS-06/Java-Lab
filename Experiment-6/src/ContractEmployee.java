// ContractEmployee is paid based on hours worked
public class ContractEmployee extends Employee {
    private double noOfHrs;
    private double hourlyRate;

    public ContractEmployee(String name, String panNo, String joiningDate, 
                            String designation, String empId, 
                            double noOfHrs, double hourlyRate) {
        super(name, panNo, joiningDate, designation, empId);
        this.noOfHrs = noOfHrs;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calcCTC() {
        // CTC = hours * rate
        return noOfHrs * hourlyRate;
    }
}