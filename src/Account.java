public class Account {

    private String owner;
    private double balance;

    public Account(String owner, double startBalance) {
        this.owner = owner;
        this.balance = startBalance;
    }

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Otillräcklig täckning på kontot.");
        } else {
            balance -= amount;
        }
    }

}