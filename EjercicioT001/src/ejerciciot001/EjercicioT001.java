/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciot001;

import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author ASUS
 */
public class EjercicioT001 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
        teclado.useLocale(Locale.US); // acepta el punto como separador decimal
        // TODO code application logic here
        
        String nombre1,  nombre2, nombre3;
        double gasto1, gasto2, gasto3;
        double totalGastos;
        
        // Ingreso de datos 
        // Ingreso de datos
        System.out.print("Ingrese el nombre del proyecto 1: ");
        nombre1 = teclado.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        gasto1 = teclado.nextDouble();
        teclado.nextLine(); // limpiar el salto de línea pendiente
        System.out.print("\nIngrese el nombre del proyecto 2: ");
        nombre2 = teclado.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        gasto2 = teclado.nextDouble();
        teclado.nextLine();
         System.out.print("\nIngrese el nombre del proyecto 3: ");
        nombre3 = teclado.nextLine();
        System.out.print("Ingrese el gasto mensual: ");
        gasto3 = teclado.nextDouble();
        teclado.nextLine();
        // total del gasto mensual 
        totalGastos = gasto1 + gasto2 + gasto3;
        
                 // Reporte
        System.out.println("\nCONTROL DE GASTOS DE PROYECTOS");
        System.out.println("Proyectos:");
        System.out.println("-------------------------------");
        System.out.printf(Locale.US, "1. %s: $%.2f%n", nombre1, gasto1);
        System.out.printf(Locale.US, "2. %s: $%.2f%n", nombre2, gasto2);
        System.out.printf(Locale.US, "3. %s: $%.2f%n", nombre3, gasto3);
        System.out.println("-------------------------------");
        System.out.printf(Locale.US, "GASTO MENSUAL TOTAL: $%.2f%n",totalGastos);
        teclado.close();
    }
    
}
