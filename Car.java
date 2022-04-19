import java.util.Scanner;

public class Car {

   public static final int length = 0;
   private String carname;
   private String model;
   private String brand;
   private String location;
   private int year;
   private double gas;
    
    public Car(String carname, String model, String brand, String location, int year){

        this.carname = carname;
        this.model = model;
        this.brand = brand;
        this.location = location;
        this.year = year;
        
        
    }

    public Car(String carname, String model, String brand, String location, int year, double gas){
        this.carname = carname;
        this.model = model;
        this.brand = brand;
        this.location = location;
        this.year = year;
        this.gas = gas;

    }
    public Car(String name, String model2, String brand2, int year2, String location2, double gas2,
            double gasConsumption, String carSound) {
    }

    public double calculateGasUsed(double distance) {
        double kmPerLitreofGas = 15.5;

        return distance / kmPerLitreofGas;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarname() {
        return carname;
    }

    public void setCarname(String carsname) {
        this.carname = carsname;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public void travel(String place){
        System.out.println("I'm now at " + place);
        this.location = place;
    }
    public void travel(){
        String newLocation;
        double distance;
        double gasUsed;

        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Please enter travel destination: ");
        newLocation = inputScanner.nextLine();
        System.out.println("Please enter the distance (km) between the two locations: ");
        distance = inputScanner.nextDouble();
        this.location = newLocation;
        gasUsed = calculateGasUsed(distance);
        this.gas = this.gas - gasUsed;

        inputScanner.close();
    }

    public void travel(Scanner sc) {
    }
    
}
