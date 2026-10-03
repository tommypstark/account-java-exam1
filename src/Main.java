import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AccountRegister register = new AccountRegister();
        Scanner scanner = new Scanner(System.in);

        int choice = 0;
        while (choice != 5) {
            System.out.println();
            System.out.println("1. Skapa konto");
            System.out.println("2. Lista konton");
            System.out.println("3. Sätt in pengar");
            System.out.println("4. Ta ut pengar");
            System.out.println("5. Avsluta");
            System.out.print("Val: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("Ägare: ");
                String name = scanner.nextLine();
                System.out.print("Startsaldo: ");
                double startBalance = scanner.nextDouble();
                scanner.nextLine();
                register.createAccount(name, startBalance);

            } else if (choice == 2) {
                register.printAll();

            } else if (choice == 3) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.print("Belopp: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    found.deposit(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());

                } else {
                    System.out.println("Konto saknas: " + name);
                }

            } else if (choice == 4) {
                System.out.print("Namn: ");
                String name = scanner.nextLine();
                Account found = register.findAccount(name);

                if (found != null) {
                    System.out.print("Belopp: ");
                    double amount = scanner.nextDouble();
                    scanner.nextLine();
                    found.withdraw(amount);
                    System.out.println("Nytt saldo: " + found.getBalance());

                } else {
                    System.out.println("Konto saknas: " + name);
                }

            } else if (choice == 5) {
                System.out.println("Avslutar...");

            } else {
                System.out.println("Ogiltigt val!");
            }
        }

    }
}