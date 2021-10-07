
package ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class codigo {
    public static void main(String[] args) {
    Scanner consola= new Scanner(System.in);
    
    List<String> ciudades= new ArrayList<String>();
    
        for (int i = 1; i < 4; i++) {
            System.out.println("ingrese la ciudad numero " + i + ":" );
            String nombre=consola.nextLine();
            ciudades.add(nombre);
        }
        
        
        for (int i = 0; i < 3; i++) {
            System.out.println("#"+ (i+1) + ": " + ciudades.get(i) );
            
        }
    }
    
    
    
}
