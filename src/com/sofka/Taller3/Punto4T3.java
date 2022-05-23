package com.sofka.Taller3;

import java.util.Scanner;

public class Punto4T3 {
    private Scanner input = new Scanner(System.in);
    private int numero;


    public void  Punto4T3() {

        System.out.println("Programa que muestra una tabla de multiplicar");
        System.out.println("Indique el numero de tabla que desea ver ");
        int numero = input.nextInt();
        System.out.println("Se imprimira la tabla del " + numero);

        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + numero * i);
        }
    }
}