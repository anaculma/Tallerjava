package com.sofka.Taller2;
import java.util.Scanner;


public class Punto2T2 {
    private int edad;
    private Scanner input;

    public void Punto2T2() {
        input = new Scanner(System.in);

        System.out.println("Digite su edad");
        int edad = input.nextInt();

        if (edad <= 18) {
            System.out.print("usted aun es un niño");

        }
        else{
            System.out.print("usted es adulto");
        }

    }
}





