public class Customer {
    String name;
    String accountNumber;
    double balance;

    public Customer(String name, String accountNumber, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public double deposit(double amount) {

        if (amount < 0) {
            System.out.println("Invalid deposit amount");
            return balance;
        }

        else {
            balance = balance + amount;
            return balance;
        }
    }

    public double withdraw(double amount) {
        double new_balance = balance - amount;

        if (new_balance < 0) {
            System.out.println("Invalid withdrawal amount");
            return balance;
        }

        else {
            balance = balance - amount;
            return balance;
        }
    }

    public double interest() {
        balance = balance * 1.03;
        return balance;
    }

    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", accountNumber='" + accountNumber + '\'' +
                ", balance=" + balance +
                '}';
    }
}
