package homework5;

import java.util.Scanner;

public class Terapevt extends Doctor {

    @Override
    public int healsPlan() { //план лечения терапевта

        int healHP = 0;  // количество восстанавливаемого здоровья;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие: 1 — таблетка (+30 здоровья), 2 — перевязка (+20 здоровья)");

        int choice = scanner.nextInt();
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

    public static void Appointment() {
        Scanner scanner = new Scanner(System.in);


    }

    //метод назначения врача
    public int direction(Patient patient) { //direction для определения доктора и плана лечения в основном классе

        Hirurg hirurg = new Hirurg();
        Duntist duntist = new Duntist();

        int needDoctor = patient.planHealth(); //В зависимости от жалоб подбирает врача


        //Терапевт советует к кому обратиться, назначает врача и план лечения
        if (needDoctor == 1) {
            System.out.println("Я как терапевт, могу посоветовать обратиться к хирургу");
            patient.myDoctor = "Хирург";
            System.out.println("Ваш лечащий врач: " + patient.myDoctor);
            healHP = hirurg.healsPlan();
            patient.treatmentPlan = "Операция на спину, обратиться к хирургу второй кабинет";
        } else if (needDoctor == 2) {
            System.out.println("Я как терапевт, могу посоветовать обратиться к стоматологу");
            patient.myDoctor = "Дантист";
            System.out.println("Ваш лечащий врач: " + patient.myDoctor);
            healHP = duntist.healsPlan();
            patient.treatmentPlan = "Лечение зуба, обратиться к стоматологу третий кабинет";
        } else if (needDoctor == 3) {
            System.out.println("Я как терапевт могу сказать, что проблема по моей части, приступим к лечению");
            patient.myDoctor = "Терапевт";
            System.out.println("Ваш лечащий врач: " + patient.myDoctor);
            patient.treatmentPlan = "Причина явно не касается стоматолога и хирурга, обратиться к терапевту";
            healHP = healsPlan();
        }
        return needDoctor;
    }
}
