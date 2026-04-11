package homework5;

import java.util.Scanner;

public class Therapist extends Doctor {

    @Override
    public int healsPlan(int choice) { //план лечения терапевта

        int healHP = 0;  // количество восстанавливаемого здоровья;

        while (true) {
            if (choice == 1) {
                healHP += 30;
                System.out.println("Здоровья после таблетки прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 20;
                System.out.println("Здоровья после перевязки прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }

    public int chooseDoctor(int problem) {

        if (problem == 1) {
            System.out.println("У меня болит спина, не знаю причину");
        } else if (problem == 2) {
            System.out.println("У меня болит зуб, это к кому");
        } else {
            System.out.println("Слабость и температура, а может нет температуры");
        }
        return problem;
    }
}
