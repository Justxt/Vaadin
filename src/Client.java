import java.util.ArrayList;
import java.util.List;

public class Client {
        private String name;
        private String cedula;
        private double payment;
        private List<String> descriptions;

        public Client(String name, String cedula, double payment) {
            this.name = name;
            this.cedula = cedula;
            this.payment = payment;
            this.descriptions = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getCedula() {
            return cedula;
        }

        public double getPayment() {
            return payment;
        }

        public void addExpense(double expense, String description) {
            this.payment -= expense;
            descriptions.add(description);
        }

        public List<String> getDescriptions() {
            return descriptions;
        }
    }