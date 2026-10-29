/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciot0002;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjercicioT0002 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner variedad = new Scanner(System.in);
        variedad.useLocale(Locale.US);
        // TODO code application logic here 
           double base, altura, area;
           System.out.print("Ingrese la base del triángulo: ");
        base = variedad.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        altura = variedad.nextDouble();

        area = (base * altura) / 2;

        System.out.println("\nÁREA DEL TRIÁNGULO");
        System.out.println("-------------------------------");
        System.out.printf(Locale.US, "Base: %.2f%n", base);
        System.out.printf(Locale.US, "Altura: %.2f%n", altura);
        System.out.println("-------------------------------");
        System.out.printf(Locale.US, "Área: %.2f%n", area);

        variedad.close();
    }
    
}
