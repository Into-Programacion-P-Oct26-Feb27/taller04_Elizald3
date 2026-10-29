/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciot03;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class EjercicioT03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner variedad = new Scanner(System.in);
        variedad.useLocale(Locale.US);
        // TODO code application logic here
        
        String titular, direccion;
        double costoMinuto, total;
        int minutos;

        System.out.print("Ingrese el nombre del titular: ");
        titular = variedad.nextLine();
        System.out.print("Ingrese la dirección: ");
        direccion = variedad.nextLine();
        System.out.print("Ingrese el costo por minuto: ");
        costoMinuto = variedad.nextDouble();
        System.out.print("Ingrese los minutos consumidos: ");
        minutos = variedad.nextInt();

        total = costoMinuto * minutos;

        System.out.println("\n==========================================================");
        System.out.println("PLANILLA DE SERVICIO TELEFÓNICO");
        System.out.println("==========================================================");
        System.out.println("Titular: " + titular);
        System.out.println("Dirección: " + direccion);
        System.out.println("----------------------------------------------------------");
        System.out.printf(Locale.US, "Costo por minuto: $%.2f%n", costoMinuto);
        System.out.println("Minutos consumidos: " + minutos);
        System.out.println("----------------------------------------------------------");
        System.out.printf(Locale.US, "VALOR TOTAL A PAGAR:  $%.2f%n", total);
        System.out.println("==========================================================");

        variedad.close();
    }
    
}
