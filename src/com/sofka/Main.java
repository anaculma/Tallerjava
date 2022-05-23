package com.sofka;

import com.sofka.Taller1.*;
import com.sofka.Taller2.*;
import com.sofka.Taller3.*;
import com.sofka.Taller4.*;

import java.util.Scanner;


public class Main {
    static Scanner opcionMenu = new Scanner(System.in);
    static int opcion;

    public static void main(String[] args) {
        opcion = menuTalleres();

        switch (opcion) {
            case 1:
                menuTallerUno();
                break;
            case 2:
                menuTallerDos();
                break;
            case 3:
                menuTallerTres();
                break;
            case 4:
                menuTallercuatro();
                break;
            case 5:
                System.out.println("Selecciono salir");
               break;
        }

    }

    public static int menuTalleres() {
        System.out.println("--------------------------------");
        System.out.println("** Talleres Cantera 1 **");
        System.out.println("Seleccione el taller que desea ver:");
        System.out.println("1. Taller Variables");
        System.out.println("2. Taller condicionales");
        System.out.println("3. Taller ciclos");
        System.out.println("4. Taller arreglos");
        System.out.println("5. Salir");
        System.out.println("");
        System.out.print("Ingrese la opcion:");
        return opcionMenu.nextInt();
    }

    private static void menuTallerUno() {
        System.out.println("--------------------------------");
        System.out.println("** Menu Taller 1 **");
        System.out.println("Seleccione que punto del taller desea ver");
        System.out.println("1.punto uno");
        System.out.println("2.punto Dos");
        System.out.println("3.punto Tres");
        System.out.println("4.punto Cuatro");
        System.out.println("5.punto cinco");
        System.out.println("0. Regresar");
        System.out.println("");
        System.out.print("Ingrese la opcion: ");
        opcion = opcionMenu.nextInt();

        switch (opcion) {
            case 0:
                menuTalleres();
                break;

            case 1:
                Punto1 eje1 = new Punto1();
                eje1.Punto1();
                break;
            case 2:
                Punto2 eje2 = new Punto2();
                eje2.Punto2();
                break;
            case 3:
                Punto3 eje3 = new Punto3();
                eje3.Punto3();
                break;
            case 4:
                Punto4 eje4 = new Punto4();
                eje4.Punto4();
                break;
            case 5:
                Punto5 eje5 = new Punto5();
                eje5.Punto5();
                break;

        }
        menuTallerUno();
    }

    private static void menuTallerDos() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("** Menu Taller 2 **");
        System.out.println("Seleccione que punto del taller desea ver");
        System.out.println("1.punto uno");
        System.out.println("2.punto Dos");
        System.out.println("3.punto Tres");
        System.out.println("4.punto Cuatro");
        System.out.println("5.punto cinco");
        System.out.println("6.punto seis");
        System.out.println("7.punto siete");
        System.out.println("8.punto ocho");
        System.out.println("9.punto nueve");
        System.out.println("10.punto diez");
        System.out.println("0. Regresar");
        System.out.println("");
        System.out.print("Ingrese la opcion: ");
        opcion = opcionMenu.nextInt();


        switch (opcion) {
            case 0:
                menuTalleres();
                break;

            case 1:
                Punto1T2 pt1 = new Punto1T2();
                pt1.Punto1T2();
                break;
            case 2:
                Punto2T2 pt2 = new Punto2T2();
                pt2.Punto2T2();
                break;
            case 3:
                Punto3T2 pt3 = new Punto3T2();
                pt3.Punto3T2();
                break;
            case 4:
                Punto4T2 pt4 = new Punto4T2();
                pt4.Punto4T2();
                break;
            case 5:
                Punto5T2 pt5 = new Punto5T2();
                pt5.Punto5T2();
                break;
            case 6:
                Punto6T2 pt6 = new Punto6T2();
                pt6.Punto6T2();
                break;
            case 7:
                Punto7T2 pt7 = new Punto7T2();
                pt7.Punto7T2();
                break;
            case 9:
                Punto9T2 pt9 = new Punto9T2();
                pt9.Punto9T2();
                break;
            case 10:
                Punto10T2 pt10 = new Punto10T2();
                pt10.Punto10T2();
                break;
        }
    }

    private static void menuTallerTres() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("** Menu Taller 3 **");
        System.out.println("Seleccione que punto del taller desea ver");
        System.out.println("1.punto uno");
        System.out.println("2.punto Dos");
        System.out.println("3.punto Tres");
        System.out.println("4.punto Cuatro");
        System.out.println("5.punto cinco");
        System.out.println("6.punto seis");
        System.out.println("7.punto siete");
        System.out.println("8.punto ocho");
        System.out.println("0. Regresar");
        System.out.println("");
        System.out.print("Ingrese la opcion: ");
        opcion = opcionMenu.nextInt();

        switch (opcion) {
            case 0:
                menuTalleres();
                break;

            case 1:
                Punto1T3 pt1 = new Punto1T3();
                pt1.Punto1T3();
                break;
            case 2:
                Punto2T3 pt2 = new Punto2T3();
                pt2.Punto2T3();
                break;
            case 3:
                Punto3T3 pt3 = new Punto3T3();
                pt3.Punto3T3();
                break;
            case 4:
                Punto4T3 pt4 = new Punto4T3();
                pt4.Punto4T3();
                break;
            case 5:
                Punto5T3 pt5 = new Punto5T3();
                pt5.Punto5T3();
                break;
            case 6:
                Punto6T3 pt6 = new Punto6T3();
                pt6.Punto6T3();
                break;
        }
    }
    private static void menuTallercuatro() {
        System.out.println("");
        System.out.println("--------------------------------");
        System.out.println("** Menu Taller 4 **");
        System.out.println("Seleccione que punto del taller desea ver");
        System.out.println("1.punto uno");
        System.out.println("2.punto Dos");
        System.out.println("3.punto Tres");
        System.out.println("4.punto Cuatro");
        System.out.println("5.punto cinco");
        System.out.println("0. Regresar");
        System.out.println("");
        System.out.print("Ingrese la opcion: ");
        opcion = opcionMenu.nextInt();
        switch (opcion) {
            case 0:
                menuTalleres();
                break;
            case 1:
                Punto1T4 pt1 = new Punto1T4();
                pt1.Punto1T4();
                break;
            case 2:
                Punto2T4 pt2 = new Punto2T4();
                pt2.Punto2T4();
                break;

        }
    }

}