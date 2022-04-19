public class Gas {
        public static void main(String[] args) {
            Car car1 = new Car("350GT", "GTZ", "Lambo", "Talamban", 1966);
    
            System.out.println("[Car Information]");
            System.out.println("Name: " + car1.getCarname());
            System.out.println("Model: " + car1.getModel());
            System.out.println("Brand: " + car1.getBrand());
            System.out.println("Year: " + car1.getYear());
            System.out.println("-----------------");
    
            System.out.println("Current Location: " + car1.getLocation());
            System.out.println("Gas: " + car1.getGas() + " litres");
            System.out.println("-----------------");
    
            car1.travel();
    
            System.out.println("------------------");
            System.out.println("> Arrived at Destination");
    
            System.out.println("Current Location: " + car1.getLocation());
            System.out.println("Gas: " + car1.getGas() + " litres");
        }
        
    }
    


