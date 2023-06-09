import java.util.List;
import java.util.Scanner;

public class Egresos {
    public static void registerExpense(List<Client> clients, Scanner scanner) {
        System.out.println("=== Registro de egresos ===");
        System.out.print("Cédula del cliente: ");
        String cedula = scanner.nextLine();

        // Busca el cliente por cédula
        for (Client client : clients) {
            if (client.getCedula().equals(cedula)) {
                System.out.print("Cantidad a descontar: ");
                double expense = scanner.nextDouble();
                scanner.nextLine(); // Consume el salto de línea después de leer el double
                System.out.print("Descripción: ");
                String description = scanner.nextLine();

                client.addExpense(expense, description);

                System.out.println("Egreso registrado exitosamente. Regresando al menú principal...");
                System.out.println();
                return;
            }
        }

        System.out.println("Cédula no encontrada. Volviendo al menú principal...");
        System.out.println();
    }
}