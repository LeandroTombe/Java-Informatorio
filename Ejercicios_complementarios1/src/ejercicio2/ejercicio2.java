/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2;

import java.util.Scanner;

/**
 *
 * @author leand
 */
public class ejercicio2 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("por favor, ingresa el numero 1:");
        int numero1=consola.nextInt();
        System.out.println("Por favor, ingresa el numero 2");
        int numero2=consola.nextInt();
        
        System.out.println("suma:" + (numero1+numero2));
        System.out.println("resta:" + (numero1-numero2) );
        System.out.println("multiplicacion:" + (numero1*numero2));
        System.out.println("division:" + (numero1/numero2));
        System.out.println("modulo:" +(numero1 % numero2));
        
        consola.close();
    }
}
