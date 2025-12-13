package Rectangle;

public class AbstractRectangle {

    private double width;
    private double height;

    public AbstractRectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }
}
