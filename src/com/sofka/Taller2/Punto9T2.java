package com.sofka.Taller2;

import java.util.Scanner;

public class Punto9T2 {

    private int opcion;
    private Scanner input = new Scanner(System.in);


    public void Punto9T2() {

        System.out.println("*******Programa que calcula el area de figuras geometricas*****");
        System.out.println("1.Triangulo");
        System.out.println("2.Rectangulo");
        System.out.println("3.Trapecio");
        System.out.println("Elija la opcion deseada");
        System.out.println("");
        opcion = input.nextInt();

        switch (opcion) {

            case 1:

                System.out.println("Hallara el area de un Triangulo");
                System.out.println("Ingrese valor de la base");
                double base = input.nextDouble();
                System.out.println("Ingrese valor de la altura");
                double altura = input.nextDouble();
                double area = (base * altura) / 2;
                System.out.println("El area del Triangulo es: " + area);
                break;

            case 2:
                System.out.println("Hallara el area de un Rectangulo");
                System.out.println("Ingrese valor de la base");
                base = input.nextDouble();
                System.out.println("Ingrese valor de la altura");
                altura = input.nextDouble();
                area = (base * altura);
                System.out.println("El area del Rectangulo : " + area);
                break;

            case 3:
                System.out.println("Hallara el area de un Trapecio");
                System.out.println("Ingrese valor de la base mayor");
                double baseMayor = input.nextDouble();
                System.out.println("Ingrese valor de la base menor");
                double baseMenor = input.nextDouble();

                altura = input.nextDouble();
                area = ((baseMayor + baseMenor) * altura) / 2;
                System.out.println("El area del trapecio es : " + area);
                break;
            default:
                System.out.println("Seleccione una opcion valida");
        }

    }
}


