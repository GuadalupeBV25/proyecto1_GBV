
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author guada
 */
public class mediabaja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        double baja = 9999;  // valor inicial alto para que la primera calificación sea menor

        for (int n = 1; n <= 5; n++) {
            System.out.print("Ingresa la calificación del alumno " + n + ": ");
            double calif = scanner.nextDouble();
            sum = sum+calif;               // acumulamos  en la variable suma
            if (calif < baja) {         // actualizamos la calificacion más baja
                baja = calif;
            }
        }

        double media = sum / 5;          // fuera del ciclo para mostrar la  media correcta (5 calificaciones)
        System.out.println("Calificación media: " + media);
        System.out.println("Calificación más baja: " + baja);
        scanner.close();

    }
    
}
