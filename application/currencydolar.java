package application;

import java.util.Locale;
import java.util.Scanner;
import currency.CurrencyConverter;
//conversion brl to dolar + tax
public class currencydolar {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the dollar price?", CurrencyConverter.dolar);
        CurrencyConverter.dolar = sc.nextDouble();
        System.out.printf("How many dollar will be bought?", CurrencyConverter.amount);
        CurrencyConverter.amount = sc.nextDouble();
        System.out.printf("Amount to be paid in reais = %.2f", CurrencyConverter.iof());
        sc.close();
    }
}