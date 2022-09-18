import java.util.Scanner;

/*
 * Crear programa para calcular el descuento que se va aplicar a los clientes es
 * sus compras, el descuento a aplicar será de la siguiente manera.
 * 0.01 - 1000.00 - 10% de Descuento
 * 1000.01 - 3000.00 - 20% de Descuento
 * 3000.01 - En Adelante - 30% de Descuento
 * La compra deberá ser leída y deberá mostrar la siguiente información.
 * a. Valor a Descontar
 * b. Total a pagar.
 */
public class Ejercicio14 {
    public static void main(String[] args) {
        double descuento, totalPagar, dinero;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Introdusca el valor bruto de las compras: ");
        dinero = scanner.nextDouble();

        if(dinero < 0.01){
            descuento = 0;
        } else if( dinero >= 0.01 || dinero < 1000.01){
            descuento =  dinero * 0.10;
        } else if( dinero >= 1000.01 || dinero < 3000.01 ) {
            descuento = dinero * 0.20;
        }else{
            descuento = dinero * 0.30;
        }
        totalPagar = dinero - descuento;

        System.out.println("Total en Compras:\t$" + dinero);
        System.out.println("Descuento:\t\t$" + descuento);
        System.out.println("Total a Pagar:\t\t$" + totalPagar);

        scanner.close();

    }
}
