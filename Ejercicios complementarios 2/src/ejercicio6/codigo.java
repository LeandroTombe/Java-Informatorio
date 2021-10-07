
package ejercicio6;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;


public class codigo {
    
    public static void main(String[] args) {
       String nombre; String apellido; int DNI; int horasTrabajadas; Double valorPorHora;
       Scanner consola= new Scanner(System.in);
       Set<empleado> lista= new HashSet<>();
       
       
       System.out.println("ingrese la cantidad de empleados:");
       int cantidad= consola.nextInt();
       
        for (int i = 0; i < cantidad; i++) {
            System.out.println("ingrese el nombre del empleado:");
            
            nombre=consola.nextLine();
            System.out.println("ingrese el apellido del empleado:");
            apellido=consola.nextLine();
            
            System.out.println("ingrese el DNI del empleado:");
            DNI=consola.nextInt();
            System.out.println("ingrese las horas trabajadas del empleado:");
            horasTrabajadas=consola.nextInt();
            System.out.println("ingrese el valor por hora, del empleado:");
            valorPorHora=consola.nextDouble();
            
            lista.add(new empleado(nombre,apellido,DNI,horasTrabajadas,valorPorHora));
            
        }
        
        System.out.println(lista);
        
        
        consola.close();
       
        
        
    }
    
}
