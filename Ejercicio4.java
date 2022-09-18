import java.util.Scanner;

/*
 * Ejercicio4
 * Encontrar el total a pagar por un libro que tiene un precio X y se le aplica un descuento
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precioLibro, descuento, totalPagar;

        System.out.print("Introdusca el Precio del Libro: $");
        precioLibro = scanner.nextDouble();
        System.out.print("Introdusca el valor del descuento a aplicar: ");
        descuento = scanner.nextDouble();
        descuento = descuento/100;
        scanner.close();
        totalPagar = precioLibro * (1 - descuento);
        System.out.println("┌---------------------------------------------┐");
        System.out.println("|             DETALLES DEL TICKET             |");
        System.out.println("└---------------------------------------------┘");
        System.out.println("El valor del descuento es " + descuento*100 + "%");
        System.out.println("Precio Libro:\t\t\t$"+ precioLibro);
        System.out.println("Descuento:\t\t\t$" + precioLibro*descuento);
        System.out.println("Total Pagar:\t\t\t$" + totalPagar);
        System.out.println("----------------Fin de Programa----------------");
    }
}
