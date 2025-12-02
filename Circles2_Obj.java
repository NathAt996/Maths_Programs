public class Circles2_Obj {

    private double radius = 1;


    public Circles2_Obj (double r) {
        radius = r;
    }

    public double getArea() {
        if (radius <= 0) {
            return 0.00;
        }

        else {
            return Math.PI * radius * radius;
        }
    }

    public double getPerimeter() {
        if (radius <= 0) {
            return 0.00;
        }

        else {
            return 2 * radius * Math.PI;
        }
    }
}
