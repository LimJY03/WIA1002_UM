import java.util.Date;

class Account {
    
    private int id = 0;
    private double balance = 0, annualInterestRate = 0;
    private Date dateCreated;

    // Constructor
    public Account() { this.dateCreated = new Date(); }
    public Account(int id, double balance) { this.id = id; this.balance = balance; this.dateCreated = new Date(); }

    // Methods
    public int getId() { return this.id; }
    public double getBalance() { return this.balance; }
    public double getAnnualInterestRate() { return this.annualInterestRate; }
    public String getDateCreated() { return this.dateCreated.toString(); }

    public void setId(int id) { this.id = id; }
    public void setBalance(double balance) { this.balance = balance; }    
    public void setAnnualInterestRate(double annualInterestRate) { this.annualInterestRate = annualInterestRate / 100; }

    public double getMonthlyInterestRate() { return this.annualInterestRate / 12; }
    public double getMonthlyInterest() { return this.balance * this.annualInterestRate; }
    public void withdraw(double amount) { this.balance -= (amount < this.balance) ? amount : 0; }
    public void deposit(double amount) { this.balance += amount; }

    // Main
    public static void main(String[] args) {
        
        Account acc = new Account(1122, 20000);

        acc.setAnnualInterestRate(4.5);
        acc.withdraw(2500);
        acc.deposit(3000);

        System.out.printf("Balance: %s\nMonthly Interest: %s\nDate Created: %s\n", acc.getBalance(), acc.getMonthlyInterest(), acc.getDateCreated());
    }
}