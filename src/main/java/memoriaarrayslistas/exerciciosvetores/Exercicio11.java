package memoriaarrayslistas.exerciciosvetores;

import java.util.Locale;
import java.util.Scanner;

//Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
//que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
//de homens.
public class Exercicio11 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("People to register: ");
        int numberOfPerson = sc.nextInt();

        double[] height = new double[numberOfPerson];
        char[] gender = new char[numberOfPerson];

        double minorHeight = 10, mostHeight = 0, avgOfheight;
        int numberOfMens=0;

        for (int i=0; i<height.length; i++){
            System.out.println("Height of the " + (i+1) + "º person");
            height[i] = sc.nextDouble();
            if (height[i]< minorHeight){
                minorHeight = height[i];
            } else if (height[i]> mostHeight) {
                mostHeight = height[i];
            }
            System.out.println("Gender of the " + (i+1) + "º person");
            gender[i] = sc.next().charAt(0);
            if (gender[i] == 'M' || gender[i] == 'm'){
                numberOfMens++;
            }
        }

        double sum=0;
        for (int i =0; i<height.length; i++){
            if (gender[i] =='F' || gender[i] == 'f') {
                sum += height[i];
            }
        }

        avgOfheight = sum / (height.length - numberOfMens);

        System.out.println("Minor Height: " + minorHeight);
        System.out.println("Most height: " + mostHeight);
        System.out.printf("Average of womans height: %.2f", avgOfheight);
        System.out.println("Number of Mens: " + numberOfMens);
    }
}

//############################# CORREÇÃO #############################################
//import java.util.Locale;
//import java.util.Scanner;
//
//public class dados_pessoas {
//
//    public static void main(String[] args) {
//
//        Locale.setDefault(Locale.US);
//        Scanner sc = new Scanner(System.in);
//
//        int n, qtdhomens, qtdmulheres;
//        double menoraltura, maioraltura, alturafemMedia, alturafemtotal;
//
//        System.out.print("Quantas pessoas serao digitadas? ");
//        n = sc.nextInt();
//
//        double[] alturas = new double[n];
//        char[] generos = new char[n];
//
//        for (int i=0; i<n; i++) {
//            System.out.printf("Altura da %da pessoa: ", i + 1);
//            alturas[i] = sc.nextDouble();
//            System.out.printf("Genero da %da pessoa: ", i + 1);
//            generos[i] = sc.next().charAt(0);
//        }
//
//        menoraltura = alturas[0];
//        maioraltura = alturas[0];
//
//        for (int i=1; i<n; i++) {
//            if (alturas[i] > maioraltura) {
//                maioraltura = alturas[i];
//            }
//            if (alturas[i] < menoraltura) {
//                menoraltura = alturas[i];
//            }
//        }
//
//        qtdhomens = 0;
//        qtdmulheres = 0;
//        alturafemtotal = 0;
//        for (int i=0; i<n; i++) {
//            if (generos[i]=='M') {
//                qtdhomens++;
//            }
//            else {
//                qtdmulheres++;
//                alturafemtotal = alturafemtotal + alturas[i];
//            }
//        }
//
//        alturafemMedia = alturafemtotal / qtdmulheres;
//
//        System.out.printf("Menor altura = %.2f\n", menoraltura);
//        System.out.printf("Maior altura = %.2f\n", maioraltura);
//        System.out.printf("Media das alturas das mulheres = %.2f\n", alturafemMedia);
//        System.out.printf("Numero de homens = %d\n", qtdhomens);
//
//        sc.close();
//    }
//}
