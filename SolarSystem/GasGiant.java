package SolarSystem;

public class GasGiant extends Planet {

    public GasGiant(String name, double mass, double distanceFromSun) {
        super(name, mass, distanceFromSun);
    }

    @Override
    public void orbit() {
        super.orbit();
        System.out.println(getName() + " moves slowly around the sun with no surface");
    }
}
