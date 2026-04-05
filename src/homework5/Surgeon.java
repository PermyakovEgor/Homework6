package homework5;

import java.util.Scanner;

public class Surgeon extends Doctor {

    @Override
    public int healsPlan() { //план лечения хирурга

        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: 1 — микрохирургия (+95 здоровья), 2 — пластика (+5 здоровья)");
        while (true) {
            int choice = scanner.nextInt();
            if (choice == 1) {
                healHP += 95;
                System.out.println("Здоровье после микрохирургической операции прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 5;
                System.out.println("Здоровье после пластической операции прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }
}
