package day03;

import java.util.List;

public class Stock {
    private List<Double> prices;

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        int minimum = getMinimumIndex();
        int maximum = getMaximumIndexFromStart(minimum);
        return prices.get(maximum) - prices.get(minimum);
    }

    private int getMinimumIndex() {
        int minimum = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(minimum) > prices.get(i)) {
                minimum = i;
            }
        }
        return minimum;
    }

    private int getMaximumIndexFromStart(int startIndex) {
        int maximum = startIndex;
        for (int i = startIndex + 1; i < prices.size(); i++) {
            if (prices.get(i) > prices.get(maximum)) {
                maximum = i;
            }
        }
        return maximum;
    }
}
