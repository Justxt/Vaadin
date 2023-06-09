import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
    private static final int OPTION_REGISTER = 1;
    private static final int OPTION_LOGIN = 2;
    private static final int OPTION_DELETE_ACCOUNT = 3;

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
                default:
                    System.out.println("Opción inválida. Por favor, elige una opción válida.");
            }
        } while (option != OPTION_LOGIN);
    }

    private static void printMenu() {
        System.out.println("FUNDACION - SALUD PARA TODOS");
        System.out.println("1. REGISTRAR CLIENTE");
        System.out.println("2. BUSCAR CLIENTE");
        System.out.println("3. ELIMINAR CUENTA");
        System.out.print("Elige una opción: ");
    }
}