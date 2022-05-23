package com.sofka.Taller2;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto4T2 {
    private int opcion;
    private Scanner input = new Scanner(System.in);
    private Scanner inputTexto = new Scanner(System.in);
    private String[][] listaClientes = new String[2][4];
    ArrayList<String> peliculasAlquiler = new ArrayList<>();


    public void Punto4T2() {
        peliculasAlquiler.add("Encanto");
        peliculasAlquiler.add("La guerra del mañana");
        peliculasAlquiler.add("Jumanji");

        menuDatosCliente();
        menuPrincipal();
    }

    private void menuDatosCliente() {
        System.out.println("******************** Menu Datos Clientes **************");
        System.out.println("Ingrese Cedula");
        String cedula = input.nextLine();
        listaClientes[0][0] = cedula;

        System.out.println("Ingrese el nombre y apellido");
        String nombre = inputTexto.nextLine();
        listaClientes[0][1] = nombre;
    }

    private void menuPrincipal() {
        System.out.println("Video tienda El Porvenir");
        System.out.println("***** Seleccione la opcion deseada **");
        System.out.println("1.Alquilar Pelicula");
        System.out.println("2.Devolver Pelicula");
        System.out.println("3.salir");
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();
        System.out.print(" ");

        switch (opcion) {
            case 1:
                peliculasDisponibles();
                break;
            case 2:
                devolucionPelicula();
                break;
            case 3:
                System.out.println("Esta saliendo");
            default:
                System.out.println("Numero no existe");
        }
        menuPrincipal();
    }

    private void peliculasDisponibles() {
        int contador = 0;
        int opcion;

        System.out.println("********** Menu Peliculas  ***********");
        System.out.println("Seleccione la pelicula a alquilar");

        for (String pelicula : peliculasAlquiler) {
            System.out.println(contador + ": " + pelicula);
            contador++;
        }

        //obtenermos la opcion
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();

        //guardamos la peliculas en matriz
        listaClientes[0][2] = peliculasAlquiler.get(opcion);

        //eliminamos la pelicula de catalogo
        peliculasAlquiler.remove(opcion);

        //llama el menu Principal
        menuPrincipal();
    }

    private void devolucionPelicula() {

        System.out.println("****** Datos del cliente: *****");
        System.out.println("cedula: " + listaClientes[0][0]);
        System.out.println("nombre: " + listaClientes[0][1]);
        System.out.println("pelicula:" + listaClientes[0][2]);
        System.out.println("");

        System.out.println("2.Devolver Pelicula");
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                //poner la peli de cliene a lista de peliculas
                peliculasAlquiler.add(listaClientes[0][2]);
                //elimnar pelicula del cliente
                listaClientes[0][2] = "";
                //comentario
                System.out.println("- Realizar comentario sobre el alquiler: ");
                listaClientes[0][3] = inputTexto.nextLine();
                System.out.println("La pelicula "+peliculasAlquiler.get(peliculasAlquiler.size()-1)+" Con el comentario : "+listaClientes[0][3]);
                //volver a menu principal
                menuPrincipal();
                break;

            default:
                System.out.println("seleccione una opcion valida");
                devolucionPelicula();
                break;


        }
    }
}