package com.sofka.Taller3;
public class Punto3T3 {

    public void Punto3T3() {
        int filas = 11;
        int contador = 1;

        for (int cFilas = 1; cFilas <= filas; cFilas++) {

            for (int cBlancos = 1; cBlancos <= (filas - cFilas); cBlancos++) {
                System.out.print(" ");
            }

            for (int cAsterisco = 1; cAsterisco <= contador; cAsterisco++) {
                System.out.print("*");
            }
            for (int cBlancos = 1; cBlancos <= (filas - cFilas); cBlancos++) {
                System.out.print(" ");
            }
            contador += 2;
            System.out.println("");
        }
    }
}






