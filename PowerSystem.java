public class PowerSystem {
    private boolean hybridStatus;
    private String currentSource;

    private FuelSystem fuelSystem;
    private Battery battery;

    public PowerSystem(boolean hybridStatus, String currentSource,
                       FuelSystem fuelSystem, Battery battery) {
        this.hybridStatus = hybridStatus;
        this.currentSource = currentSource;
        this.fuelSystem = fuelSystem;
        this.battery = battery;
    }

    public boolean getHybridStatus() {
        return hybridStatus;
    }

    public String getCurrentSource() {
        return currentSource;
    }

    public FuelSystem getFuelSystem() {
        return fuelSystem;
    }

    public Battery getBattery() {
        return battery;
    }

    public void switchPowerMode() {
        if (currentSource.equals("Fuel")) {
            currentSource = "Battery";
        } else {
            currentSource = "Fuel";
        }

        System.out.println("Sumber energi berpindah ke: " + currentSource);
    }

    public void activateHybridMode() {
        hybridStatus = true;
        System.out.println("Mode hybrid diaktifkan.");
    }

    public void getPowerSource() {
        System.out.println("Sumber energi saat ini: " + currentSource);
    }
}