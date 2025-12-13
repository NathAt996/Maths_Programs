package Stock;

abstract class Stock {

    private String symbol;
    private String name;
    private double currentPrice;
    private double oldPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public double getCurrentPrice() {
        return this.currentPrice;
    }

    public double getOldPrice() {
        return this.oldPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public void setOldPrice(double oldPrice) {
        this.oldPrice = oldPrice;
    }
}


