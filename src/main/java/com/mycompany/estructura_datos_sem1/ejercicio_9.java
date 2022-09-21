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
public class ejercicio_9 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double pi = 3.14159265;
        double sum_A = 0;
        double array[] = new double[3];
        array[0]=8.9;
        array[1]=6.7;
        array[2]=7.9;
        
        System.out.println("CALCULAR LA SUMA DE LAS 3 AREAS DE LOS CIRCULOS");
        for(int i=0;i<array.length;i++){
           double radio = (pi * (array[i] * array[i]));
           sum_A = sum_A + radio;
        }
        System.out.println("La suma de las Areas es : "+sum_A);
    }
}
