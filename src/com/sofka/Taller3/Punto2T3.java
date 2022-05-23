package com.sofka.Taller3;

public class Punto2T3 {

    //cuantas filas y columnas a imprimir
    int filas = 10;

    public void Punto2T3() {

        //imprimir la cantidad de filas
        for (int cantiFilas = 1; cantiFilas <= filas; cantiFilas++) {
            //se de mirar que imprime cada filasp
            // espacios
            for (int cantiEspacios = 1; cantiEspacios <= (filas - cantiFilas); cantiEspacios++) {
                System.out.print(" ");
            }
            // asterriscos
            for (int cantiAster = 1; cantiAster <= cantiFilas; cantiAster++) {
                System.out.print("*");
            }
            //salta espacio al finalizar la fila
            System.out.println("");
        }
    }
}

