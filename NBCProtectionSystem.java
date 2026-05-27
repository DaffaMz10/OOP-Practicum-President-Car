public class NBCProtectionSystem{
    private String threatLevel;
    private String filterStatus;
    private float sealIntegrity;

    public NBCProtectionSystem(String threatLevel, String filterStatus, float sealIntegrity) {
        this.threatLevel = threatLevel;
        this.filterStatus = filterStatus;
        this.sealIntegrity = sealIntegrity;
    }
    public String getThreatLevel() {
        return threatLevel;
    }
    public String getFilterStatus() {
        return filterStatus;
    }
    public float getSealIntegrity() {
        return sealIntegrity;
    }

    public void activateSeal(){
        System.out.println("Mengaktifkan segel...");
        sealIntegrity = 100.0f;
    }
    public void filterAir() {
        System.out.println("sedang Memfilter udara...");
        filterStatus = "Menyala";
    }
    public void detectHazard() {
        System.out.println("Mendeteksi Bahaya ...");
        if (threatLevel.equalsIgnoreCase("Tinggi")) {
            System.out.println("Tingkat ancaman tinggi");
        } else if (threatLevel.equalsIgnoreCase("Sedang")) {
            System.out.println("Tingkat ancaman sedang");
        } else if (threatLevel.equalsIgnoreCase("Rendah")) {
            System.out.println("Tingkat ancaman rendah");
        } else {
            System.out.println("Kondisi Aman");
        }
    }
}