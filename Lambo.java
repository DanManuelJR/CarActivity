public class Lambo extends Car {
    private String carSound;
    
    public Lambo(String carName, String model, String brand, String location, int year, double gas, double gasConsumption, String carSound){
        super(carName, model, brand, location, year, gasConsumption);
        this.carSound = carSound;  
    
}

    public String getCarSound() {
        return carSound;
    }

    public void setCarSound(String carSound) {
        this.carSound = carSound;
    }

}

