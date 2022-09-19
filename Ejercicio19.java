import java.io.*;
import java.util.Scanner;

class Ejercicio19 {

	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int n,i;
		double suma_impar=0,num;

		System.out.print("Cantidad de numeros a ingresar: ");
		n = sc.nextInt();
		sc.close();
		for (i=1;i<=n;i++)
		{
			System.out.print("Ingrese el numero "+i+" : ");
		    num = sc.nextInt();
			if ( n%2==1 && num<=n)
			{
				suma_impar += num;
			}
		}
      
       System.out.println("La suma de los impares menores que "+n+" es: "+suma_impar);
	}
}