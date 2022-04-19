public class Main {

    public static void main(String[] args) throws Exception {

        Car car1 = new Car("350GT", "GTZ", "Lambo", "Talamban", 1966);

        System.out.println("Car Information");
        System.out.println("Name: " + car1.getCarname());
        System.out.println("Model: " + car1.getModel());
        System.out.println("Brand: " + car1.getBrand());
        System.out.println("Year: " + car1.getYear());
        System.out.println("-------------------");

        System.out.println("Current Location: " + car1.getLocation());
        System.out.println( "\n");
        
        System.out.println("---------------------");
        System.out.println("= Now Traveling..");
        car1.travel("San Carlos, Talamban, Cebu City");
        System.out.println("= I've Arrived at my Destination.");
        System.out.println("-----------------------");
        
        System.out.println("Current Location: " + car1.getLocation());
        System.out.println( "\n");
    }
  


}
    

