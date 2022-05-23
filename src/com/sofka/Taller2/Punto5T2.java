package com.sofka.Taller2;

import java.util.ArrayList;
import java.util.Scanner;

public class Punto5T2 {

    private int opcion;
    private Scanner input = new Scanner(System.in);
    private Scanner inputTexto = new Scanner(System.in);
    private String[][] listaClientes = new String[2][6];
    ArrayList<String> productoventa = new ArrayList<>();


    public void Punto5T2() {

        productoventa.add("Dolex forte $2000");
        productoventa.add("Aspirina  $ 1000");
        productoventa.add("Alcohol   $ 3000");
        productoventa.add("Algodon   $ 4000");
        productoventa.add("Shampoo   $ 6000");

        menuDatosCliente();
        menuPrincipal();
    }

    private void menuDatosCliente() {
        System.out.println("******************** Menu Datos Clientes **************");
        System.out.println("Ingrese Cedula");
        String cedula = input.nextLine();
        listaClientes[0][0] = cedula;

        System.out.println("Ingrese el nombre ");
        String nombre = inputTexto.nextLine();
        listaClientes[0][1] = nombre;
    }

    private void menuPrincipal() {
        System.out.println("*******Bienvenido a Drogueria mi salud ******");
        System.out.println("***** Seleccione la opcion deseada **");
        System.out.println("1.Compra");
        System.out.println("2.Devolucion Producto");
        System.out.println("3.salir");
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                productosDisponibles();
                break;
            case 2:
                devolucionProducto();
                break;
            case 3:
                System.out.println("Esta saliendo");
            default:
                System.out.println("seleccione una opcion valida");
                menuPrincipal();
                break;
        }
    }
    private void productosDisponibles() {
        int contador = 0;
        int opcion;

        System.out.println("********** Menu Productos  ***********");
        System.out.println("Seleccione el producto deseado");

        for (String producto : productoventa) {
            System.out.println(contador + ": " + producto);
            contador++;
        }

        //obtenermos la opcion
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();

        //guardamos el producto en matrix
        listaClientes[0][2] = productoventa.get(opcion);

        //eliminamos el producto de catalogo
        productoventa.remove(opcion);

        //llama el menu Principal
        menuPrincipal();
    }


    private void devolucionProducto() {

        System.out.println("****** Datos del cliente: *****");
        System.out.println("cedula: " + listaClientes[0][0]);
        System.out.println("nombre: " + listaClientes[0][1]);
        System.out.println("producto:" + listaClientes[0][2]);
        System.out.println("");

        System.out.println("1.Devolver Producto");
        System.out.print("Ingrese la opcion: ");
        opcion = input.nextInt();

        switch (opcion) {
            case 1:
                //poner producto de cliente  a lista de producto
                productoventa.add(listaClientes[0][2]);
                //eliminar producto del cliente
                listaClientes[0][2] = "";
                //comentario
                System.out.println("- Realizar comentario sobre el producto: ");
                listaClientes[0][3] = inputTexto.nextLine();
                System.out.println("El producto  "+productoventa.get(productoventa.size()-1)+" Con el comentario : "+listaClientes[0][3]);
                //volver a menu principal
                menuPrincipal();
                break;
            default:
                System.out.println("seleccione una opcion valida");
                devolucionProducto();
                break;


        }
    }

}

