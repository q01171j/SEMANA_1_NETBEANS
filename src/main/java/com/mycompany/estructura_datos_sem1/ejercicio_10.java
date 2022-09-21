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
public class ejercicio_10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double pi = 3.14159265;
        double sum_A;
        double r1=18.9;
        double r2=16.7;
        double r3=71.9;
        double r4=4.6;
        double r5=6.7;
        double r6=5.6;
        double r7=4.7;
        double r8=10;
        System.out.println("CALCULAR LA SUMA DE LAS 8 AREAS DE LOS CIRCULOS");
        sum_A = (pi * (r1*r1)) + (pi * (r2*r2)) + (pi * (r3*r3)) + (pi * (r4*r4)) + (pi * (r5*r5)) + (pi * (r6*r6)) + (pi * (r7*r7)) + (pi * (r8*r8));
        System.out.println("La suma de las Areas es : "+sum_A);
    }
}
