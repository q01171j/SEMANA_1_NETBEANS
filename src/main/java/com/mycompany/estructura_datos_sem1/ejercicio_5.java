/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem1;

import java.util.Scanner;

/**
 *
 * @author Adriano
 */
public class ejercicio_5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double n;
        double n_suma = 0;
        double promedio;
        System.out.println("INGRESE SUS 5 NOTAS PARA PROMEDIARLOS");
        for(int i = 1; i <= 5; i++){
            System.out.print("Ingrese la nota "+i+" : ");
            n = entrada.nextDouble();
            n_suma = n_suma + n;
        }
        promedio = n_suma / 5;
        System.out.println("El promedio de las 5 notas es : "+promedio);
    }
}
