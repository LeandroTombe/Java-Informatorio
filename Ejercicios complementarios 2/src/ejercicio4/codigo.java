
package ejercicio4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class codigo {
    
    public static void main(String[] args) {
        String nombre;
        List<String> estudiantes= new ArrayList<String>();
        Scanner consola= new Scanner(System.in);
        
        for (int i = 0; i < 12; i++) {
            System.out.println("Elija el nombre del estudiante " + i +":");
            nombre=consola.nextLine();
            estudiantes.add(nombre);
            
        }
        
        List curso1= estudiantes.subList(0, 4);
        List curso2=estudiantes.subList(4,8);
        List curso3=estudiantes.subList(8, 12);
        
        System.out.println("CURSO1:");
        System.out.println(curso1);
        System.out.println("\nCURSO2:");
        System.out.println(curso2);
        System.out.println("\nCURSO3:");
        System.out.println(curso3);
        
        
    }     
}
