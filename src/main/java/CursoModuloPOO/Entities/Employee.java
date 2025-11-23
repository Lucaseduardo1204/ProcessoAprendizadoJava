package CursoModuloPOO.Entities;

import java.util.Scanner;

public class Employee {

    public String name;
    public double grossSalary;
    public double tax;

    public double NetSalary() {
        return grossSalary - tax;
    }

    public void IncreaseSalary(double percentage) {
        this.grossSalary += percentage / 100 * grossSalary;

    }

    public String toString() {
        return "Name: " + name + "\nGross Salary: " + grossSalary + "\nTax: " + tax;
    }
}


//TESTE DO MAIN
//Employee funcionario = new Employee();
//Scanner scan = new Scanner(System.in);
//
//System.out.println("Digite o nome do funcionário: ");
//funcionario.name = scan.nextLine();
//
//System.out.println("Digite o salario bruto do funcionario: ");
//funcionario.grossSalary = scan.nextDouble();
//
//System.out.println("Digite o valor da taxa descontada: ");
//funcionario.tax = scan.nextDouble();
//
//System.out.println("***************FUNCIONARIO****************");
//System.out.println(funcionario.toString());
//System.out.println("***************SALARIO LIQUIDO****************");
//System.out.println(funcionario.NetSalary());
//System.out.println("**********************************************");
//
//System.out.println("Qual a % do aumento salarial do funcionario? ");
//double aumento = scan.nextDouble();
//funcionario.IncreaseSalary(aumento);
//System.out.printf("Novo Salario: " +  funcionario.NetSalary() );