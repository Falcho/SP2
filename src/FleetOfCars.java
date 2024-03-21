import util.FileIO;

import java.util.ArrayList;

public class FleetOfCars {
    ArrayList<Car> fleet = new ArrayList<>();
    private FileIO io = new FileIO();
    private String path = "data/cars.csv";



    public void addList(ArrayList<Car>fleetList){
        this.fleet.addAll(fleetList);

    }

    public ArrayList<Car> getFleet() {
        return fleet;
    }

    void addCar(Car car){
        fleet.add(car);
    }
    int getTotalRegistrationFeeForFleet(){
        int sum = 0;
        for(Car c : fleet){
            sum += c.getRegistrationFee();
        }
        return sum;
    }

    @Override
    public String toString() {
        for(Car c : fleet){
            System.out.println(c);
        }
        return "";
    }
    public void saveFleetToFile(){
        ArrayList<String>datalist = new ArrayList<>();
        String header = "Motor, Make, Model, Registration number, Km/l, Max range, battery capacity, Number of doors";
        for(Car c : fleet){
            String data = c.toCSV();
            datalist.add(data);
        }
        io.saveData(header,datalist,path);
    }
}
