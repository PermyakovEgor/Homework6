package homework5;

import java.util.Scanner;

public class Duntist extends Doctor {
    @Override
    public int healsPlan() { //план лечения стоматолога

        System.out.println("Выберите действие: 1 — брекеты (+5 здоровья), 2 — удаление зуба мудрости (+25 здоровья)");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        while (true) {
            if (choice == 1) {
                healHP += 5;
                System.out.println("Здоровье после установки брекетов прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 25;
                System.out.println("Здоровье после удаления зуба мудрости прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }
}
