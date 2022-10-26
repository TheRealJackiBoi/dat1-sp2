import java.util.ArrayList;

public class FleetOfCars {

    private final ArrayList<Car> fleet = new ArrayList<>();

    public FleetOfCars() {}

    public void addCar(Car car) {
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet() {
        int totalfee = 0;

        for (Car c :
                fleet) {
            totalfee += c.getRegistrationFee();
        }
      return totalfee;
    }

    @Override
    public String toString() {
        return "FleetOfCars{\n" +
                "fleet= \n" + fleet +
                "\ntotal registrationfee= " + getTotalRegistrationFeeForFleet() +
                "\n}";
    }
}
