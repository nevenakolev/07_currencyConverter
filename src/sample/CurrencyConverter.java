package sample;

import java.util.ArrayList;

public class CurrencyConverter {
    //attributes
    double multiplicationFactor = 124.35;
    //list with currencies
    ArrayList<String> currencies = new ArrayList<>();

    //methods
    public double euroToYen(double euro) {
        return euro * multiplicationFactor;
    }

    public void init() {
        currencies.add("Yen");
        currencies.add("Dollar");
        currencies.add("Kuna");
        currencies.add("Franken");
    }
}