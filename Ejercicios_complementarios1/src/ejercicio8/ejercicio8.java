
package ejercicio8;

import java.util.Scanner;


public class ejercicio8 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("ingrese el nombre y apellido :");
        String nombre_apellido= consola.nextLine();
        System.out.println("ingrese la edad:");
        int edad= consola.nextInt();
        consola.nextLine();
        System.out.println("ingrese la direccion:");
        String direccion= consola.nextLine();
        System.out.println("ingrese la ciudad:");
        String ciudad= consola.nextLine();
        
        System.out.println(nombre_apellido  + "-" + edad + "-" + direccion + "-" + ciudad );
        
    }
    
}
