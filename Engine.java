public class Engine {
    private String engineType;
    private int engineCC;
    private boolean engineStatus;
    private String currentMode;
    private float temperature;

    public Engine(String engineType, int engineCC, boolean engineStatus,
                  String currentMode, float temperature) {
        this.engineType = engineType;
        this.engineCC = engineCC;
        this.engineStatus = engineStatus;
        this.currentMode = currentMode;
        this.temperature = temperature;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getEngineCC() {
        return engineCC;
    }

    public boolean getEngineStatus() {
        return engineStatus;
    }

    public String getCurrentMode() {
        return currentMode;
    }

    public float getTemperature() {
        return temperature;
    }

    public void startEngine() {
        System.out.println("Mesin dinyalakan...");
        engineStatus = true;
    }

    public void stopEngine() {
        System.out.println("Mesin dimatikan...");
        engineStatus = false;
    }

    public void setMode(String mode) {
        System.out.println("Mode kendaraan diubah ke " + mode);
        currentMode = mode;
    }

    public void checkEngineStatus() {
        System.out.println("===== STATUS ENGINE =====");
        System.out.println("Tipe Mesin : " + engineType);
        System.out.println("Kapasitas  : " + engineCC + " CC");
        System.out.println("Status     : " + (engineStatus ? "Aktif" : "Mati"));
        System.out.println("Mode       : " + currentMode);
        System.out.println("Suhu Mesin : " + temperature + " C");
    }
}