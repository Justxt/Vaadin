import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static final int OPTION_REGISTER = 1;
    private static final int OPTION_LOGIN = 2;
    private static final int OPTION_DELETE_ACCOUNT = 3;
    private static final int OPTION_FINANCIAL_REPORTING = 4;
    private static final int OPTION_EXPENSES = 5;
    private static final int OPTION_EXIT = 6;

    public static void main(String[] args) {
        List<Client> clients = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        int option;
        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine(); // Consume el salto de línea después de leer el entero

            switch (option) {
                case OPTION_REGISTER:
                    Register.registerClient(clients, scanner);
                    break;
                case OPTION_LOGIN:
                    Login.login(clients, scanner);
                    break;
                case OPTION_DELETE_ACCOUNT:
                    DeleteAccount.deleteAccount(clients, scanner);
                    break;
                case OPTION_FINANCIAL_REPORTING:
                    FinancialReporting.showFinancialReport(clients);
                    break;
                case OPTION_EXPENSES:
                    Egresos.registerExpense(clients, scanner);
                    break;
                case OPTION_EXIT:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (option != OPTION_EXIT);
    }

    private static void printMenu() {
        System.out.println("=== Menú Principal ===");
        System.out.println("1. Registrar cliente");
        System.out.println("2. Iniciar sesión");
        System.out.println("3. Eliminar cuenta");
        System.out.println("4. Reporte financiero");
        System.out.println("5. Registrar egresos");
        System.out.println("6. Salir");
        System.out.print("Elige una opción: ");
    }
}