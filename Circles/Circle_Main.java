package Circles;

import java.util.ArrayList;
import java.util.List;

public class Circle_Main {

    List<Circle> circles = new ArrayList<>();

    public Circle_Main() {
        circles.add(new Circle(1.0));
        circles.add(new Circle(1.5));
        circles.add(new Circle(2.0));
        circles.add(new Circle(2.5));
    }

    public void processCircles() {

        System.out.println("--- Circles ---");
        for (Circle circle : circles) {
            System.out.println("Circle with radius " + circle.getRadius() + ":");
            System.out.println("  Area: " + circle.getArea());
            System.out.println("  Perimeter: " + circle.getPerimeter());
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Circle_Main mainApp = new Circle_Main();
        mainApp.processCircles();
    }
}