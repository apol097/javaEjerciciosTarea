
import java.util.Scanner;
/*
 * Ejercicio6
 * Hacer un programa para que determine si un número es par o impar, imprimir
 * el mensaje y el número. Si el número es par, elevarlo al cuadrado y si es
 * impar elevarlo al cubo. Presentar resultado.
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero, respuesta;
        String mensaje = "";
        System.out.print("Introduca un numero: ");
        numero = scanner.nextDouble();
        scanner.close();

        if( numero % 2 == 0){
            respuesta = Math.pow(numero,2);
            mensaje = numero+"^2 = ";
        }else{
           respuesta = Math.pow(numero,3);
           mensaje = numero+"^2 = ";
        }
       
        System.out.println("\n"+mensaje + respuesta);
        System.out.println("\n---------------------Fin de Programa--------------------");
    }
    
}
