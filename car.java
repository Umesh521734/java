public class car {
    public String carColor;
    private String carBrand;
    private String fuelType;
    public int mileage;

    car(String carColor, String carBrand, String fuelType, int mileage) {
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.fuelType = fuelType;
        this.mileage = mileage;
        System.out.println(carColor + " " + carBrand + " " + fuelType + " " +
                mileage);
    }

    public void Start() {
        System.out.println("The car has just started");
    }

    public void Stop() {
        System.out.println("The car has just stopped");
    }

    public void Service() {
        System.out.println("The car is in good condition");
    }

    public static void main(String[] args) {
        car car1 = new car(" orange", "Audi", "Petrol", 60);
        car car2 = new car(" yellow", "BMW", "Diesel", 97);
        car car3 = new car(" violet", " tata", "Petrol", 66);
        car1.Start();
    }
}