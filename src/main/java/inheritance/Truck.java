package inheritance;

public class Truck extends FuelAuto {

    private int cargoWeight;

    public Truck(String producer, String model, Engine engine, int availablePetrol, int tankVolume, int cargoWeight) {
        super(producer, model, engine, availablePetrol, tankVolume);
        this.cargoWeight = cargoWeight;
        System.out.println("Truck was initialized");
    }

    public int getCargoWeight() {
        return cargoWeight;
    }

    public void setCargoWeight(int cargoWeight) {
        this.cargoWeight = cargoWeight;
    }

    public void load() {
        System.out.println("Cargo load");
    }

    public void unload() {
        System.out.println("Cargo unloaded");
    }
}
