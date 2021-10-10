
package ejercicio6;

import java.util.Scanner;


public class ejercicio6 {
    
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        System.out.println("ingrese multiplicando:");
        int numero1= consola.nextInt();
        System.out.println("ingrese el numero de la potencia:");
        int numero2= consola.nextInt();
        int suma=1;
        if (numero1>0 && numero2>0){
            while (numero2!=0){
                  suma=numero1*suma;
                  numero2--;
        
            }
        }else{
            System.out.println("uno de los numeros es menor a 0");
        }
        
        System.out.println("El resultado de la potencia  con multiplicacion sucesivas es:" + suma);
    }

    
}
