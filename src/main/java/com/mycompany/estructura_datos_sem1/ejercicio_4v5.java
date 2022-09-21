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
public class ejercicio_4v5 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double b,h,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN ROMBOIDE");
        System.out.print("Ingrese el Base : ");
        b = entrada.nextDouble();
        System.out.print("Ingrese la Altura : ");
        h = entrada.nextDouble();
        
        P = (2*b) + (2*h);
        A = b * h;
        
        System.out.println("El AREA del ROMBOIDE es : "+A);
        System.out.println("El PERIMETRO del ROMBOIDE es : "+P);
    }
}
