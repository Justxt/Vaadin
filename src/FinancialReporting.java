import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class FinancialReporting {
        public static void showFinancialReport(List<Client> clients) {
            System.out.println("=== Reporte financiero ===");

            double totalIncome = 0.0;
            double totalExpense = 0.0;
            int totalTransactions = 0;

            for (Client client : clients) {
                totalIncome += client.getPayment();
                totalExpense += calculateTotalExpense(client);
                totalTransactions++;
            }

            System.out.println("Total de ingresos: " + totalIncome);
            System.out.println("Total de egresos: " + totalExpense);
            System.out.println("Total de transacciones: " + totalTransactions);
            System.out.println();

            for (Client client : clients) {
                System.out.println("Cliente: " + client.getName());
                System.out.println("Cédula: " + client.getCedula());
                System.out.println("Pago: " + client.getPayment());
                System.out.println("Descripciones: " + client.getDescriptions());
                System.out.println();
            }
        }

        private static double calculateTotalExpense(Client client) {
            double totalExpense = 0.0;
            for (String description : client.getDescriptions()) {
                String[] parts = description.split(" - ");
                double expense = Double.parseDouble(parts[0]);
                totalExpense += expense;
            }
            return totalExpense;
        }
    }