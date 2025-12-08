package SolarSystem;

public class RockyPlanet extends Planet {

    public RockyPlanet(String name, double mass, double distanceFromSun) {
        super(name, mass, distanceFromSun);
    }

    @Override
    public void orbit() {
        super.orbit();
        System.out.println(getName() + " moves quickly around the sun with a solid surface");
    }
}
