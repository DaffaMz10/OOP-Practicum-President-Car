public class FuelSystem {
    private String fuelType;
    private float tankCapacity;
    private float fuelLevel;
    private float fuelConsumption;

    public FuelSystem(String fuelType, float tankCapacity,
                      float fuelLevel, float fuelConsumption) {
        this.fuelType = fuelType;
        this.tankCapacity = tankCapacity;
        this.fuelLevel = fuelLevel;
        this.fuelConsumption = fuelConsumption;
    }

    public String getFuelType() {
        return fuelType;
    }

    public float getTankCapacity() {
        return tankCapacity;
    }

    public float getFuelLevel() {
        return fuelLevel;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void refuel(float amount) {
        fuelLevel += amount;

        if (fuelLevel > tankCapacity) {
            fuelLevel = tankCapacity;
        }

        System.out.println("Bahan bakar berhasil diisi.");
        System.out.println("Level bahan bakar saat ini: " + fuelLevel + " Liter");
    }

    public void checkFuelLevel() {
        System.out.println("Level bahan bakar: " + fuelLevel + " Liter");

        if (fuelLevel < (tankCapacity * 0.2)) {
            System.out.println("Peringatan: Bahan bakar rendah!");
        }
    }

    public void activateEcoMode() {
        System.out.println("Mode hemat bahan bakar diaktifkan.");
    }

    public void detectFuelLeak() {
        System.out.println("Memeriksa kebocoran bahan bakar...");

        boolean leakDetected = false;

        if (leakDetected) {
            System.out.println("Peringatan: Kebocoran bahan bakar terdeteksi!");
        } else {
            System.out.println("Tidak ada kebocoran bahan bakar.");
        }
    }
}