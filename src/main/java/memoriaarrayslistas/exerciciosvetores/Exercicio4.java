package memoriaarrayslistas.exerciciosvetores;

import java.util.Scanner;

//Faça um programa que leia N números inteiros e armazene-os em um vetor. Em seguida, mostre na
//tela todos os números pares, e também a quantidade de números pares.

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numbers to be typed: ");
        int numberOfNumbers = sc.nextInt();

        int[] numbers = new int[numberOfNumbers];

        for (int i=0; i<numbers.length; i++){
            System.out.println("Type a number: ");
            numbers[i] = sc.nextInt();
        }

        int evenQuantity = 0;

        System.out.println("Numeros pares: ");
        for (int i=0; i<numbers.length; i++){
            if (numbers[i] % 2 == 0 ){
                System.out.print(numbers[i] + " ");
                evenQuantity ++;
            }
        }

        System.out.println("\nQuantidade de pares: " + evenQuantity);

    }
}

//############################# CORREÇÃO #############################################
//import java.util.Scanner;
//
//public class numeros_pares {
//
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int n, qtdpares;
//
//        System.out.print("Quantos numeros voce vai digitar? ");
//        n = sc.nextInt();
//
//        int[] vetor = new int[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite um numero: ");
//            vetor[i] = sc.nextInt();
//        }
//
//        System.out.println("\nNUMEROS PARES:");
//
//        qtdpares = 0;
//        for (int i=0; i<n; i++) {
//            if (vetor[i] % 2 == 0) {
//                System.out.printf("%d  ", vetor[i]);
//                qtdpares++;
//            }
//        }
//
//        System.out.printf("\n\nQUANTIDADE DE PARES = %d\n", qtdpares);
//
//        sc.close();
//    }
//}
