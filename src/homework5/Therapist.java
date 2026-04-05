package homework5;

import java.util.Scanner;

public class Therapist extends Doctor {

    @Override
    public int healsPlan() { //план лечения терапевта

        int healHP = 0;  // количество восстанавливаемого здоровья;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите действие: 1 — таблетка (+30 здоровья), 2 — перевязка (+20 здоровья)");

        while (true) {
            int choice = scanner.nextInt();
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

    //метод назначения врача
    public int direction(Patient patient, int problem) { //direction для определения доктора и плана лечения в основном классе

        Surgeon hirurg = new Surgeon();
        Duntist duntist = new Duntist();

        int needDoctor = patient.chooseDoctor(problem); //В зависимости от жалоб подбирает врача


        //Терапевт советует к кому обратиться, назначает врача и план лечения
        switch (problem) {
            case 1:
            System.out.println("Я как терапевт, могу посоветовать обратиться к хирургу");
            patient.setMyDoctor("Хирург");
            System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
            healHP = hirurg.healsPlan();
            patient.setTreatmentPlan("Операция на спину, обратиться к хирургу второй кабинет");
                break;
            case 2:
            System.out.println("Я как терапевт, могу посоветовать обратиться к стоматологу");
            patient.setMyDoctor("Дантист");
            System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
            healHP = duntist.healsPlan();
            patient.setTreatmentPlan("Лечение зуба, обратиться к стоматологу третий кабинет");
                break;
            default:
            System.out.println("Я как терапевт могу сказать, что проблема по моей части, приступим к лечению");
            patient.setMyDoctor("Терапевт");
            System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
            patient.setTreatmentPlan("Причина явно не касается стоматолога и хирурга, обратиться к терапевту");
            healHP = healsPlan();
                break;
        }
        return needDoctor;
    }
}
