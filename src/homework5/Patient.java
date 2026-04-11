package homework5;

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
    void setTreatmentPlan(String treatmentPlan) { this.treatmentPlan = treatmentPlan; }
}
