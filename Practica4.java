/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4;
import java.util.Scanner;

/**
 *
 * @author labcca
 */
public class Practica4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner total = new Scanner (System.in);
        System.out.println("Ingresa tu cantidad de pesos: ");
        int cantidad = total.nextInt();
        
        double dolar = 17.15;
        
        double d = cantidad/dolar;
        
        double euro = 18.27;
        
        double e = cantidad/euro;
        
        total.close();
        
        System.out.println("Tu cantidad en dolares es: " + d);
        System.out.println("Tu cantidad en euros es: " + e);
       
    }
    
}
