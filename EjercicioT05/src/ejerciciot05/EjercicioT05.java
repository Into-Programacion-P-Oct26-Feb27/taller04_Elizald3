/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciot05;
import java.util.Locale;
import java.util.Scanner;


/**
 *
 * @author ASUS
 */
public class EjercicioT05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner variedad = new Scanner(System.in);
        variedad.useLocale(Locale.US);
        // TODO code application logic here
         // Descuentos fijos (no se ingresan por teclado)
        final double DESC_NETFLIX = 0.23;
        final double DESC_YOUTUBE = 0.23;
        final double DESC_DROPBOX = 0.45;
        final double DESC_SPOTIFY = 0.0;

        String cliente;
        double precioNetflix, precioYoutube, precioDropbox, precioSpotify;
        double descNetflix, descYoutube, descDropbox, descSpotify;
        double finalNetflix, finalYoutube, finalDropbox, finalSpotify;
        double totalSinDescuento, ahorroTotal, totalAPagar;

        // Ingreso de datos
        System.out.print("Ingrese el nombre del cliente: ");
        cliente = variedad.nextLine();
        System.out.print("Ingrese el precio mensual de Netflix: ");
        precioNetflix = variedad.nextDouble();
        System.out.print("Ingrese el precio mensual de YouTube Premium: ");
        precioYoutube = variedad.nextDouble();
        System.out.print("Ingrese el precio mensual de Dropbox: ");
        precioDropbox = variedad.nextDouble();
        System.out.print("Ingrese el precio mensual de Spotify: ");
        precioSpotify = variedad.nextDouble();

        // Valor del descuento por servicio
        descNetflix = precioNetflix * DESC_NETFLIX;
        descYoutube = precioYoutube * DESC_YOUTUBE;
        descDropbox = precioDropbox * DESC_DROPBOX;
        descSpotify = precioSpotify * DESC_SPOTIFY;

        // Precio final por servicio
        finalNetflix = precioNetflix - descNetflix;
        finalYoutube = precioYoutube - descYoutube;
        finalDropbox = precioDropbox - descDropbox;
        finalSpotify = precioSpotify - descSpotify;

        // Totales
        totalSinDescuento = precioNetflix + precioYoutube + precioDropbox + precioSpotify;
        ahorroTotal = descNetflix + descYoutube + descDropbox + descSpotify;
        totalAPagar = finalNetflix + finalYoutube + finalDropbox + finalSpotify;

        // Reporte
       
        System.out.println("REPORTE DE SERVICIOS DIGITALES");
        
        System.out.println("Cliente: " + cliente);
      
        System.out.printf(Locale.US, "%-18s %9s %10s %10s%n", "Servicio", "Precio", "Descuento", "Final");
        System.out.printf(Locale.US, "%-18s $%8.2f $%9.2f $%9.2f%n", "Netflix (23%)", precioNetflix, descNetflix, finalNetflix);
        System.out.printf(Locale.US, "%-18s $%8.2f $%9.2f $%9.2f%n", "YouTube (23%)", precioYoutube, descYoutube, finalYoutube);
        System.out.printf(Locale.US, "%-18s $%8.2f $%9.2f $%9.2f%n", "Dropbox (45%)", precioDropbox, descDropbox, finalDropbox);
        System.out.printf(Locale.US, "%-18s $%8.2f $%9.2f $%9.2f%n", "Spotify (0%)", precioSpotify, descSpotify, finalSpotify);
        
        System.out.printf(Locale.US, "Costo mensual sin descuentos: $%.2f%n", totalSinDescuento);
        System.out.printf(Locale.US, "Ahorro mensual total:         $%.2f%n", ahorroTotal);
        System.out.printf(Locale.US, "TOTAL A PAGAR MENSUAL:        $%.2f%n", totalAPagar);
        

        variedad.close();
    }
    
}
