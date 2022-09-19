import java.io.*;
import java.util.Scanner;

class Ejercicio7 {

	public static void main(String args[]) throws IOException
    {
    	Scanner sc = new Scanner(System.in);
    	double a,b;

    	System.out.print("Ingrese el primer numero: ");
    	a = sc.nextDouble();
    	System.out.print("Ingrese el segundo numero: ");
    	b = sc.nextDouble();
		sc.close();
    	if (a>b)
    		System.out.println("El primer numero es mayor");
    	else
    		System.out.println("El segundo numero es mayor");
    }
}