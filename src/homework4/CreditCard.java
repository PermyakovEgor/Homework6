package homework4;

import java.util.Scanner;

public class CreditCard {

    long accountNumber;
    double balance;

    public CreditCard() {
        Scanner scanner = new Scanner(System.in);

// Генерируем число в диапазоне [min, max]
        while (accountNumber < 100000000 || accountNumber > 999999999) {
            System.out.println("Введите номер карты, должно быть 9 значное число и 1 цифра не 0");
            accountNumber = scanner.nextLong();
            if (accountNumber < 100000000 || accountNumber > 999999999) {
                System.out.println("Введите корректный номер карты");
            }
            else {
                System.out.println("Карта с номером: " + accountNumber + " - успешно создана");
            }
        }
        System.out.println("Введите сумму, на которую хотите пополнить карту: " + accountNumber);
        balance = scanner.nextDouble();
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
