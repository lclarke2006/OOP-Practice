import java.util.ArrayList;

public class Bank {
    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>(30);

        customers.add(new Customer("John", "Smith", 2000));
        customers.add(new Customer("Jane", "Doe", 500));
        customers.add(new Customer("Bob", "Smith", 2000));
        customers.add(new Customer("Jane", "Doe", 12000));
        customers.add(new Customer("Jane", "Smith", 4000));

        System.out.println(customers.get(1));

        ((Customer) customers.get(1)).deposit(100);

        System.out.println(customers.get(1));

        ((Customer) customers.get(1)).withdraw(200);

        System.out.println(customers.get(1));

        for (Customer customer : customers) {
            customer.interest();
        }

        System.out.println(customers.get(1));
    }
}
