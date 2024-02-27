/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploswitch;

/**
 *
 * @author Usuario
 */
import java.util.Scanner;

public class EjemploSwitch {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Elige una opción:");
            System.out.println("1. Saludar");
            System.out.println("2. Despedirse");
            System.out.println("3. Mostrar hora actual");
            System.out.println("4. Salir");
            
            int opcion = scanner.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Hola, ¡bienvenido!");
                    break;
                case 2:
                    System.out.println("Hasta luego, ¡que tengas un buen día!");
                    break;
                case 3:
                    // Supongamos que aquí hay una función para obtener la hora actual
                    String horaActual = obtenerHoraActual();
                    System.out.println("La hora actual es: " + horaActual);
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static String obtenerHoraActual() {
        // Aquí puedes implementar la lógica para obtener la hora actual del sistema
        // Por simplicidad, en este ejemplo retornamos una hora ficticia
        return "12:00 PM";
    }
}
