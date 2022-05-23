package com.sofka.Taller1;

import java.io.FileDescriptor;
import java.util.Scanner;

public class Punto1 {

    private String nombre;
    private String apellidos;


    public void Punto1() {
        pedirNombre();
        nombre = capturardato();

        pedirApellido();
        apellidos = capturardato();
    }

    private void pedirNombre() {
        FileDescriptor system;
        System.out.println("Digite su nombre");
    }

    private void pedirApellido() {
        System.out.println("Digite su apelllido");
    }

    private String capturardato() {

        Scanner input = new Scanner(System.in);
        {
            return input.nextLine();
        }

    }

}



