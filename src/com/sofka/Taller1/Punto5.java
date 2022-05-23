package com.sofka.Taller1;

import java.util.Scanner;

public class Punto5 {
    private String nombredueno, apellidodueno, nombremascota, tipomascota;
    private int edad;
    private Scanner input;

    public void Punto5() {
        input = new Scanner(System.in);

        pidenombredueno();
        nombredueno = capturaDato();

        pideApellido();
        apellidodueno = capturaDato();

        pidenombremas();
        nombremascota = capturaDato();

        pideTipomascota();
        tipomascota = capturaDato();

        pideEdadmas();
        edad = capturaEdad();

        imprimir();
    }


    private void pidenombredueno() {
        System.out.println("Digite el nombre del propietario de la mascota");
    }

    private void pideApellido() {
        System.out.println("Digite el apellido del propietario de la mascota");
    }

    private void pidenombremas() {
        System.out.println("Digite el nombre de la mascota");
    }

    private void pideEdadmas() {
        System.out.println("Digite la edad de la mascota");
    }

    private void pideTipomascota() {
        System.out.println("Digite el tipo de mascota perro,gato");
    }

    private String capturaDato() {
        return input.nextLine();
    }

    private int capturaEdad() {
        return input.nextInt();
    }

    public void imprimir() {
        System.out.println(nombremascota + " es un " + tipomascota + " el cual tiene " + edad + " anos de edad y " + nombredueno + " " + apellidodueno + " Es actualmente su dueño(a)");
    }
}
