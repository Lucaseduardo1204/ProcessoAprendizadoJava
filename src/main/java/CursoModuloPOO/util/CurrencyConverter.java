package CursoModuloPOO.util;


import java.util.Scanner;// Esta classe tem como objetivo consolidar os conhecimentos sobre membros estáticos.
// Membros estáticos são atributos ou métodos que pertencem à própria classe, e não a objetos individuais.
// Isso significa que podem ser acessados sem a necessidade de instanciar a classe,
// utilizando apenas o nome da classe.
// Eles são usados quando o comportamento ou o dado não depende de um objeto específico.
// Para declarar um membro estático, utilizamos a palavra-chave 'static'.
public class CurrencyConverter {
    public static final double DOLLAR_PRICE = 3.10;

    public static double DollarsToBeBought(double dollarValue) {
        double finalValue = dollarValue * DOLLAR_PRICE;
        return finalValue + (finalValue * 0.06);
    }


}


//TESTES DO MAIN
//        Scanner sc = new Scanner(System.in);
//        System.out.printf("What is the dollar price? %.2f \n", CurrencyConverter.DOLLAR_PRICE);
//        System.out.println("How many dollars will be bought? ");
//        double dollarValue = sc.nextDouble();
//        System.out.printf("Amount to be paid in R$: %.2f", CurrencyConverter.DollarsToBeBought(dollarValue));

