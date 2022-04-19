import java.util.Scanner;

public class Instantiate {
    public static void main(String[] args) throws Exception {

        Scanner inputScanner = new Scanner(System.in);
        Car[] cars = new Car[2];

        System.out.println("----------------------------"); 
        for (int i = 0; i < Car.length; i++) {
           
            System.out.println("Enter car name: ");
            String name = inputScanner.nextLine();
            System.out.println("Enter car model: ");
            String model = inputScanner.nextLine();
            System.out.println("Enter car brand: ");
            String brand = inputScanner.nextLine();
            System.out.println("Enter car year: ");
            int year = inputScanner.nextInt();
            inputScanner.nextLine();
            System.out.println("Enter car location: ");
            String location = inputScanner.nextLine();
            System.out.println("Enter available gas: ");
            double gas = inputScanner.nextDouble();
            System.out.println("Enter car gas consumption (km/L): ");
            double gasConsumption = inputScanner.nextDouble();
            System.out.println("Enter car sound: ");
            String carSound = inputScanner.nextLine();

            
            cars[i] = new Car(name, model, brand, year, location, gas, gasConsumption, carSound);

            System.out.println("-----------------------------------"); 
            cars[0].travel(inputScanner);
            System.out.println("------------------------------------"); 
            System.out.println("The remaining gas of " + cars[0].getCarname() + " after traveling to " + cars[0].getLocation() + " from " + cars[0].getLocation() + " is " + cars[0].getGas());
            System.out.println("------------------------------------"); 
        }

        inputScanner.close();

    }

    public static void printBorder(int activityNumber) {
        System.out.println("");
        System.out.println(""); 
        System.out.println("---------------------- Activity " + activityNumber + " -------------------"); 
        System.out.println(""); 
        System.out.println(""); 
    }
}

    