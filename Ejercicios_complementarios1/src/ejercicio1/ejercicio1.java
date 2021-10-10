
package ejercicio1;

import java.util.Scanner;


public class ejercicio1 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        String nombre;
        
        System.out.println("Por favor, ingresa su nombre:");
        nombre=consola.nextLine();
        System.out.println("hola " + nombre);
        
        
    consola.close();
    }
}
