
package ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class codigo {
    public static void main(String[] args) {
        Scanner consola= new Scanner(System.in);
        
        int hora_trabajo; int valor_hora; int total_horas;
        
        List<Integer> horasTrabajadas=new ArrayList<Integer>();
        List<Integer> valorPorHora= new ArrayList<Integer>();
        List<Integer> total= new ArrayList<Integer>();
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese las horas trabajadas del dia " + i +":");
            hora_trabajo= consola.nextInt();
            horasTrabajadas.add(hora_trabajo);
            
            System.out.println("Ingrese el valor por hora, del dia " + i +":");
            valor_hora=consola.nextInt();
            valorPorHora.add(valor_hora);
            
            total_horas=(hora_trabajo*valor_hora);
            total.add(total_horas);
        }
        
        System.out.println("Horas de trabajo:");
        System.out.println(horasTrabajadas);
        
        System.out.println("\nValor por hora:");
        System.out.println(valorPorHora);
        
        System.out.println("\nTotal por dia:");
        System.out.println(total);
        
        
        
        
        
        
    }
}
