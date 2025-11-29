package memoriaarrayslistas.exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
//aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
//digitado, mostrar a mensagem "NENHUM NUMERO PAR"
public class Exercicio8 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of elements in vector: ");
        int elementsInVector = sc.nextInt();

        int evenNumbers = 0;
        int[] numbers = new int[elementsInVector];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Type a number: ");
            numbers[i] = sc.nextInt();
            if (numbers[i] % 2 == 0) {
                evenNumbers++;
            }
        }

        double evenAverage, sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0 || numbers[i] == 0) {
                sum += numbers[i];
            }
        }
        evenAverage = sum / evenNumbers;

        if (evenNumbers > 0) {
            System.out.println("Even numbers average: " + evenAverage);
        } else {
            System.out.println("There is no even number in the list.");
        }
    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class media_pares {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, somapares = 0, npares = 0;
//        double mediapares;
//
//        System.out.print("Quantos elementos vai ter o vetor? ");
//        n = sc.nextInt();
//
//        int[] vetor = new int[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.print("Digite um numero: ");
//            vetor[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<n; i++) {
//            if (vetor[i] % 2 == 0) {
//                somapares = somapares + vetor[i];
//                npares++;
//            }
//        }
//
//        if (npares == 0) {
//            System.out.println("NENHUM NUMERO PAR");
//        }
//        else {
//            mediapares = (double)somapares / npares;
//
//            System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
//        }
//
//        sc.close();
//    }
//}