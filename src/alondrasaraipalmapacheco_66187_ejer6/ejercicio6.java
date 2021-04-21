/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alondrasaraipalmapacheco_66187_ejer6;

import java.util.Scanner;

/**
 * 
 * @author Alondra Palma
 */
public class ejercicio6 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------[6.- Numero de 2 cifras]---------");
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("Ingrese numero para comprobar si tiene dos cifras");
        int numeroCifra = Entrada.nextInt();
        
        if (numeroCifra >= 10 && numeroCifra <= 99) {
            System.out.println("Tiene dos cifras");
        } else {
            System.out.println("Distinto de dos cifras");
        }
    }

}
