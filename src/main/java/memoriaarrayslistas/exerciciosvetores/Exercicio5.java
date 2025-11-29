package memoriaarrayslistas.exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.
public class Exercicio5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many numbers you be type? ");
        int numberOfNumbers = sc.nextInt();

        double[] numbers = new double[numberOfNumbers];

        for (int i=0; i<numbers.length; i++){
            System.out.println("Type a number: ");
            numbers[i] = sc.nextDouble();
        }

        double mostValue=0;
        int positionMostValue=0;
        for (int i=0; i<numbers.length; i++){
            if (numbers[i]>mostValue){
                mostValue = numbers[i];
                positionMostValue = i;
            }
        }

        System.out.println("Most Value: " + mostValue);
        System.out.println("Position of the most value: " + positionMostValue);
    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class maior_posicao {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, posmaior;
//        double maior;
//
//        System.out.print("Quantos numeros voce vai digitar? ");
//        n = sc.nextInt();
//
//        double[] vetor = new double[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite um numero: ");
//            vetor[i] = sc.nextDouble();
//        }
//
//        maior = vetor[0];
//        posmaior = 0;
//
//        for (int i=1; i<n; i++) {
//            if (vetor[i] > maior) {
//                maior = vetor[i];
//                posmaior = i;
//            }
//        }
//
//        System.out.printf("MAIOR VALOR = %.1f\n", maior);
//        System.out.printf("POSICAO DO MAIOR VALOR = %d\n", posmaior);
//
//        sc.close();
//    }
//}