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
public class ejercicio_4v4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double a,d,D,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN ROMBO");
        System.out.print("Ingrese el Lado : ");
        a = entrada.nextDouble();
        System.out.print("Ingrese la Diagonal Menor : ");
        d = entrada.nextDouble();
        System.out.print("Ingrese la Diagonal Mayor : ");
        D = entrada.nextDouble();
        
        P = 4 * a;
        A = (D * d)/2;
        
        System.out.println("El AREA del ROMBO es : "+A);
        System.out.println("El PERIMETRO del ROMBO es : "+P);
    }
}
