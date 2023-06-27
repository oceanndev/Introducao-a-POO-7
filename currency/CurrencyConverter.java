package currency;

public class CurrencyConverter {
    public static double dolar;
    public static double amount;
    public static double iof(){
        return amount * dolar * 0.06 + amount * dolar;
    }
}
