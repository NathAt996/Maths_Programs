package SolarSystem;

abstract class Planet {

    private String name;
    private double mass;
    private double distanceFromSun;

    public Planet(String name, double mass, double distanceFromSun) {
        this.name = name;
        this.mass = mass;
        this.distanceFromSun = distanceFromSun;
    }

    public String getName() {
        return name;
    }

    public void orbit() {
        System.out.println(name + " is orbiting the sun");
    }
}
