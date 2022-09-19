import java.io.*;
import java.util.Scanner;

class Ejercicio11 {

	public static void main(String args[]) throws IOException
	{
    
    Scanner sc = new Scanner(System.in);
    double descuento,compra,porcentaje,total_compra;
    
   System.out.print("Ingrese el monto de compra: ");
   compra = sc.nextDouble();
   sc.close();
    if (compra>=1 && compra<=100)
    {
       System.out.println("Obtiene un 10% de descuento");
       porcentaje = 0.1;
    }else if (compra>100 && compra<=400)
    {
    	System.out.println("Obtiene un 15% de descuento");
       porcentaje = 0.15;
    } else if (compra>400 && compra<=600) 
    {
    	System.out.println("Obtiene un 20% de descuento");
       porcentaje = 0.20;
   
    }else{
    	System.out.println("Obtiene un 25% de descuento");
       porcentaje = 0.25;
    }

    descuento = compra * porcentaje;
    total_compra = compra - descuento;

    System.out.println("Compra sin descuento: "+compra);
    System.out.println("Descuento otorgado: "+descuento);
    System.out.println("El total de la compra es: "+total_compra);

}
}