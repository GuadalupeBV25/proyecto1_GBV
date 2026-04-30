
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guada
 */
public class Dowhilecubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int c = 1; // Inicialización manual
        
        do { 
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            
            int cubo = num * num * num;
            int cuarta = cubo * num;
            
            System.out.println("El cubo del número es: " + cubo);
            System.out.println("La cuarta del número es: " + cuarta);
            
            c++; // Incremento manual
        } while (c <= 10); // Condición de continuación
        
        scanner.close();
    }
    
}
