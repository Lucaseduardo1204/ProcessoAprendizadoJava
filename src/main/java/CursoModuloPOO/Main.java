package CursoModuloPOO;


import CursoModuloPOO.util.CurrencyConverter;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("What is the dollar price? %.2f \n", CurrencyConverter.DOLLAR_PRICE);
        System.out.println("How many dollars will be bought? ");
        double dollarValue = sc.nextDouble();
        System.out.printf("Amount to be paid in R$: %.2f", CurrencyConverter.DollarsToBeBought(dollarValue));
    }
}
