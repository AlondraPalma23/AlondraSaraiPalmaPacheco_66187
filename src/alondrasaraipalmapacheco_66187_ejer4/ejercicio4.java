/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package alondrasaraipalmapacheco_66187_ejer4;

import java.util.Scanner;

/**
 * 
 * @author Alondra Palma
 */
public class ejercicio4 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("--------[4.-Año]---------");
        Scanner Entrada = new Scanner (System.in);
        
        System.out.println("Ingrese año actual");
        int añoAct = Entrada.nextInt();
        System.out.println("Ingrese año calcular");
        int añoEntrada = Entrada.nextInt();
        int resta;

        if (añoEntrada > añoAct) {
            resta = añoEntrada - añoAct;
            System.out.println("Faltan " + resta + " años");
        } else if (añoEntrada < añoAct) {
            resta = añoAct - añoEntrada;
            System.out.println("Han pasado " + resta + " años ");
        } else {
            System.out.println("Los numeros son iguales");
        }
    }
}
