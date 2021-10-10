
package ejercicio9;

import java.util.Scanner;


public class ejercicio9 {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        
        System.out.println("ingrese una oracion");
        String entrada= consola.nextLine();
        entrada= entrada.toLowerCase();
        System.out.println("ingrese el caracter que desea saber las cantidades de veces que aparece en una oracion:");
        String letra= consola.nextLine();
        char caracter=letra.charAt(0);
        System.out.println("--------------------");
        int contarCaracter;
        contarCaracter=0;
        
        
        
        for (int i = 0; i < entrada.length(); i++) {
            char c = entrada.charAt(i);
            
            
            if (caracter==c) {
                contarCaracter=contarCaracter+1;
            }
        }
        
        System.out.println("Las cantidades de veces que aparece es:" + contarCaracter);
    }
    
}
