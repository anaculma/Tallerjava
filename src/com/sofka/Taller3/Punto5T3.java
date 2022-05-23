package com.sofka.Taller3;

import java.util.Scanner;

public class Punto5T3 {


    private int opcion;
    private String nombre;
    private Scanner inputInt = new Scanner(System.in);
    private Scanner inputString = new Scanner(System.in);


    public void Punto5T3() {

        menuUsuario();
    }

    private void menuUsuario() {
        System.out.println("******MENU DE USUARIO*******");
        System.out.println("1.Captura Nombre");
        System.out.println("2.Saludar Persona");
        System.out.println("3.salir del Sistema");
        System.out.print("Ingrese la opcion: ");
        opcion = inputInt.nextInt();

        switch (opcion) {
            case 1:
                System.out.println("Digite su nombre");
                nombre = inputString.nextLine();
                menuUsuario();
                break;
            case 2:
                System.out.println("Hola "+nombre);
                menuUsuario();
                break;
            case 3:
                System.out.println("Esta saliendo del menu");
                break;
            default:
                System.out.println("seleccione una opcion valida");
                menuUsuario();
                break;

        }
    }
}

