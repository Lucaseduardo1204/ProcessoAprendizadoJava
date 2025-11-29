package memoriaarrayslistas.exerciciosvetores;

import memoriaarrayslistas.exerciciosvetores.entities.StudentsEx10;

import java.util.Locale;
import java.util.Scanner;

//Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
//no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
//os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
//igual a 6.0 (seis).
public class Exercicio10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Students to register: ");
        int numberOfStudents = sc.nextInt();

        StudentsEx10[] students = new StudentsEx10[numberOfStudents];

        for (int i=0; i<numberOfStudents; i++){
            System.out.println("Name of the student: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("First Grade: ");
            double firstGrade = sc.nextDouble();
            System.out.println("Second Grade: ");
            double secondGrade = sc.nextDouble();
            
            students[i] = new StudentsEx10(name, firstGrade, secondGrade);
        }

        System.out.println("Alunos aprovados: ");
        for (int i= 0; i<students.length; i++){
            if (students[i].pass()){
                System.out.println(students[i].getName());
            }
        }

    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class aprovados {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n;
//        double media;
//
//        System.out.print("Quantos alunos serao digitados? ");
//        n = sc.nextInt();
//
//        String[] nomes = new String[n];
//        double[] notas1 = new double[n];
//        double[] notas2 = new double[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("Digite nome, primeira e segunda nota do %do aluno:\n", i + 1);
//            sc.nextLine();
//            nomes[i] = sc.nextLine();
//            notas1[i] = sc.nextDouble();
//            notas2[i] = sc.nextDouble();
//        }
//
//        System.out.println("Alunos aprovados:");
//
//        for (int i=0; i<n; i++) {
//            media = (notas1[i] + notas2[i]) / 2;
//
//            if(media >= 6.0) {
//                System.out.printf("%s\n", nomes[i]);
//            }
//        }
//
//        sc.close();
//    }
//}
