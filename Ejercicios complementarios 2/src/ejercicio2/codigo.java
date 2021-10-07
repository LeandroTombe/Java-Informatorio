
package ejercicio2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class codigo {
    
    public static void main(String[] args) {
        int numero;
        Scanner consola =new Scanner(System.in);
        List<Integer> numeros= new ArrayList<Integer>();
        for (int i = 1; i < 6; i++) {
            System.out.println("ingrese el numero " +i+ ":");
            numero=consola.nextInt();
            numeros.add(numero);
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("#"+ (i+1)+":" + numeros.get(i));
        }
        
        System.out.println("elementos del arreglo:" + numeros.size());
        
        System.out.println("ingrese un numero para agregar al principio del arreglo:");
        numero= consola.nextInt();
        numeros.add(0, numero);
        System.out.println("ingrese un numero para agregar al final del arreglo:");
        numero= consola.nextInt();
        numeros.add(numeros.size(), numero);
        
        System.out.println("*ARREGLO FINAL:*");
        for (int i = 0; i < 7; i++) {
            System.out.println("#"+ (i+1)+":" + numeros.get(i));
        }
        
        System.out.println("elementos del arreglo:" + numeros.size());
    }
    
}
