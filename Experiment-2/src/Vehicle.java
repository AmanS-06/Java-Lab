public class Vehicle 
{
	
    public String brandName;
    public String modelName;
    public String color;
    public double price;
    public boolean auto;
    public int noOfWheels;
    public float enginePower;
    private int noOfCylinders;
    private String mfgCode;
    public float speedLimit;
    public String fuelType;

	public String getMfgCode()
    {
        return mfgCode;
    }
    public void setMfgCode(String mCode)
    {
        mfgCode = mCode;
    }

    public int getNoOfCylinders()
    {
        return noOfCylinders;
    }
    public void setNoOfCylinders(int nCylinders)
    {
        noOfCylinders = nCylinders;
    }

	// Default constructor
	public Vehicle() 
	{
		brandName="Honda";
        modelName="Accord";
        price=3500000.55;
        color="Blue";
        mfgCode="HON1234";
        noOfCylinders=4;
        noOfWheels=4;
        auto = true;
        enginePower=5.5f;
        fuelType="Petrol";
	}


	// Parameter constructor
	public Vehicle(String bName, String mName, String c, double p, String fType)
	{
		brandName = bName;
		modelName = mName;
		color = c;
		price = p;
		fuelType = fType;
	}

	// Parameter types cannot be repeated in-order for constructors
	// This is known as a "Signature"


	// Parameter constructor
	public Vehicle(String c, double p, boolean a) 
	{
		color = c;
		price = p;
		auto = a;
	}


	// Copy Constructor
	public Vehicle(Vehicle v)
	{
		brandName = v.brandName;
		modelName = v.modelName;
		price = v.price;
		auto = v.auto;
        noOfCylinders = v.noOfCylinders;
        enginePower = v.enginePower;
        noOfWheels = v.noOfWheels;
	}

	public void start(int initSp)
	{
		System.out.println("I've started with an initial speed of " + initSp);
	}

	public void drive()
	{
		System.out.println("Let's go! Drive safe!");
	}
	public void stop()
	{
		System.out.println("That was a nice ride!");
	}

	// Calculating mileage
	public float calculateMileage(float dist, int fuel) 
	{
		return dist/fuel;
	}

	public void displayFuelEfficiency() {
        float baseEfficiency = 20.0f; 
        float finalEfficiency;

        switch (fuelType.toLowerCase()) {
        	case "electric":
                finalEfficiency = baseEfficiency * 5.0f;
                System.out.println(brandName + " " + modelName + " (EV) Efficiency: " + finalEfficiency + " km/kWh");
                break;
            case "petrol":
                finalEfficiency = baseEfficiency;
                System.out.println(brandName + " " + modelName + " (Petrol) Efficiency: " + finalEfficiency + " km/l");
                break;
            case "diesel":
                finalEfficiency = baseEfficiency * 1.2f;
                System.out.println(brandName + " " + modelName + " (Diesel) Efficiency: " + finalEfficiency + " km/l");
                break;
            default:
                System.out.println("Unknown fuel type.");
        }
    }

    // Find the current speed of the vehicle
    public float changeSpeed(int curSp)
    {
        if (curSp<=this.speedLimit)
            System.out.println("You are in the ideal speed range.");
        else
            System.out.println("SLOW DOWN!!!");

        return curSp;
    }

}