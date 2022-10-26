public class Main {
    public static void main(String[] args) {

        ElectricCar eCar = new ElectricCar("Sexy Elon", "Tesla", "Model S", 4, 85, 575);

        GasolineCar gCar = new GasolineCar("ÜberCool", "Ford", "Mustang", 2, 6);

        DieselCar dCar = new DieselCar("Monster", "Jeep", "Wrangler", 5, 10, true);

        FleetOfCars myFleet = new FleetOfCars();

        myFleet.addCar(eCar);
        myFleet.addCar(gCar);
        myFleet.addCar(dCar);

        System.out.println(myFleet);
    }
}