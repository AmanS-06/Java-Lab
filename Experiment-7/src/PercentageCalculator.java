/* Utility class for percentage calculation */
public class PercentageCalculator {

    /* Returns the average of the five marks */
    public static double calculate(double m1, double m2, double m3,
                                   double m4, double m5) {
        return (m1 + m2 + m3 + m4 + m5) / 5.0;
    }

    /* Convenience overload that accepts a Student object */
    public static double calculate(Student s) {
        return calculate(s.getMarks1(), s.getMarks2(), s.getMarks3(),
                         s.getMarks4(), s.getMarks5());
    }
}
