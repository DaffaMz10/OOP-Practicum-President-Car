public class main {
    public static void main(String[] args) {

        Engine engine = new Engine(
                "V8 Twin Turbo",
                5000,
                false,
                "Normal",
                85.0f
        );

        engine.startEngine();
        engine.setMode("Sport");
        engine.checkEngineStatus();
        engine.stopEngine();
        System.out.println(" ");

       FuelSystem fuel = new FuelSystem(
                "Pertamax Turbo",
                80.0f,
                60.0f,
                10.0f
        );

        Battery battery = new Battery(
                "Lithium-Ion",
                120.0f,
                85,
                12.0f,
                "Good"
        );

        PowerSystem power = new PowerSystem(
                false,
                "Fuel",
                fuel,
                battery
        );

        power.getPowerSource();
        power.activateHybridMode();
        power.switchPowerMode();
        power.getPowerSource(); 

     }
}