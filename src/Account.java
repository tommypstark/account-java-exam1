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
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Beloppet måste vara större än 0.");
        } else if (amount > balance) {
            System.out.println("Otillräcklig täckning på kontot.");
        } else {
            balance -= amount;
        }
    }

    public void printInfo() {
        System.out.print("Ägare: " + owner + " | Saldo: " + balance);
    }

}