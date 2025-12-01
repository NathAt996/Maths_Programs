public class Rectangle_Obj {

    double width;
    double height;

    public Rectangle_Obj (double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        if (width == 0) {
            return 0.00;
        }

        else if (height == 0) {
            return 0.00;
        }

        else {
            return this.width * this.height;
        }
    }

    public double getPerimeter() {
        if (width == 0) {
            return 0.00;
        }

        else if (height == 0) {
            return 0.00;
        }

        else {
            return 2 * (this.width + this.height);
        }
    }
}
