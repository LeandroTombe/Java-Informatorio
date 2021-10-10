
import java.util.Scanner;


public class ejercicio7 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa un texto:");
        String message = consola.nextLine();
        

        char[] ch = message.toCharArray(); //convierto el String a un array
        for (char e: ch){ //recorro el  array
            int value = (int) e;

            if (value >= 97 && value <122){ //tomo el num ascii y lo cambio para que coincida con la mayuscula
                value = value -32;
                System.out.print((char) value);

            } else if (value == 241) { //calculo por separado para la ñ-Ñ
                value = value -32;
                System.out.print((char) value);

            }else{
                System.out.print((char) value); // todos los demas caracteres se dejan como estan
            }
        }
        consola.close();
    }
}