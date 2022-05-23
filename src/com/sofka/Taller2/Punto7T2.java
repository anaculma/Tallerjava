package com.sofka.Taller2;

import java.util.Scanner;

public class Punto7T2 {

    private Scanner input = new Scanner(System.in);
    private int opcion;
    private String nombre;
    private double peso,estatura,imc;


    public void Punto7T2() {
        System.out.println("*******Calculo de indice de masa Corporal*****");
        System.out.println("Digite su Nombre");
        nombre=input.nextLine();
        System.out.println("Digite su peso en kilogramos");
        peso=input.nextDouble();
        System.out.println("Digite su estatura en metros");
        estatura=input.nextDouble();

        imc=(estatura*estatura)/peso;

        System.out.println( nombre + " Su IMC es: "+ imc);

        System.out.println (" ");

        if (imc<18.5) {
            System.out.println(" Su IMC es BAJO DE PESO");
        } else if (imc>=18.5 && imc<=24.9) {
            System.out.println("Su IMC es Normal");
        } else if (imc>=25 && imc<=29.9) {
            System.out.println("Su IMC es SOBREPESO");
        } else {
            System.out.println("Su IMC es OBESIDAD");
        }
    }

}
