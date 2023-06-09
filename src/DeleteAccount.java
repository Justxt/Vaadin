import java.util.List;
import java.util.Scanner;

    public class DeleteAccount {
        public static void deleteAccount(List<Client> clients, Scanner scanner) {
            System.out.println("=== Eliminar cuenta ===");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();

            for (int i = 0; i < clients.size(); i++) {
                if (clients.get(i).getCedula().equals(cedula)) {
                    clients.remove(i);
                    System.out.println("Cuenta eliminada exitosamente. Regresando al menú principal...");
                    System.out.println();
                    return;
                }
            }

            System.out.println("Cédula no encontrada. Regresando al menú principal...");
            System.out.println();
        }
    }