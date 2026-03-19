package util;

public class CurrencyConverter {

    // 6% de IOF
    public final static double IOF = 0.06;

    public static double conversion(double dolar, double value){
        // valorSemImposto = value * dolar
        // valorDoImposto = valorSemImposto * IOF
        // valorComImposto = valorSemImposto + valorDoImposto
        return dolar * value * (1 + IOF);
    }
}
