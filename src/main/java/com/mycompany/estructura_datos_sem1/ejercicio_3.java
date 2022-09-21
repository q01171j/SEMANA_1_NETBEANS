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
public class ejercicio_3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x;
        int suma = 0;
        System.out.println("Ingrese 5 números a sumar");
        for(int i = 1; i<=5;i++){
            System.out.print("Ingrese el valor "+i+" : ");
            x = entrada.nextInt();
            suma = suma + x;
        }
        System.out.println("La suma de los 5 números es : "+suma);
    }
}
