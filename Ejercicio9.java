import java.io.*;
import java.util.Scanner;

class Ejercicio9 {

	public static void main(String args[]) throws IOException
	{
    
    Scanner sc = new Scanner(System.in);
    double descuento,compra,porcentaje,total_compra;

    System.out.print("Ingrese el monto de compra: ");
    compra = sc.nextDouble();
    sc.close();
    if(compra>=500)
    {
      System.out.println("Cliente clasificacion \"A\", tiene 20% de descuento");
      porcentaje=0.2;

    }else{

    	System.out.println("Cliente clasificacion \"B\", tiene 10% de descuento");
      porcentaje=0.1;

    }
    
    descuento = compra * porcentaje;
    total_compra = compra - descuento;

    System.out.println("Compra sin descuento: "+compra);
    System.out.println("Descuento otorgado: "+descuento);
    System.out.println("El total de la compra es: "+total_compra);

	}
}