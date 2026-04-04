package homework5;

import java.util.Scanner;

public class Patient {

    private String myDoctor;
    private int health;
    private String name;
    private String treatmentPlan;

    public Patient(String myDoctor, int health, String name, String treatmentPlan) {
        this.myDoctor = myDoctor;
        this.health = health;
        this.name = name;
        this.treatmentPlan = treatmentPlan;
    }

    //После создания конструктора и объявления переменных private, создаем геттеры и сеттеры
    public String getMyDoctor() { return myDoctor; }
    int getHealth() { return health; }
    String getName() { return name; }
    String getTreatmentPlan() { return treatmentPlan; }

    // Сеттеры
    void setMyDoctor(String myDoctor) { this.myDoctor = myDoctor; }
    void setHealth(int health) { this.health = health; }
    void setName(String name) { this.name = name; }
    void setTreatmentPlan(String treatmentPlan) { this.treatmentPlan = treatmentPlan; }



    public int chooseDoctor(int problem) {

        int needDoctor = 0;

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
