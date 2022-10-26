public class DieselCar extends AFuelCar{
    private final boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, "Diesel");
        this.particleFilter = particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        int kmPrLitre = super.getKmPrLitre();
        if(kmPrLitre >= 20 && kmPrLitre < 50){
            fee = 330 + 130;
        } else if (kmPrLitre >= 15) {
            fee = 1050 + 1390;
        } else if (kmPrLitre >= 10) {
            fee = 2340 + 1850;
        } else if (kmPrLitre >= 5) {
            fee = 5500 + 2770;
        } else {
            fee = 10470 + 15260;
        }

        if (!particleFilter) {
            fee += 1000;
        }

        return fee;
    }

    public boolean hasParticleFilter() {
        return particleFilter;
    }

    @Override
    public String toString() {
        return super.toString() +  ", has a particlefilter: " + particleFilter + "\n";
    }
}
