public class GasolinCar extends AFuelCar {
    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLite) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLite);
    }

    @Override
    public int getRegistrationFee() {
        int sum = 0;
        if (getKmPmLitre() > 20) {
            sum += 330;
        } else if (getKmPmLitre() > 15 && getKmPmLitre() < 20) {
            sum += 1050;
        } else if (getKmPmLitre() > 10 && getKmPmLitre() < 15) {
            sum += 2340;
        } else if (getKmPmLitre() > 5 && getKmPmLitre() < 10) {
            sum += 5500;
        } else if (getKmPmLitre() < 5) {
            sum += 10470;
        }
        return sum;
    }

    @Override
    public String getFuelType() {
        return "Gasoline";
    }

    @Override
    public String toCSV() {
        return getFuelType()+", "+getMake()+", "+getModel()+", "+getRegistrationNumber()+", "+getKmPmLitre()+", "+", "+", "+", "+getNumberOfDoors();
        //String header = "Motor, Make, Model, Registration number, Km/l, Max range, battery capacity, Number of doors";

    }

    @Override
    public String toString() {
        return "Motor: " + getFuelType() + ", " + super.toString();
    }
}
