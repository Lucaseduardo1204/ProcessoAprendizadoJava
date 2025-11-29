package memoriaarrayslistas.exerciciosvetores;

import memoriaarrayslistas.exerciciosvetores.entities.PersonEx3;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
//tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
//bem como os nomes dessas pessoas caso houver.
public class Exercicio3 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("How many people will be registered? ");
        int numberOfPeople = sc.nextInt();

        PersonEx3[] people = new PersonEx3[numberOfPeople];

        for(int i=0; i<people.length; i++){
            System.out.println("Name of the person: ");
            String name = sc.next();
            System.out.println("Age of the person: ");
            int age = sc.nextInt();
            System.out.println("Height of the person: ");
            double height = sc.nextDouble();
            people[i] = new PersonEx3(name, age, height);
        }

        double averageHeight = 0;
        for (int i=0; i<people.length; i++){
            averageHeight += people[i].getHeight();
        }
        averageHeight /= people.length;

        double minorOf16 = 0;
        int[] position = new int[people.length];
        for (int i=0; i<people.length; i++){
            if (people[i].getAge()<16){
                minorOf16++;
                position[i] = i;
            }
        }
        minorOf16 = (minorOf16 / people.length) * 100;

        System.out.printf("\nAverage Height: %.2f ", averageHeight);
        System.out.println("Percentage of Minors: " + minorOf16);
        for (int i=0; i<people.length; i++){
            if (people[i].getAge()<16){
                System.out.println(people[i].getName());
            }
        }

    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class alturas {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, nmenores;
//        double alturatotal, alturamedia, percentualMenores;
//
//        System.out.print("Quantas pessoas serao digitadas? ");
//        n = sc.nextInt();
//
//        String[] nomes = new String[n];
//        int[] idades = new int[n];
//        double[] alturas = new double[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("Dados da %da pessoa:\n", i + 1);
//            System.out.print("Nome: ");
//            nomes[i] = sc.next();
//            System.out.print("Idade: ");
//            idades[i] = sc.nextInt();
//            System.out.print("Altura: ");
//            alturas[i] = sc.nextDouble();
//        }
//
//        nmenores = 0;
//        alturatotal = 0;
//        for (int i=0; i<n; i++) {
//            if (idades[i] < 16) {
//                nmenores++;
//            }
//            alturatotal = alturatotal + alturas[i];
//        }
//
//        alturamedia = alturatotal / n;
//        percentualMenores = ((double)nmenores / n) * 100.0;
//
//        System.out.printf("\nAltura media = %.2f\n", alturamedia);
//        System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
//
//        for(int i=0; i<n; i++) {
//            if (idades[i] < 16) {
//                System.out.printf("%s\n", nomes[i]);
//            }
//        }
//
//        sc.close();
//    }
//}
