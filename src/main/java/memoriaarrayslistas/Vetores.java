package memoriaarrayslistas;

import java.util.Locale;
import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Number of heights: ");
        int n = sc.nextInt();
        double[] vect = new double[n]; // Variavel vect é um vetor do tipo double (double[]), esta é um novo objeto com o tamanho de n (new double[n])

        for (int i=0; i<n; i++ ){
            vect[i] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i=0; i<n; i++){
            sum += vect[i];
        }
        double avg = sum / n;

        System.out.printf("AVERAGE HEIGHT: %.2f ", avg);

        sc.close();
    }
}
