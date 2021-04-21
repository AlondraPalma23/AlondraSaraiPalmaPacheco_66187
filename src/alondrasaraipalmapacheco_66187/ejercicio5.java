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
public class ejercicio5 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------[5.- positivo o negativo]---------");
        Scanner Entrada = new Scanner (System.in);
        
        int num;
        
        System.out.println("Ingrese un numero");
        num = Entrada.nextInt();
        
        if (num >= 0) {
            System.out.println("Es positivo");
        } else {
            System.out.println("Es negativo");
        }
    }

}
