/*Se tienen tres esferas (A,B,C) de diferente peso, elaborar un algoritmo que determine cuál es
la esfera de mayor peso.*/
package com.mycompany.ejercicio_24_p1;
import java.util.Scanner;

public class Ejercicio_24_p1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, mayor;

        System.out.print("Ingrese peso esfera A: ");
        a = scanner.nextDouble();
        System.out.print("Ingrese peso esfera B: ");
        b = scanner.nextDouble();
        System.out.print("Ingrese peso esfera C: ");
        c = scanner.nextDouble();
        mayor=0;

        if (a>b && a>c){
            System.out.println(a+" A es la mayor.");
            }
        else if (b>a && b>c){
            System.out.println(b+" B es el mayor.");
            }
        else{
            System.out.println(c+" C es el mayor.");
         }
        
        scanner.close();
    }
}
