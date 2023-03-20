import java.util.ArrayList;
import java.util.Date;

class Account1 extends Account {

    private String name;
    private ArrayList<Transaction> transactions = new ArrayList<>();

    // Constructor
    public Account1(int id, double balance, String name) { super(id, balance); this.name = name; }

    // Methods
    public void withdraw(double amount, String description) {
        super.setBalance(super.getBalance() - amount);
        transactions.add(new Transaction('W', amount, super.getBalance(), description));
    }

    public void deposit(double amount, String description) {
        super.setBalance(super.getBalance() + amount);
        transactions.add(new Transaction('D', amount, super.getBalance(), description));
    }

    public void showAccountSummary() {
        System.out.printf(
            "============================\nAccount Summary for %s\n============================\nBalance: $%s\nInterest Rate: %s%s\n\n",
            this.name, super.getBalance(), super.getMonthlyInterestRate() * 12 * 100, "%"
        );
        for (Transaction transaction: this.transactions) System.out.println(transaction.getTransactionData());
    }

    // Main
    public static void main(String[] args) {
        
        Account1 acc = new Account1(1122, 1000, "George");
        
        acc.setAnnualInterestRate(1.5);
        acc.deposit(30, "Deposit $30");
        acc.deposit(40, "Deposit $40");
        acc.deposit(50, "Deposit $50");
        acc.withdraw(5, "Eating FSKTM Food");
        acc.withdraw(4, "Eating FSKTM Food");
        acc.withdraw(2, "Eating FSKTM Food");
        acc.showAccountSummary();
    }
}

class Transaction {

    private Date date;
    private char type;
    private double amount, balance;
    private String description;

    // Constructor
    public Transaction(char type, double amount, double balance, String description) {
        this.date = new Date();
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
    }

    // Methods
    public String getTransactionData() {
        return String.format(
            "Transaction on %s\nType: %s\nAmount: %s\nBalance: $%s\nDescription: %s\n",
            this.date.toString(), (this.type == 'W') ? "Withdraw" : "Deposit", this.amount, this.balance, this.description
        );
    }
}