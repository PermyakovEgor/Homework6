package homework4;

import java.util.Random;
import java.util.Scanner;

public class CreditCard {

    int accountNumber;
    double balance;

    public CreditCard() {
        Random random = new Random();
        int min = 100_000_000;
        int max = 999_999_999;

// Генерируем число в диапазоне [min, max]
        this.accountNumber = random.nextInt(max - min + 1) + min;

        balance = random.nextDouble(1000);
        System.out.println(Math.round(balance));
        this.balance = balance;
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);

        double amount;
        System.out.println("Введите сумму, которую хотите внести на карту - " + accountNumber + ": ");
        amount = scanner.nextDouble();
        if (amount > 0) {
            balance += amount;
            balance = Math.round(balance * 100.0) / 100.0;
            System.out.println("Счет пополнен на " + amount + ". Текущий баланс: " + balance);
        }
    }

    public void payment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Текущий баланс карты -" + accountNumber + ": " + balance);
        System.out.println("Введите сумму, которую хотите списать с карты: ");
        double amount;
        amount = scanner.nextInt();
        if (amount <= balance) {
            balance -= amount;
            balance = Math.round(balance * 100.0) / 100.0;
            System.out.println("Со счета списано: " + amount + ". Текущий баланс: " + balance);
        }
        else {
            System.out.println("Недостаточно денег на карте для списания");
        }
    }

    public void cardBalance() {
        balance = Math.round(balance * 100.0) / 100.0;
        System.out.println("На карте: " + accountNumber + " текущий баланс: " + balance);
    }
}
