/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructura_datos_sem1;

/**
 *
 * @author Adriano
 */
public class ejercicio_10 {
    public static void main(String[] args) {
        double pi = 3.14159265;
        double array[] = new double[8];
        array[0]=18.9;
        array[1]=16.7;
        array[2]=71.9;
        array[3]=4.6;
        array[4]=6.7;
        array[5]=5.6;
        array[6]=4.7;
        array[7]=10;
        double sum_A = 0;
        for(int i=0;i<array.length;i++){
           double radio = (pi * (array[i] * array[i]));
           sum_A = sum_A + radio;
        }

        System.out.println("CALCULAR LA SUMA DE LAS 8 AREAS DE LOS CIRCULOS");
        System.out.println("La suma de las Areas es : "+sum_A);
    }
}
