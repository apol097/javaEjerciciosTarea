import java.util.Scanner;

/*
 * Ejercicio8
 * Hacer programa que imprima el nombre y la edad de la persona siempre y
 * cuando sea masculino y si es femenino que imprima la profesión y el tiempo
 * de laborar en la empresa.
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char genero = ' ';
        System.out.println("Introdusca el genero de la Persona (masculino o femenino): M/F o m/f ");
        genero = scanner.next().toLowerCase().charAt(0);
    
        if( genero == 'm' ){
            String nombre;
            int edad;
            System.out.print("Introdusca la edad de la persona: ");
            edad = scanner.nextInt();
            System.out.print("Introdusca el nombre de la persona: ");
            nombre = scanner.next();
            
            
            System.out.println("┌---------------------------------------------┐");
            System.out.println("|                DATOS PERSONALES             |");
            System.out.println("└---------------------------------------------┘");
            System.out.println("NOMBRE:\t" + nombre);
            System.out.println("EDAD :\t" + edad);
        }else if( genero == 'f' ){
            String profesion;
            int tiempo;
            System.out.print("Introdusca el tiempo (años) de laborar de la persona: ");
            tiempo = scanner.nextInt();
            System.out.print("Introdusca la profesion de la persona: ");
            profesion = scanner.next();
            System.out.println("┌---------------------------------------------┐");
            System.out.println("|                DATOS PERSONALES             |");
            System.out.println("└---------------------------------------------┘");
            System.out.println("Profesion:\t"+ profesion);
            System.out.println("Años laborales:\t" + tiempo);
        }else{
            System.out.println("El valor introducido no es reconocido");
        }
        System.out.println("\n---------------------Fin de Programa--------------------");
        scanner.close();
    }
}
