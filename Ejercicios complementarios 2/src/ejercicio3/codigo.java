
package ejercicio3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;


public class codigo {
    
    public static void main(String[] args) {
        List<Integer> baraja= new ArrayList<Integer>();
       
        for (int i = 0; i < 14; i++) {
            baraja.add(i);
        }
        
        System.out.println("*BARAJA EN ORDEN*");
        for (int i = 0; i < 14; i++) {
            
            System.out.println("carta numero: " +  baraja.get(i) );
            
        }
        
        /*con el metodo shuffle de la clase collections podemos tener cartas de forma invertida*/ 
        Collections.reverse(baraja);
        System.out.println("*BARAJA EN ORDEN INVERTIDO*");
         
        for (int i = 0; i < 14; i++) {
            System.out.println("carta numero: " +  baraja.get(i) );
        }
         
        /*con el metodo shuffle de la clase collections podemos tener cartas random*/ 
        Collections.shuffle(baraja);
        
        
        System.out.println("*BARAJA CON CARTAS ALEATORIAS*");
        for (int i = 0; i < 14; i++) {
            
            System.out.println("carta numero: " +  baraja.get(i) );
            
        }
    }
    
    
   
    
}
