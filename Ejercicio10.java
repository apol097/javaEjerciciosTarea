import java.util.Scanner;

/**
 * Ejercicio10
 * Hacer un algoritmo que determine si u número es positivo o negativo, si es
 * positivo que lo convierta a negativo y si es negativo que lo convierta a
 * positivo. Imprimir el número y el mensaje “ Se convirtió de positivo a
 * negativo”, o viceversa.
 */
public class Ejercicio10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        double numero;
        System.out.print("Introdusca un numero cualquiera: ");
        String mensaje = "";

        numero = scanner.nextDouble();

        if(numero == 0){
            mensaje = "El numero introducido es neutro";
        }else if(numero > 0){
            mensaje = "Se convirtio el numero de positivo a negativo"; 
        }else{
            mensaje = "Se convirtio el numero de negativo a positivo";
        }

        System.out.println("Numero: " + numero);
        System.out.println("Conversion: " + numero*-1);
        System.out.println( mensaje );
        scanner.close();
    }
    
    
}