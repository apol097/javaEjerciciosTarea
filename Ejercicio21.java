import java.io.*;
import java.util.Scanner;

class Ejercicio21 {

	public static void main(String args[]) throws IOException
	{
		
		Scanner sc = new Scanner(System.in);
		double suma_pos=0,suma_neg=0,num,media_pos,media_neg;

		for (int i=1;i<=15;i++)
		{
			System.out.print("Ingrese el numero: "+i+" : ");
			num = sc.nextDouble();
			sc.close();
			if (num>0)
			{
				suma_pos += num;
			}else{
				suma_neg += num;
			}

		}
      
      media_pos = suma_pos / 15;
      media_neg = suma_neg / 15;

      System.out.println("La media de positivos es: "+media_pos);
      System.out.println("La media de negativos es: "+media_neg);

	}

}