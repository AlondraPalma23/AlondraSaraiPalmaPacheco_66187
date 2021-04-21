/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alondrasaraipalmapacheco_66187;

import java.util.Scanner;

/**
 * 
 * @author Alondra Palma
 */
public class ejercicio2 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    System.out.println("Ingresa 2 numeros");
        
        Scanner leer = new Scanner (System.in);
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        System.out.println("--------[2.-mayor y menor de ambos]--------");
        
        if (num1 > num2) {
            System.out.println( num1 + " es mayor y " + num2 + " es menor");
        }else{
            System.out.println( num2 + " es mayor y " + num1 + " es menor");
        } 
    }
}
