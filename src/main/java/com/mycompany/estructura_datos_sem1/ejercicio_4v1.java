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
public class ejercicio_4v1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        double b,h,l,m,n,P,A;
        
        System.out.println("AREA Y PERIMETRO DE UN TRIÁNGULO");
        System.out.print("Ingrese la Base : ");
        b = entrada.nextDouble();
        System.out.print("Ingrese la Altura : ");
        h = entrada.nextDouble();
        System.out.print("Ingrese la Lado 1 : ");
        l = entrada.nextDouble();
        System.out.print("Ingrese la Lado 2 : ");
        m = entrada.nextDouble();
        System.out.print("Ingrese la Lado 3 : ");
        n = entrada.nextDouble();
        
        P = l + m + n;
        A = (b * h)/2;
        
        System.out.println("El AREA del TRIANGULO es : "+A);
        System.out.println("El PERIMETRO del TRIANGULO es : "+P);
    }
}
