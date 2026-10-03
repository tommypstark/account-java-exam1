public class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String owner, double startBalance, double interestRate) {
        super(owner, startBalance);
        this.interestRate = interestRate;
    }

    public void applyInterest() {
        double interest = getBalance() * interestRate;
        deposit(interest);
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.print(" | Räntesats: " + interestRate);
    }

}