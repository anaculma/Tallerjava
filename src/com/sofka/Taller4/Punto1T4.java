package com.sofka.Taller4;

import java.util.Scanner;

public class Punto1T4 {

    private Scanner inputint = new Scanner(System.in);
    private int contador;

    public void Punto1T4() {
        int arreglo[]=new int[5];

        for (int i=0;i<5;i++){
            System.out.println("Digite un numero:");
            arreglo[i]=inputint.nextInt();

            contador=0;
            if (contador==0){
                contador=contador++;
            }
            for (i=0;i<5;i++){
                System.out.println("[" +i+ "]"+ arreglo[i]);
            }
        }

    }
}


