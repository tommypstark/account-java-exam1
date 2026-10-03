import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String owner, double startBalance) {
        Account account = new Account(owner, startBalance);
        accounts.add(account);
    }

    public SavingsAccount createSavingsAccount(String owner, double startBalance, double interestRate) {
        SavingsAccount created = new SavingsAccount(owner, startBalance, interestRate);
        accounts.add(created);
        return created;
    }

    public Account findAccount(String owner) {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);

            if (a.getOwner().equalsIgnoreCase(owner)) {
                return a;
            }
        }

        return null;
    }

    public void printAll() {
        for (int i = 0; i < accounts.size(); i++) {
            Account a = accounts.get(i);
            a.printInfo();
            System.out.println();
        }
    }

}