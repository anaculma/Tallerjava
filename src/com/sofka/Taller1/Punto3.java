package com.sofka.Taller1;

import java.io.FileDescriptor;
import java.util.Scanner;

public class Punto3 {
    private String nombre, nombrema, nombrepa;
    private String apellidos, apellidoma, apellidopa;
    private Scanner input;


    public void Punto3() {
        input = new Scanner(System.in);

        pedirNombre();
        nombre = capturarDatoString();

        pedirApellido();
        apellidos = capturarDatoString();

        pedirNombrema();
        nombrema = capturarDatoString();

        pedirApellidoma();
        apellidoma = capturarDatoString();

        pedirNombrepa();
        nombrepa = capturarDatoString();

        pedirApellidopa();
        apellidopa = capturarDatoString();

        imprimir();
    }


    public void imprimir() {
        System.out.println("Soy " + nombre + " " + apellidos + " hija de: " + nombrema + " " + apellidoma + " y " + nombrepa + " " + apellidopa);
    }

    private void pedirNombre() {
        FileDescriptor system;
        System.out.println("Digite su nombre");
    }

    private void pedirApellido() {
        System.out.println("Digite su apelllido");
    }

    private void pedirNombrema() {
        System.out.println("Digite el nombre de su Mamá");
    }

    private void pedirApellidoma() {
        System.out.println("Digite el Apellido materno");
    }

    private void pedirNombrepa() {
        System.out.println("Digite el nombre de su Papá");
    }

    private void pedirApellidopa() {
        System.out.println("Digite el apellido paterno");
    }

    private String capturarDatoString() {
        return input.nextLine();
    }
}