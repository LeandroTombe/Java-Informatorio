
package ejercicio3;

import java.util.Scanner;


public class ejercicio3 {
    public static void main(String[] args) {
         Scanner consola= new Scanner(System.in);
         System.out.println("ingrese un numero:");
         int numero= consola.nextInt();
         
         
         System.out.println("----------------");
         for (int i = 1; i <= numero; i++) {
             for (int j = 1; j <= i; j++) {
                 
                 System.out.println(j + " ");
             }
             System.out.println("");
        }
         
       
        }
         
    
}