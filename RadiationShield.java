public class RadiationShield{
    private float shieldLevel;
    private float coverage;
    private String material;

    public RadiationShield(float shieldLevel, float coverage, String material) {
        this.shieldLevel = shieldLevel;
        this.coverage = coverage;
        this.material = material;
    }
    public float getShieldLevel() {
        return shieldLevel;
    }
    public float getCoverage() {
        return coverage;
    }
    public String getMaterial() {
        return material;
    }

    public void activate() {
        System.out.println("Mengaktifkan perisai anti radiasi");
        shieldLevel = 100.0f;
    }
    public void absorbRadiation(){
        System.out.println("Menyerap radiasi");
        coverage += 10.0f;
        System.out.println("area perlindungan"+coverage+"Meter");
    }
    public void getStatus() {
        System.out.println("Shield Level: " + shieldLevel + "%");
        System.out.println("Coverage: " + coverage + "M");
        System.out.println("Material: " + material);
    }
}