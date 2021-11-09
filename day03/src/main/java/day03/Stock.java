package day03;

import java.util.List;

public class Stock {
    private List<Double> prices;

    public Stock(List<Double> prices) {
        this.prices = prices;
    }

    public double maxProfit() {
        double max = 0;

        for (int i = 0; i < prices.size(); i++) {
            max = dailyProfit(max, i);
        }

        return max;
    }

    private double dailyProfit(double max, int i) {
        for (int j = i; j < prices.size(); j++) {
            double profit = prices.get(j) - prices.get(i);
            if (profit > max) {
                max = profit;
            }
        }
        return max;
    }

    private int getMinimumIndexBefore(int limit) {
        int minimum = 0;
        for (int i = 1; i < limit; i++) {
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
