package sample;

public class CurrencyConverter {
    //attributes
    double multiplicationFactor = 124.35;

    //methods
    public double euroToYen(double euro) {
        return euro * multiplicationFactor;
    }
}