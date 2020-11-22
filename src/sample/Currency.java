package sample;

public class Currency {
    //attributes
    private String sign;
    private double convertValue;

    //constructor
    Currency() {

    }

    Currency(String sign, double convertValue) {
        this.sign = sign;
        this.convertValue = convertValue;
    }

    //getter and setter
    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }

    public void setConvertValue(double convertValue) {
        this.convertValue = convertValue;
    }

    public double getConvertValue() {
        return convertValue;
    }
}
