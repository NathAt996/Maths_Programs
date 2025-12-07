package Circles;

public class Circle implements Circle_Interface {

    private double radius;

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        if(radius <= 0) {
            System.out.println("Invalid radii value");
        }

        return Math.PI * (radius * radius);
    }

    @Override
    public double getPerimeter() {
        if(radius <= 0) {
            System.out.println("Invalid radii value");
        }

        return 2 * Math.PI * radius;
    }
}