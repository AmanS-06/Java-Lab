
public class Main {
    public static void main(String[] args) {
        // Full-time SWE
        FullTimeEmployee swe = new FullTimeEmployee("Alice", "ABCDE1234F", "2022-01-15", 
                                                    "Software Engineer", "FT001", 
                                                    80000, 15000, 0, "SWE");
        System.out.println(swe.getName() + " CTC: " + swe.calcCTC());

        // Full-time HR
        FullTimeEmployee hr = new FullTimeEmployee("Bob", "FGHIJ5678K", "2021-06-10", 
                                                   "HR Specialist", "FT002", 
                                                   60000, 5000, 12000, "HR");
        System.out.println(hr.getName() + " CTC: " + hr.calcCTC());

        // Contract employee
        ContractEmployee contractor = new ContractEmployee("Charlie", "LMNOP9012Q", "2023-03-01", 
                                                           "Contract Developer", "CT001", 
                                                           160, 75); // 160 hours, $75/hr
        System.out.println(contractor.getName() + " CTC: " + contractor.calcCTC());

        // Manager
        Manager mgr = new Manager("Diana", "QRSTU3456V", "2020-08-22", 
                                  "Engineering Manager", "MGR001", 
                                  120000, 30000, 0, "SWE", 
                                  10000, 5000);
        System.out.println(mgr.getName() + " CTC: " + mgr.calcCTC());
    }
}