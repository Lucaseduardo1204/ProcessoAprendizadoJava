package CursoModuloPOO.Entities;

import java.util.Scanner;

public class Rectangle {
    public double width;
    public double height;

    public double Area(){
        return width * height;
    }

    public double Perimeter(){
        return width * 2 + height * 2;
    }

    public double Diagonal(){
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    public String toString(){
        return "AREA = " + Area() + "\nPERÍMETRO = " + Perimeter() + "\nDIAGONAL = " + Diagonal();
    }
}


//CÓDIGO UTILIZADO NO MAIN PARA TESTE
//  Rectangle retangle = new Rectangle();
//  Scanner scan = new Scanner(System.in);
//
//  System.out.println("Digite a altura do triangulo: ");
//  retangle.width = scan.nextDouble();
//
//  System.out.println("Digite a base do triangulo: ");
//  retangle.height = scan.nextDouble();
//
//  System.out.println(retangle.toString());