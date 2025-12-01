public class Car_Obj {

    private double miles;
    private double gas;

    public Car_Obj (double miles, double gas) {
        this.miles = miles;
        this.gas = gas;
    }

    public double fuelEfficiency() {
        if (gas <= 0) {
            return 0.0;
        }

        else {
            return this.miles / this.gas;
        }
    }
}
