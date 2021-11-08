package day03;

import java.util.List;

public class Stock {
    private List<Double> prices;

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        int minimum = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(minimum) > prices.get(i)) {
                minimum = i;
            }
        }
        int maximum = minimum;
        for (int i = minimum + 1; i < prices.size(); i++) {
            if (prices.get(i) > prices.get(maximum)) {
                maximum = i;
            }
        }
        return prices.get(maximum) - prices.get(minimum);
    }
}
