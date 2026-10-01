import java.util.ArrayList;
import java.util.List;

public class AccountRegister {
    private List<Account> accounts = new ArrayList<>();

    public void createAccount(String owner, double startBalance) {
        Account account = new Account(owner, startBalance);
        accounts.add(account);
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
            System.out.println("Konto: " + a.getOwner() + " | Balance: " + a.getBalance());
        }
    }

}