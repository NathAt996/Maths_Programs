package Stock;

public class StockApplied extends Stock {

    private double changePercentage;

    public StockApplied(String symbol, String name, double previousClosingPrice, double currentPrice) {
        super(symbol, name);
        setOldPrice(previousClosingPrice);
        setCurrentPrice(currentPrice);
    }

    public double getChangePercentage() {
        return ((getCurrentPrice() - getOldPrice()) / getOldPrice()) * 100;
    }
}
