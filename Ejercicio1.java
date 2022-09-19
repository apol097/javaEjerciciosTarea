import java.io.*;
import java.util.Scanner;

class Ejercicio1 {

public static void main(String args[]) throws IOException
{
	Scanner sc = new Scanner(System.in);
	double sal_base,sal_total,descuento;

	System.out.print("Ingrese salario base del empleado: ");
	sal_base = sc.nextDouble();
	sc.close();
	descuento = sal_base * 0.1;
	sal_total = sal_base - descuento;
	System.out.println("El salario del empleado con descuento es: "+sal_total);

}
}