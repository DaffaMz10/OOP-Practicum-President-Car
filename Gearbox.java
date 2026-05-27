import java.util.Scanner;

public class Gearbox {

    private float gearRatio;
    private float fluidTemperature;
    private int currentGear;
    private boolean synchroStatus;
    private String activeDifferential;

    // Constructor
    public Gearbox() {
        gearRatio = 3.5f;
        fluidTemperature = 80.0f;
        currentGear = 0;
        synchroStatus = true;
        activeDifferential = "Open Differential";
    }

    // Method pilih gear
    public boolean selectGear(int targetGear) {

        if (targetGear >= 0 && targetGear <= 6) {

            currentGear = targetGear;

            System.out.println("Gear berhasil dipindah ke "
                    + currentGear);

            return true;

        } else {

            System.out.println("Gear tidak valid!");
            return false;
        }
    }

    // Method cek suhu
    public void checkFluidTemperature() {

        System.out.println("Suhu gearbox: "
                + fluidTemperature + "°C");

        if (fluidTemperature > 120) {
            System.out.println("Suhu terlalu panas!");
        }
    }

    // Method differential
    public void engageDifferential(String type) {

        activeDifferential = type;

        System.out.println("Differential aktif: "
                + activeDifferential);
    }

    // Method reset
    public void resetToNeutral() {

        currentGear = 0;

        System.out.println("Gear kembali ke netral");
    }

    // Method hitung efisiensi
    public float calculateEfficiency() {

        float efficiency;

        if (fluidTemperature < 90) {
            efficiency = gearRatio * 0.95f;
        } else {
            efficiency = gearRatio * 0.85f;
        }

        return efficiency;
    }

    // Main program
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Gearbox gearbox = new Gearbox();

        int menu;

        do {

            System.out.println("\n=== MENU GEARBOX ===");
            System.out.println("1. Ganti Gear");
            System.out.println("2. Cek Suhu");
            System.out.println("3. Ganti Differential");
            System.out.println("4. Hitung Efisiensi");
            System.out.println("5. Reset Netral");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");

            menu = input.nextInt();
            input.nextLine();

            switch (menu) {

                case 1:

                    System.out.print("Masukkan gear (0-6): ");
                    int gear = input.nextInt();

                    gearbox.selectGear(gear);
                    break;

                case 2:

                    gearbox.checkFluidTemperature();
                    break;

                case 3:

                    System.out.print("Masukkan jenis differential: ");
                    String diff = input.nextLine();

                    gearbox.engageDifferential(diff);
                    break;

                case 4:

                    System.out.println("Efisiensi gearbox: "
                            + gearbox.calculateEfficiency());
                    break;

                case 5:

                    gearbox.resetToNeutral();
                    break;

                case 6:

                    System.out.println("Program selesai");
                    break;

                default:

                    System.out.println("Menu tidak tersedia");
            }

        } while (menu != 6);

        input.close();
    }
}