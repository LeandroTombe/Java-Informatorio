
package ejercicio4;

import java.util.Scanner;


public class codigo {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("ingrese el factorial del numero:");
        int numero= consola.nextInt();
        
        recursion factor= new recursion();
        System.out.println(factor.factorial(numero));
        
       consola.close();
    }
}
