package homework5;

import java.util.Scanner;

public class Patient {
    public String myDoctor = "";
    public int health = 5;
    String name = "Egor";
    public String treatmentPlan = "";

    public int planHealth() {
        Scanner scanner = new Scanner(System.in);
        int needDoctor = 0;
        System.out.println("Доктор, моя проблема. (Нажать: 1 - болит спина, 2 - болит зуб, иначе - попытаться объяснить)");
        int problem = scanner.nextInt();

        if (problem == 1) {
            needDoctor++;
            System.out.println("У меня болит спина, не знаю причину");
        } else if (problem == 2) {
            needDoctor += 2;
            System.out.println("У меня болит зуб, это к кому");
        } else {
            System.out.println("Слабость и температура, а может нет температуры");
            needDoctor += 3;
        }
        return needDoctor;
    }
}
