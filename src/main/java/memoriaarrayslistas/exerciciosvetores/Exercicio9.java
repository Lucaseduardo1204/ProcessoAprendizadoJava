package memoriaarrayslistas.exerciciosvetores;

import java.util.Scanner;

//Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
//devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
//da pessoa mais velha.
public class Exercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("People to register: ");
        int people = sc.nextInt();

        String[] names = new String[people];
        int[] age = new int[people];

        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: ");
            names[i] = sc.next();
            System.out.println("Age: ");
            age[i] = sc.nextInt();
        }

        String nameOfOlderPerson = null;
        int ageOfOlderPerson = 0;

        for (int i = 0; i < age.length; i++) {
            if (age[i] > ageOfOlderPerson) {
                ageOfOlderPerson = age[i];
                nameOfOlderPerson = names[i];
            }
        }

        System.out.println("Older Person: " + nameOfOlderPerson);
    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class mais_velho {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, maioridade, posicaomaior;
//
//        System.out.print("Quantas pessoas voce vai digitar? ");
//        n = sc.nextInt();
//
//        String[] nomes = new String[n];
//        int[] idades = new int[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("Dados da %da pessoa:\n", i + 1);
//            System.out.print("Nome: ");
//            nomes[i] = sc.next();
//            System.out.print("Idade: ");
//            idades[i] = sc.nextInt();
//        }
//
//        maioridade = idades[0];
//        posicaomaior = 0;
//
//        for (int i=1; i<n; i++) {
//            if (idades[i] > maioridade) {
//                maioridade = idades[i];
//                posicaomaior = i;
//            }
//        }
//
//        System.out.printf("PESSOA MAIS VELHA: %s\n", nomes[posicaomaior]);
//
//        sc.close();
//    }
//}
