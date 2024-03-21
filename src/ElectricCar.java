public class ElectricCar extends ACar {
    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    private int batteryCapacity;
    private int maxRange;

    public int getBatteryCapacityKWH() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        return (batteryCapacity*1000)/maxRange;
    }


    @Override
    public int getRegistrationFee() {
        double whPrKm = 100 / (getWhPrKm() / 91.25) ;
        if (whPrKm >= 20 ) {
            return 330;
        } else if (whPrKm >= 15 && whPrKm < 20) {
            return 1050;
        } else if (whPrKm >= 10 && whPrKm < 15) {
            return 2340;
        } else if (whPrKm >= 5 && whPrKm < 10) {
            return 5500;
        } else if (whPrKm < 5) {
            return 10470;
        }
        return 0;
    }
   public String getFuelType(){
        return "Electric";
    }

    @Override
    public String toString() {
        return "Motor: "+getFuelType()+", " + "battery capacity: " + batteryCapacity +", max range: " + maxRange +"km, " + super.toString();
    }

    @Override
    public String toCSV() {
        return getFuelType()+", "+getMake()+", "+getModel()+", "+getRegistrationNumber()+", "+", "+getMaxRange()+", "+getBatteryCapacityKWH()+", "+", "+getNumberOfDoors();
        //String header = "Motor, Make, Model, Registration number, Km/l, Max range, battery capacity, Number of doors";

    }
}
