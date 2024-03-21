import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        FleetOfCars gasoline = new FleetOfCars();
        FleetOfCars diesel = new FleetOfCars();
        FleetOfCars electric = new FleetOfCars();

        gasoline.addCar(new GasolinCar("1","Audi","A8",3,6));
        diesel.addCar(new DieselCar("2","Skoda","Fabia",5,23,false));
        electric.addCar(new ElectricCar("3","Tesla","Y",3,60,533));
        gasoline.addCar(new GasolinCar("4","Porsche","911 Carrera",3,4));
        diesel.addCar(new DieselCar("5","VolksWagen","Passat",5,22,true));
        electric.addCar(new ElectricCar("6","Skoda","Enyaq Premium 85",5,82,557));
        diesel.addCar(new DieselCar("7","Mowag","Piranha 5",3,2,true));

        FleetOfCars fleet = new FleetOfCars();

        fleet.addList(electric.getFleet());
        fleet.addList(gasoline.getFleet());
        fleet.addList(diesel.getFleet());

        fleet.saveFleetToFile();

        System.out.println(fleet);
        System.out.println("Total registration fee for fleet of cars: "+fleet.getTotalRegistrationFeeForFleet()+",-");



    }
}