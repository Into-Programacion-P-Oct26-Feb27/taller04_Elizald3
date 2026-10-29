/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciot04;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class EjercicioT04 {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner localidad = new Scanner(System.in);
        localidad.useLocale(Locale.US);
        // TODO code application logic here
         final double PORCENTAJE_CO = 0.15; // valor fijo, no se ingresa por teclado

        String cliente;
        double cpu, pantalla, teclado, raton;
        double costoBase, costoOperacional, costoFinal;

        System.out.print("Ingrese el nombre del cliente: ");
        cliente = localidad.nextLine();
        System.out.print("Ingrese el costo del CPU: ");
        cpu = localidad.nextDouble();
        System.out.print("Ingrese el costo del teclado: ");
        teclado = localidad.nextDouble();
        System.out.print("Ingrese el costo del ratón: ");
        raton = localidad.nextDouble();
        System.out.print("Ingrese el costo de la pantalla: ");
        pantalla = localidad.nextDouble();

        costoBase = cpu + pantalla + teclado + raton;
        costoOperacional = costoBase * PORCENTAJE_CO;
        costoFinal = costoBase + costoOperacional;

        System.out.println("\nReporte:");
        System.out.println("Nombres de cliente: " + cliente);
        System.out.println("Valores iniciales:");
        System.out.printf(Locale.US, "CPU:  $ %.1f%n", cpu);
        System.out.printf(Locale.US, "Teclado: $ %.1f%n", teclado);
        System.out.printf(Locale.US, "Ratón: $ %.1f%n", raton);
        System.out.printf(Locale.US, "Pantalla: $ %.1f%n", pantalla);
        System.out.println();
        System.out.printf(Locale.US, "Costo base: $ %.2f%n", costoBase);
        System.out.printf(Locale.US, "Costo adicional del 15%%: %.2f%n", costoOperacional);
        System.out.printf(Locale.US, "Costo final: $ %.2f%n", costoFinal);

        localidad.close();
    }
    
}
