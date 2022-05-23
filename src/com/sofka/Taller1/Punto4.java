package com.sofka.Taller1;

import java.util.Scanner;


public class Punto4 {
    private String ciudad, pais;
    private Scanner input;


    public void Punto4() {
        input = new Scanner(System.in);

        pideCiudad();
        ciudad = capturaDato();

        pidePais();
        pais = capturaDato();

        imprimir();
    }

    private void pideCiudad() {
        System.out.println("Digite el nombre de la ciudad capital");
    }

    private void pidePais() {
        System.out.println("Digite el nombre del pais al que pertenece la anterior ciudad ");
    }


    private String capturaDato() {
        return input.nextLine();
    }

    public void imprimir() {
        System.out.println("la ciudad de " + ciudad + " es la capital de:" + pais);

    }
}