
package ejercicio7;

import java.util.Arrays;


public class funcion {
    
    public String[] valores(int numero1, int numero2){
        
        
        
        if (numero2>numero1) {
            int indice=(numero2-numero1);
            String[] valores= new String[indice];
            int anteultimo=(numero2-1);
            int[] numeros= new int[indice];
        
            int contar=0;
            for (int i = numero1; i < numero2; i++) {
                numeros[contar]=i;
                contar++;
            }
            
            
            
            
            for (int i = 0; i < indice; i++) {
                if (numeros[i] % 2 == 0 && numeros[i] % 3==0) {
                    valores[i]= "FizzBuzz";    
                }else if (numeros[i] % 2 == 0){
                    valores[i]="Fizz";
                }else if ((numeros[i] % 3 == 0)){
                    valores[i]="Buzz";
                }else{ valores[i]=String.valueOf(numeros[i]);
                }
            }
            valores[0]=String.valueOf(numero1);
            valores[indice-1]=String.valueOf(anteultimo);
            
            
            
              
            /* AOCRDARSE QUE DEVUELVO LA MEMORIA DEL OBJETO Y NO SU CONTENIDO, POR LO TANTO, CUANDO QUERAMOS MOSTRAR SUS VALORES, DEBEMOS LLAMAR AL 
            METODO ARRAY LIST DENTRO DE LA FUNCION QUE UTILICEMOS*/
        
            return valores;
            
            
        }else{
            return null;
        }
      
        
        

    }
    
   
}