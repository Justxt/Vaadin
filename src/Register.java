import java.util.List;
import java.util.Scanner;

    public class Register {
        public static void registerClient(List<Client> clients, Scanner scanner) {
            System.out.println("=== Registro de cliente ===");
            System.out.print("Nombre: ");
            String name = scanner.nextLine();
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();
            System.out.print("Pago: ");
            double payment = scanner.nextDouble();
            scanner.nextLine(); // Consume el salto de línea después de leer el double

            clients.add(new Client(name, cedula, payment));

            System.out.println("Registro de cliente exitoso. Regresando al menú principal...");
            System.out.println();
        }
    }