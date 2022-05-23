package com.sofka.Taller1;

import java.io.FileDescriptor;
import java.util.Scanner;

public class Punto2 {
    private String nombre, apellidos;
    private int edad;
    private double estatura;
    private Scanner input;


    public void Punto2() {
        input = new Scanner(System.in);

        pedirNombre();
        nombre = capturarDatoString();

        pedirApellido();
        apellidos = capturarDatoString();

        pedirEdad();
        edad = capturarDatoint();

        pedirEstatura();
        estatura = capturarDatodouble();


    }

    private void pedirNombre() {
        FileDescriptor system;
        System.out.println("Digite su nombre");

    }

    private void pedirApellido() {
        System.out.println("Digite su apelllido");
    }

    private void pedirEdad() {
        System.out.println("Digite su edad");
    }

    private void pedirEstatura() {
        System.out.println("Digite su estatura");
    }


    private String capturarDatoString() {
        return input.nextLine();
    }

    private int capturarDatoint() {
        return input.nextInt();
    }

    private double capturarDatodouble() {
        return input.nextDouble();
    }

}



