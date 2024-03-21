public abstract class AFuelCar extends ACar{
    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLite) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLite = kmPrLite;
    }


    private int kmPrLite;

    public abstract String getFuelType();

    public int getKmPmLitre() {
        return kmPrLite;
    }

    @Override
    public String toString() {
        return "Km/L: " + kmPrLite +", " + super.toString();
    }
}
