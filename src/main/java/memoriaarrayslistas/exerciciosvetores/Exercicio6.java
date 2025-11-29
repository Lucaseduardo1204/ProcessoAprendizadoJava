package memoriaarrayslistas.exerciciosvetores;

import java.util.Scanner;

//Faça um programa para ler dois vetores A e B, contendo N elementos cada. Em seguida, gere um
//terceiro vetor C onde cada elemento de C é a soma dos elementos correspondentes de A e B. Imprima
//o vetor C gerado.
public class Exercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many elements will a vector have?” ");
        int numberOfElements = sc.nextInt();

        System.out.println("Values from vector A: ");
        int[] vectorA = new int[numberOfElements];
        for (int i=0; i<vectorA.length; i++){
            vectorA[i] = sc.nextInt();
        }

        System.out.println("Values from vector B: ");
        int[] vectorB = new int[numberOfElements];
        for (int i=0; i<vectorB.length; i++){
            vectorB[i] = sc.nextInt();
        }

        System.out.println("Vetor Resultante ");

        int[] vectorC = new int[numberOfElements];
        for (int i=0; i<vectorA.length; i++){
            vectorC[i]= vectorA[i] + vectorB[i];
            System.out.println(vectorC[i]);
        }

    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class soma_vetores {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//
//        System.out.print("Quantos valores vai ter cada vetor? ");
//        n = sc.nextInt();
//
//        int[] a = new int[n];
//        int[] b = new int[n];
//        int[] c = new int[n];
//
//        System.out.println("Digite os valores do vetor A:");
//
//        for (int i=0; i<n; i++) {
//            a[i] = sc.nextInt();
//        }
//
//        System.out.println("Digite os valores do vetor B:");
//
//        for (int i=0; i<n; i++) {
//            b[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<n; i++) {
//            c[i] = a[i] + b[i];
//        }
//
//        System.out.println("VETOR RESULTANTE:");
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("%d\n", c[i]);
//        }
//
//        sc.close();
//    }
//}
