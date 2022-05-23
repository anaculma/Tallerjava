package com.sofka.Taller2;

import java.util.Scanner;

public class Punto6T2 {

    private int opcion;
    private Scanner inputint = new Scanner(System.in);
    private Scanner inputTexto = new Scanner(System.in);


    public void Punto6T2() {

        menuPrincipal();

    }

    private void menuPrincipal() {
        System.out.println("********* TALLER EL MAQUINISTA ****** ");
        System.out.println("Seleccione la opcion deseada");
        System.out.println("1.Ingreso moto");
        System.out.println("2.Reparacion Moto");
        System.out.println("3.Entrega Moto");
        System.out.println("4.Salir");
        System.out.print("Ingrese la opcion: ");
        opcion = inputint.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Digite nombre");
                String nombre = inputTexto.nextLine();
                System.out.println("Digite placa");
                String placa = inputTexto.nextLine();
                System.out.println("Digite Marca");
                String Marca = inputTexto.nextLine();
                System.out.println("Digite las observaciones del  cliente");
                String nota = inputTexto.nextLine();
                System.out.println("El servicio solicitado es para la moto con placa" + placa);
                menuPrincipal();
                break;
            case 2:
                System.out.println("Indique el servicio solicitado");
                String arreglo = inputTexto.nextLine();
                System.out.println("Las reparaciones  realizadas   son: " + arreglo);
                menuPrincipal();
                break;
            case 3:
                System.out.println("Ingrese la placa de la moto que va a retirar");
                placa= inputTexto.nextLine();
                arreglo=inputTexto.nextLine();
                System.out.println("Las reparaciones realizadas fueron "+ arreglo );
                System.out.println("Se realiza entrega de a moto con placa "+ placa);
                menuPrincipal();
                break;
            default:
                System.out.println("seleccione una opcion valida");
                menuPrincipal();
                break;

        }
        menuPrincipal();
    }

}