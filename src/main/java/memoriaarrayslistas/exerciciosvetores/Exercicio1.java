package memoriaarrayslistas.exerciciosvetores;

import java.util.Scanner;

//Faça um programa que leia um número inteiro positivo N (máximo = 10) e depois N números inteiros
//e armazene-os em um vetor. Em seguida, mostrar na tela todos os números negativos lidos.

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Numero de numeros digitados = ");
        int n = sc.nextInt();
        if (n <= 0 || n > 10) {
            System.out.println("Número inválido");
        } else {
            int[] numeros = new int[n];

            for (int i = 0; i < n; i++) {
                System.out.println("Digite um número inteiro: ");
                int numero = sc.nextInt();
                numeros[i] = numero;
            }

            System.out.println("Numeros negativos: ");
            for (int i = 0; i < numeros.length; i++) {
                if (numeros[i] < 0) {
                    System.out.println(numeros[i]);
                }
            }

        }


    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class negativos {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n;
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
//        System.out.println("NUMEROS NEGATIVOS:");
//
//        for (int i=0; i<n; i++) {
//            if (vetor[i] < 0) {
//                System.out.printf("%d\n", vetor[i]);
//            }
//        }
//
//        sc.close();
//    }
//}
