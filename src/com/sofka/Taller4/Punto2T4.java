package com.sofka.Taller4;

import java.util.Scanner;

public class Punto2T4 {


    private int cpar, cimpar;
    private int x;
    private Scanner input = new Scanner(System.in);

    private int arreglo[] = new int[20];


    public void Punto2T4() {

        int[] arreglo = new int[20];

        //Genera el numero aleatorio
        cpar = 0;
        cimpar = 0;

        for (int x = 0; x <= 20; x++) {
            arreglo[x] = (int) (Math.random() * 100 + 1);
            System.out.println("posicion" + x + " ->" + arreglo[x]);
        }
        //cuenta pares e impares

        if (arreglo[x] % 2 == 0) {
            cpar++;
        } else {
            cimpar++;
        }


        int par[] = new int[cpar];
        int impar[] = new int[cimpar];

        cpar = 0;
        cimpar = 0;
//guardar pares e imares por separado
        for (int i = 0; i < 20; i++) {
            if (arreglo[i] % 2 == 0) {
                par[cpar] = arreglo[i];
                cpar++;
            } else {
                impar[cimpar] = arreglo[i];
                cimpar++;
            }
        }
        System.out.print("Numeros Pares: ");
        for (int i = 0; i < cpar; i++) {
            System.out.print(par[i] + " - ");
        }
        System.out.println("");

        System.out.print("Numeros Impares: ");
        for (int i = 0; i < cimpar; i++) {
            System.out.print(impar[i] + " - ");
        }
        System.out.println("");
    }
}

