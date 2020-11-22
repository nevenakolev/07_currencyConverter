package sample;

import java.util.ArrayList;

public class CurrencyConverter {
    //list with currencies and their converting value
    ArrayList<Currency> currencies = new ArrayList<>();

    //methods
    public void init() {
        currencies.add(new Currency("Yen", 123.15));
        currencies.add(new Currency("Dollar", 1.19));
        currencies.add(new Currency("Kuna", 7.56));
        currencies.add(new Currency("Franken", 1.08));
    }

    public ArrayList<Currency> getCurrencies() {
        return this.currencies;
    }
}