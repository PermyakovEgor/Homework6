package homework5;

import java.util.Scanner;

public abstract class Doctor {

    protected int healHP;
    public int healsPlan() {
        int healHP = 0;  // количество восстанавливаемого здоровья;
        Scanner scanner = new Scanner(System.in);

        int choice = scanner.nextInt();
        while (true) {
            System.out.println("Выберите действие: 1 — таблетка (+50 здоровья), 2 — перевязка (+20 здоровья)");
            if (choice == 1) {
                healHP += 20;
                System.out.println("Здоровья после таблетки прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 10;
                System.out.println("Здоровья после перевязки прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }
}
