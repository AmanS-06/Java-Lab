/* Model class representing a single student record */
public class Student {

    private String studentId;
    private String name;
    private String branch;
    private double marks1;
    private double marks2;
    private double marks3;
    private double marks4;
    private double marks5;
    private double percentage;

    public Student(String studentId, String name, String branch,
                   double marks1, double marks2, double marks3,
                   double marks4, double marks5, double percentage) {
        this.studentId  = studentId;
        this.name       = name;
        this.branch     = branch;
        this.marks1     = marks1;
        this.marks2     = marks2;
        this.marks3     = marks3;
        this.marks4     = marks4;
        this.marks5     = marks5;
        this.percentage = percentage;
    }

    /* Convert a CSV row string into a Student object */
    public static Student fromCSV(String csvLine) {
        String[] p = csvLine.split(",");
        return new Student(
                p[0].trim(), p[1].trim(), p[2].trim(),
                Double.parseDouble(p[3].trim()),
                Double.parseDouble(p[4].trim()),
                Double.parseDouble(p[5].trim()),
                Double.parseDouble(p[6].trim()),
                Double.parseDouble(p[7].trim()),
                Double.parseDouble(p[8].trim())
        );
    }

    /* Serialize back to a CSV row string */
    public String toCSV() {
        return studentId + "," + name + "," + branch + ","
                + marks1 + "," + marks2 + "," + marks3 + ","
                + marks4 + "," + marks5 + ","
                + String.format("%.2f", percentage);
    }

    public String getStudentId() { return studentId; }
    public String getName()      { return name; }
    public String getBranch()    { return branch; }
    public double getMarks1()    { return marks1; }
    public double getMarks2()    { return marks2; }
    public double getMarks3()    { return marks3; }
    public double getMarks4()    { return marks4; }
    public double getMarks5()    { return marks5; }
    public double getPercentage(){ return percentage; }

    public void setMarks1(double v) { marks1 = v; }
    public void setMarks2(double v) { marks2 = v; }
    public void setMarks3(double v) { marks3 = v; }
    public void setMarks4(double v) { marks4 = v; }
    public void setMarks5(double v) { marks5 = v; }
    public void setPercentage(double v) { percentage = v; }
}
