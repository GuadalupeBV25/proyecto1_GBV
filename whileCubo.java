
import java.util.Scanner;



/**
 *
 * @author guada
 */
public class whileCubo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int c = 1; // Inicialización manual
        
        while (c <= 10) { // Condición de ejecución
            System.out.print("Ingrese un número: ");
            int num = scanner.nextInt();
            
            int cubo = num * num * num;
            int cuarta = cubo * num;
            
            System.out.println("El cubo del número es: " + cubo);
            System.out.println("La cuarta del número es: " + cuarta);
            
            c++; // Incremento manual
        }
       
        scanner.close();
    }
    
}
