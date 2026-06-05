public class Battery {
    private String batteryType;
    private float batteryCapacity;
    private int batteryLevel;
    private float voltage;
    private String batteryHealth;

    public Battery(String batteryType, float batteryCapacity,
                   int batteryLevel, float voltage,
                   String batteryHealth) {
        this.batteryType = batteryType;
        this.batteryCapacity = batteryCapacity;
        this.batteryLevel = batteryLevel;
        this.voltage = voltage;
        this.batteryHealth = batteryHealth;
    }

    public String getBatteryType() {
        return batteryType;
    }

    public float getBatteryCapacity() {
        return batteryCapacity;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public float getVoltage() {
        return voltage;
    }

    public String getBatteryHealth() {
        return batteryHealth;
    }

    public void chargeBattery() {
        System.out.println("Mengisi daya baterai...");

        batteryLevel += 20;

        if (batteryLevel > 100) {
            batteryLevel = 100;
        }

        System.out.println("Level baterai saat ini: " + batteryLevel + "%");
    }

    public void checkBatteryLevel() {
        System.out.println("Level baterai: " + batteryLevel + "%");

        if (batteryLevel < 20) {
            System.out.println("Peringatan: Daya baterai rendah!");
        }
    }

    public void activatePowerSaving() {
        System.out.println("Mode hemat daya diaktifkan.");
    }

    public void runHealthCheck() {
        System.out.println("Memeriksa kondisi baterai...");
        System.out.println("Kesehatan baterai: " + batteryHealth);
    }
}