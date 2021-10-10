
package ejercicio5;

import java.util.Scanner;


public class ejercicio5 {
    
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("ingrese numero1:");
        int numero1= consola.nextInt();
        System.out.println("ingrese numero2:");
        int numero2= consola.nextInt();
        int suma;
        suma=0;
        if (numero1>0 && numero2>0){
            while (numero2!=0){
                  suma= suma+numero1;
                  numero2--;
        
            }
        }else{
            System.out.println("uno de los numeros es menor a 0");
        }
        
        System.out.println("El resultado de la multiplicacion con sumas sucesivas es:" + suma);
    }
    
}
