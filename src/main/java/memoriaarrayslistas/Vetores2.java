package memoriaarrayslistas;

import memoriaarrayslistas.entities.Product;

import java.util.Locale;
import  java.util.Scanner;

//Criar um vetor cujo os elementos são objetos do tipo classe
public class Vetores2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Numbers of elements to be insert: ");
        int n = sc.nextInt();

        Product[] products= new Product[n];

        for(int i=0; i<products.length;i++){
            System.out.println("Name: ");
            String name = sc.next();
            System.out.println("Price: ");
            double price = sc.nextDouble();
            products[i] = new Product(name, price);
        }

        double sum = 0.0;

        for (int i=0; i<products.length; i++){
            sum += products[i].price;
        }
        double avg = sum / products.length;
        System.out.printf("AVERAGE PRICE: %.2f ", avg);

    }
}
