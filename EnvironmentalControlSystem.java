public class EnvironmentalControlSystem {
    private String airQuality;
    private float temperature;
    private float pressure;
    private float radiationLevel;
    private String mode;
    private NBCProtectionSystem nbcProtectionSystem;
    private RadiationShield radiationShield;

    public EnvironmentalControlSystem(String airQuality, float temperature, float pressure, float radiationLevel, String mode, NBCProtectionSystem nbcProtectionSystem, RadiationShield radiationShield) {
        this.airQuality = airQuality;
        this.temperature = temperature;
        this.pressure = pressure;
        this.radiationLevel = radiationLevel;
        this.mode = mode;
        this.nbcProtectionSystem = nbcProtectionSystem;
        this.radiationShield = radiationShield;
    }
    public NBCProtectionSystem getNbcProtectionSystem() {
        return nbcProtectionSystem;
    }
    public RadiationShield getRadiationShield() {
        return radiationShield;
    }
    public String getAirQuality() {
        return airQuality;
    }
    public float getTemperature() {
        return temperature;
    }
    public float getPressure() {
        return pressure;
    }   
    public float getRadiationLevel() {
        return radiationLevel;
    }
    public String getMode() {
        return mode;
    }
    public void purifyAir() {
        System.out.println("membersihkan udara...");
        airQuality = "Clean";
    }
    public void maintainPressure() {
        System.out.println("mengatur ulang tekanan udara...");
        pressure = 101.3f;
    }
    public void detectHazard() {
        System.out.println("Mendeteksi Bahaya ...");
        if (radiationLevel > 5.0f) {
            System.out.println("peringatan: radiasi tinggi");
        } else {
            System.out.println("Aman");
        }
    }
    public void getStatus() {
        System.out.println("Air Quality: " + airQuality);
        System.out.println("Temperature: " + temperature + " C");
        System.out.println("Pressure: " + pressure + " kPa");
        System.out.println("Radiation Level: " + radiationLevel + " mSv/h");
        System.out.println("Mode: " + mode);
    }
}