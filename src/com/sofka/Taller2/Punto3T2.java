package com.sofka.Taller2;


import java.util.Scanner;

public class Punto3T2 {
    private String nombre,apellidos;
    private int edad;
    private Scanner input;

    public Punto3T2() {
    }

    public void Punto3T2() {
        input = new Scanner(System.in);
        System.out.println("Digite su nombre");
        String nombre = input.nextLine();
        System.out.println("Digite sus apellidos");
        String apellidos = input.nextLine();
        System.out.println("Digite su edad");
        int edad = input.nextInt();

        if (edad <= 18) {
            System.out.print(nombre+" " + apellidos + " usted es menor de edad, por lo tanto no puede entrar a la fiesta, por favor devuelvase a su casa");

        }
        else{
            System.out.print(nombre+" " + apellidos + " usted es mayor de edad, por lo tanto  puede entrar a la fiesta");
        }

    }
}



