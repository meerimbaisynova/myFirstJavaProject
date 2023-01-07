package hashmap;

import java.util.HashMap;

public class StockPrice {
    public static void main(String[] args) {
        HashMap<String, Double> stock = new HashMap<>();
        stock.put("apple", 400.90);
        stock.put("tesla", 1200.32);
        stock.put("meta", 300.43);
        stock.put("bofa", 5.5);
        stock.put("slack", 123.54);

        findTheHighestPrice(stock);

        HashMap<String, Double> stocks = new HashMap<>();
        stock.put("apple", 400.90);
        stock.put("banana", 5.32);
        stock.put("grapes", 3430.43);
        stock.put("coke", 5.5);
        stock.put("lemon", 123.54);
        findTheAveragePrice(stocks);


    }

    public static double findTheHighestPrice(HashMap<String, Double> stocks) {
        double highest = 0;
        for (String key : stocks.keySet()) {
            if (stocks.get(key) > highest) {
                highest = stocks.get(key);
            }
        }
        System.out.println(highest);
        return highest;
    }

    public static double findTheAveragePrice(HashMap<String, Double> stocks) {
        double average = 0;
        double sum = 0;

        for (String x : stocks.keySet()) {
            sum += stocks.get(x);
        }
        average = sum / stocks.size();
        System.out.println(average);
        return average;
    }
}
