package com.sofka.Taller2;

import java.util.Scanner;

public class Punto10T2 {


    private int opcion;
    private String nombre;
    private float saldoDisponible, ingreso, retiro;
    final int saldoini = 500000;
    private Scanner inputint = new Scanner(System.in);
    private Scanner inputTexto = new Scanner(System.in);

    public void Punto10T2() {
        menuBanco();

    }

    private void menuBanco() {
        System.out.println("********* BANCO SU ALIADO ****** ");
        System.out.println("Seleccione la opcion deseada");
        System.out.println("1.Registro");
        System.out.println("2.Retirar");
        System.out.println("3.Consignar");
        System.out.println("4.Salir");
        System.out.print("Ingrese la opcion: ");
        opcion = inputint.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("Digite nombre");
                String nombre = inputTexto.nextLine();
                break;
            case 2:
                System.out.println("Digite la cantidad a retirar");
                retiro = inputint.nextFloat();
                if(retiro>saldoini){
                    System.out.println("Saldo insuficiente");
                }
                else
                    saldoDisponible=saldoini-retiro;
                nombre = inputTexto.nextLine();
                System.out.println( nombre+ " Su saldo actual es: " + saldoDisponible);
                break;
            case 3:
                System.out.println("Digite la cantidad a consignar");
                nombre = inputTexto.nextLine();
                saldoDisponible = saldoini+ingreso;
                System.out.println( nombre+ " Su saldo actual es: " + saldoDisponible);
                ingreso = inputint.nextFloat();
                break;

            case 4:System.out.println("Esta saliendo de la aplicacion");
                break;

            default:
                System.out.println("Digite una opcion valida");
        }
        menuBanco();
    }
}