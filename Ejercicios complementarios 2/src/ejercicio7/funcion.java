
package ejercicio7;

import java.util.Arrays;


public class funcion {
    
    public String[] valores(int numero1, int numero2){
        
        String[] valores= new String[numero2];
        
        int anteultimo=(numero2-1);
        
        if (numero2>numero1) {
            
            valores[0]="1";
            for (int i = 1; i < anteultimo; i++) {
                if (i % 2 == 0 && i %3==0) {
                    valores[i]="FizzBuzz";
                    
                }else if (i % 2 == 0){
                
                    valores[i]="Fizz";
                
                }else if ((i % 3 == 0)){
                 
                    valores[i]="Buzz";
                
                }
            }
            valores[anteultimo]=String.valueOf(anteultimo);
            
        }
        
        
        
        return valores;
        

    }
}
