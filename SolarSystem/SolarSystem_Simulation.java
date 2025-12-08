package SolarSystem;

import java.util.ArrayList;
import java.util.List;

public class SolarSystem_Simulation {

    public static void main(String[] args) {

        List<Planet> planets = new ArrayList<>();

        planets.add(new RockyPlanet("Mercury", 3.30e23, 0.39));
        planets.add(new RockyPlanet("Earth", 5.97e24, 1.0));
        planets.add(new GasGiant("Jupiter", 1.89e27, 5.2));
        planets.add(new GasGiant("Neptune", 1.02e26, 30.1));

        System.out.println("--- Initialising Solar System Simulation ---");

        for(Planet p : planets) {
            p.getName();
            p.orbit();

            System.out.println();

        }
    }
}
