import java.util.Scanner;

/*
 * Calcular la suma de los n primeros números enteros
 */
public class Ejercicio18 {
    public static void main(String[] args) {
        int suma = 0, cantidad;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca la cantidad de numeros a sumar: ");
        cantidad = scanner.nextInt();
        scanner.close();
        for(int n = 1; n<=cantidad ; n++){
            suma += n;
        }

        System.out.println("La suma de los "+ cantidad + " numeros enteros es: " + suma);
        
    }
}
