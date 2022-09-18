import java.util.Scanner;

/*
 * Ejercicio12
 * Crear un programa en java para calcular el salario neto que recibirá un
 * empleado si a este se le hacen los siguientes descuentos:
 * Isss - 3% del salario, cuando el salario sea mayor de 657.25
 * Renta  - 10% del salario, cuando el salario sea mayor de 857.15
 * AFP - 5% del salario, cuando el salario sea mayor de 450.00
 * Seguro - 4% del salario cuando sea menor de 1000 y en caso contrario el 6%
 */
public class Ejercicio12 {
    public static void main(String[] args) {
        double isss = 0.03, renta = 0.10, afp = 0.05, seguro = 0.04;
        double salarioBruto, salarioNeto;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introdusca el Salario Bruto del empleado: ");
        salarioBruto = scanner.nextDouble();

        isss *= salarioBruto;
        renta *= salarioBruto; 
        afp *= salarioBruto;
        seguro *= salarioBruto;

        salarioNeto = salarioBruto - isss - renta - afp - seguro;
        System.out.println("Salario Bruto:\t$" + salarioBruto);
        System.out.println("ISSS:\t\t$" + isss);
        System.out.println("Renta:\t\t$" + renta );
        System.out.println("AFP:\t\t$" + afp);
        System.out.println("Seguro:\t\t$" + seguro);
        System.out.println("Salario Neto:\t$" + salarioNeto);

        scanner.close();
    }
}
