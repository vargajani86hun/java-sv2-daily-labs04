package day03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Stock stock = new Stock(Arrays.asList(1.23, 4.35, 0.23, 4.0, 8.4));
        System.out.println(stock.maxProfit());

        Stock stock2 = new Stock(Arrays.asList(12.0, 2.0, 8.0, 4.0));
        System.out.println(stock2.maxProfit());

        Stock stock3 = new Stock(Arrays.asList(9.2, 4.3, 8.7, 6.6, 3.9, 3.3));
        System.out.println(stock3.maxProfit());
    }
}
