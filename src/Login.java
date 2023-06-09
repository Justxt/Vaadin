import java.util.List;
import java.util.Scanner;

    public class Login {
        public static void login(List<Client> clients, Scanner scanner) {
            System.out.println("=== Iniciar sesión ===");
            System.out.print("Cédula: ");
            String cedula = scanner.nextLine();

            for (Client client : clients) {
                if (client.getCedula().equals(cedula)) {
                    System.out.println("¡Cliente encontrado!");
                    System.out.println("Nombre: " + client.getName());
                    System.out.println("Pago total: " + client.getPayment());
                    System.out.println("Regresando al menú principal...");
                    System.out.println();
                    return;
                }
            }

            System.out.println("Cédula no encontrada. Regresando al menú principal...");
            System.out.println();
        }
    }
