package com.sofka.Taller2;

import java.util.Scanner;
public class Punto1T2 {
    private String nombre;
    private int edad;
    private Scanner input;

    public void Punto1T2() {
        input = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = input.nextLine();
        System.out.println("Digite su edad");
        int edad = input.nextInt();

        if (edad <= 18) {
            System.out.print("usted es menor de edad");

        }
        else{
            System.out.print("usted es adulto");
        }

    }
}




