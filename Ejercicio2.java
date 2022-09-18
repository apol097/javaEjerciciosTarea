import java.util.Scanner;

/**
 * Ejercicio2
 * Determinar incremento en ventas, si estas presentan el 30% sobre las ventas anteriores
 */
public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double porcentajeVentas = 1.30, ventasAnteriores, incremento;
    
        System.out.print("Introdusca el valor de las ventas anteriores: $");   
        ventasAnteriores = scanner.nextDouble();
        scanner.close();
        incremento = ventasAnteriores * porcentajeVentas;
        System.out.println("El incremento de las ventas es : $" + incremento);

        System.out.println("-----------------------Fin de Programa---------------------------");
    }
   
}