package com.sofka.Taller3;

import java.util.Scanner;

public class Punto6T3 {

    private int opcion, x = 0, y = 0;
    private Scanner inputint = new Scanner(System.in);
    private Scanner inputTexto = new Scanner(System.in);
    private String[][] listaContactos = new String[3][3];


    public void Punto6T3() {
        listaContactos[0][1] = "";
        listaContactos[1][1] = "";
        listaContactos[2][1] = "";
        menuPrincipal();

    }

    private void menuPrincipal() {
        System.out.println("*********Agenda De Contactos****** ");
        System.out.println("Seleccione la opcion deseada");
        System.out.println("1.Añadir contacto");
        System.out.println("2.Buscar contacto");
        System.out.println("3.Eliminar contacto");
        System.out.println("4.Salir");
        System.out.print("Ingrese la opcion: ");
        opcion = inputint.nextInt();

        switch (opcion) {
            case 1:
                agregaContacto();
                menuPrincipal();
                break;
            case 2:
                buscarContacto();
                menuPrincipal();
                break;
            case 3:
                eliminarContacto();
                menuPrincipal();
                break;
            case 4:
                System.out.println("Esta saliendo de la aplicacion");
                break;
            default:
                System.out.println("seleccione una opcion valida");
                menuPrincipal();
                break;
        }

    }

    private void agregaContacto() {

        System.out.println("******************** Menu Datos contactos **************");

        System.out.println("Ingrese nombre");
        String nombre = inputTexto.nextLine();
        listaContactos[x][y] = nombre;

        //agregarmos y validamos el telefono
        ingresarTelefono();

        System.out.println("Ingrese organizacion a la que pertenece");
        String organizacion = inputTexto.nextLine();
        listaContactos[x][y + 2] = organizacion;

        //para x incremente xcada vez que agregamos a una persona
        x = x + 1;
    }

    private void ingresarTelefono() {
        System.out.println("Ingrese numero de telefono");
        int telefonoInput = inputint.nextInt();

        String telefono = String.valueOf(telefonoInput);
        for (int fila = 0; fila < 3; fila++) {
            boolean respuesta = listaContactos[fila][1].equals(telefono);
            if (respuesta) {
                ingresarTelefono();
            }
        }
        listaContactos[x][y + 1] = telefono;
    }

    private void buscarContacto() {
        System.out.println("Ingrese numero de telefono del contacto");
        String telefono = String.valueOf(inputint.nextInt());

        for (int fila = 0; fila < 3; fila++) {
            boolean respuesta = listaContactos[fila][1].equals(telefono);
            if (respuesta) {
                System.out.println("el contacto es:" + listaContactos[fila][0]);
                System.out.println("el telefono es:" + listaContactos[fila][1]);
                System.out.println("el organizacion es:" + listaContactos[fila][2]);
            }
        }
    }

    private void eliminarContacto() {
        System.out.println("Ingrese numero de telefono del contacto que desea Eliminar");
        int telefonoInput = inputint.nextInt();

        String telefono = String.valueOf(telefonoInput);

        for (int fila = 0; fila < 3; fila++) {
            boolean respuesta = listaContactos[fila][1].equals(telefono);
            if (respuesta) {
                listaContactos[fila][0] = "";
                listaContactos[fila][1] = "";
                listaContactos[fila][2] = "";
                x = x - 1;
            }
        }
    }

}