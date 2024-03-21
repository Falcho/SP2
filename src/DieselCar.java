public class DieselCar extends AFuelCar {

    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLite, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLite);
        this.particleFilter = particleFilter;
    }

    boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public int getRegistrationFee() {
        int result = 0;
        int regFee = 0;
        int dieselFee = 0;
        if (!hasParticleFilter())
            result += 1000;
        if (getKmPmLitre() >= 20) {
            regFee = 330;
            dieselFee = 130;
            result += regFee + dieselFee;
        } else if (getKmPmLitre() >= 15 && getKmPmLitre() < 20) {
            regFee = 1050;
            dieselFee = 1390;
            result += regFee + dieselFee;
        } else if (getKmPmLitre() >= 10 && getKmPmLitre() < 15) {
            regFee = 2340;
            dieselFee = 1850;
            result += regFee + dieselFee;
        } else if (getKmPmLitre() >= 5 && getKmPmLitre() < 10) {
            regFee = 5500;
            dieselFee = 2770;
            result += regFee + dieselFee;
        } else if (getKmPmLitre() < 5) {
            regFee = 10470;
            dieselFee = 15260;
            result += regFee + dieselFee;
        }
        return result;
    }

    @Override
    public String getFuelType() {
        return "Diesel";
    }

    @Override
    public String toString() {

        return "Motor: " + getFuelType() + ", " + (particleFilter ? "has" : "no")+" particle filter " + ", " + super.toString();
    }

    @Override
    public String toCSV() {
        return getFuelType()+", "+getMake()+", "+getModel()+", "+getRegistrationNumber()+", "+getKmPmLitre()+", "+", "+", "+hasParticleFilter()+", "+getNumberOfDoors();
      //  String header = "Motor, Make, Model, Registration number, Km/l, Max range, battery capacity, Has particlefilter, Number of doors";

    }
}
