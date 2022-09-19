import java.io.*;
import java.util.Scanner;

class Ejercicio13 {

	public static void main(String args[]) throws IOException
	{
    
    Scanner sc = new Scanner(System.in);
    double descuento,compra,porcentaje,total_compra;
    int cant_prod;
    
    System.out.print("Ingrese el monto de compra: ");
    compra = sc.nextDouble();
    System.out.print("Ingrese la cantidad de productos: ");
    cant_prod = sc.nextInt();
    sc.close();
    if (cant_prod>=1 && cant_prod<=5)
    {
        System.out.println("Obtiene un 10% de descuento");
        porcentaje = 0.1;
    }else if (cant_prod>=6 && cant_prod<=10)
    {
       System.out.println("Obtiene un 20% de descuento");
        porcentaje = 0.2;
    }else if (cant_prod>=11 && cant_prod<=15)
    {
    System.out.println("Obtiene un 30% de descuento");
        porcentaje = 0.3;
    }else if (cant_prod>=16 && cant_prod<=20)
    {
        System.out.println("Obtiene un 40% de descuento");
        porcentaje = 0.4;
    }else{
        System.out.println("Obtiene un 50% de descuento");
        porcentaje = 0.5;
    }  

    descuento = compra * porcentaje;
    total_compra = compra - descuento;
    System.out.println("Descuento otorgado: "+descuento);
    System.out.println("El total de la compra es: "+total_compra); 

}

}