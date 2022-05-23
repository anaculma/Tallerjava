package com.sofka.Taller3;
import java.util.Scanner;

public class Punto1T3 {

    private Scanner input = new Scanner(System.in);
    private int fila;

    public void Punto1T3() {
        int fila = 10;
        int i = 0, j = 0;

        for (i = 1; i <= fila; i = i + 1) {
            // Mostramos los asteriscos en cada fila
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

