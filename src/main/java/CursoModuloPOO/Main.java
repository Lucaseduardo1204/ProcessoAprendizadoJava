package CursoModuloPOO;


import ConstrutoresThisSobrecargaEncapsulamento.Exercicios.ContaBancaria;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Número da conta: ");
        int numeroConta = sc.nextInt();

        sc.nextLine();

        System.out.print("Nome do titular: ");
        String nome = sc.nextLine();

        System.out.print("Deseja fazer um depósito inicial (s/n)? ");
        char opc = sc.next().charAt(0);

        ContaBancaria conta;

        if (opc == 's' || opc == 'S') {
            System.out.print("Valor do depósito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new ContaBancaria(numeroConta, nome, depositoInicial);
        } else {
            conta = new ContaBancaria(numeroConta, nome);
        }

        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta.toString());

        //REALIZAR DEPÓSITO
        System.out.println("\nDigite o valor do depósito: ");
        double novoDeposito = sc.nextDouble();
        conta.Depositar(novoDeposito);

        System.out.println("Dados atualizados \n" + conta.toString());

        //REALIZAR SAQUE
        System.out.println("\nDigite o valor do Saque: ");
        double novoSaque = sc.nextDouble();
        conta.Sacar(novoSaque);

        System.out.println("Dados atualizados \n" + conta.toString());

        sc.close();

    }
}
