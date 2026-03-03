public class Vectors {

    public double[] vectorInput;
    public int dimension;

    // Constructor
    public Vectors(double[] values) throws VectorException {

        if (values == null || values.length == 0) {
            throw new VectorException("Vector cannot have 0 dimensions.");
        }

        if (values.length == 1) {
            throw new VectorException("1D vector not allowed. Only 2D or 3D allowed.");
        }

        if (values.length > 3) {
            throw new VectorException("Vectors greater than 3D are not allowed.");
        }

        if (values.length != 2 && values.length != 3) {
            throw new VectorException("Only 2D or 3D vectors are allowed.");
        }

        this.dimension = values.length;
        vectorInput = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            vectorInput[i] = values[i];
        }
    }

    // Addition
    public Vectors add(Vectors v) throws VectorException {

        if (this.dimension != v.dimension) {
            throw new VectorException("Addition not possible. Dimensions must match.");
        }

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] = this.vectorInput[i] + v.vectorInput[i];
        }

        return new Vectors(result);
    }

    // Subtraction
    public Vectors subtract(Vectors v) throws VectorException {

        if (this.dimension != v.dimension) {
            throw new VectorException("Subtraction not possible. Dimensions must match.");
        }

        double[] result = new double[dimension];

        for (int i = 0; i < dimension; i++) {
            result[i] = this.vectorInput[i] - v.vectorInput[i];
        }

        return new Vectors(result);
    }

    // Dot Product
    public double multiply(Vectors v) throws VectorException {

        if (this.dimension != v.dimension) {
            throw new VectorException("Multiplication not possible. Dimensions must match.");
        }

        double result = 0;

        for (int i = 0; i < dimension; i++) {
            result += this.vectorInput[i] * v.vectorInput[i];
        }

        return result;
    }

    // Print Vector
    public void printVector() {
        System.out.print("Vector: (");
        for (int i = 0; i < dimension; i++) {
            System.out.print(vectorInput[i]);
            if (i != dimension - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(")");
    }
}