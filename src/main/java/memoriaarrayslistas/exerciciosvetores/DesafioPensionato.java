package memoriaarrayslistas.exerciciosvetores;

import memoriaarrayslistas.exerciciosvetores.entities.StudentsRoom;

import java.util.Scanner;

//A dona de um pensionato possui dez quartos para alugar para estudantes, sendo esses quartos identificados pelos
//números 0 a 9.
//Fazer um programa que inicie com todos os dez quartos vazios, e depois leia uma quantidade N representando o número de
//estudantes que vão alugar quartos (N pode ser de 1 a 10). Em seguida, registre o aluguel dos N estudantes.
//
// Para cada registro de aluguel, informar o nome e email do estudante, bem como qual dos quartos ele escolheu (de 0 a 9). Suponha
//que seja escolhido um quarto vago. Ao final, seu programa deve imprimir um relatório de todas ocupações do pensionato,
//por ordem de quarto, conforme exemplo.
public class DesafioPensionato {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("How many students will be rented: ");
        int numberOfStudents =  sc.nextInt();
        sc.nextLine();

        String[] rooms = new String[10];
        StudentsRoom[] students = new StudentsRoom[10];

        for(int i=0; i<numberOfStudents; i++){
            System.out.println("Rent #" + (i+1));
            System.out.println("Name: ");
            String name = sc.nextLine();
            System.out.println("Email: ");
            String email = sc.nextLine();
            System.out.println("Room: ");
            int numberOfRoom = sc.nextInt();
            sc.nextLine();
            students[numberOfRoom-1] = new StudentsRoom(name, email);

        }

        for(int i=0; i<students.length; i++){
            if (students[i] != null){
                System.out.println((i+1) +  ":" + students[i].toString());
            }
        }



    }
}
