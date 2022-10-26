public class ElectricCar extends ACar {
    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors, int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityiKWH() {
        return batteryCapacity;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public int getWhPrKm() {
        return batteryCapacity * 1000 / maxRange;
    }

    //Grundet det er en elbil, og de kører "lang på literen", har jeg valgt at ændre conditionals fra mellem 20 og 50 til at være 20 og opad, ellers ville der ikke være nogen afgift.
    public int getRegistrationFee() {
        int kmPrLitre = (int)Math.floor(100 / (getWhPrKm() / 91.25));
        if(kmPrLitre >= 20){
            return 330;
        } else if (kmPrLitre >= 15) {
            return 1050;
        } else if (kmPrLitre >= 10) {
            return 2340;
        } else if (kmPrLitre >= 5) {
            return 5500;
        } else {
            return 10470;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", batterycapacity: " + batteryCapacity + ", maxrange: " + maxRange + ", Wh/Km: " + getWhPrKm() + ", registrationfee: " + getRegistrationFee() + "\n";
    }
}
