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
public class ejercicio_6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        int n;
        int multi = 1;
        
        System.out.println("INGRESE 5 NUMEROS PARA MULTIPLICARLOS");
        for(int i = 1; i <= 5; i++){
            System.out.print("Ingrese el valor "+i+" : ");
            n = entrada.nextInt();
            multi = multi * n;
        }
        
        System.out.println("La multiplicacion de los 5 numeros es : "+multi);
    }
}
