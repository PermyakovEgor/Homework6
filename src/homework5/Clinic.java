package homework5;


import java.util.Scanner;

class Clinic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient(); // Создаём объект класса Patient
        //Выводим имя и текущее здоровье
        System.out.println("Здоровье пациента " + patient.name  + " на данный момент: " + patient.health);
        int visit = 0;

        while (true) {
            //Если пациент только пришел
            if (visit < 1) {
                System.out.println("Здравствуйте, я терапевт Иван Иванович, рассказывайте, что у вас");
                visit++;
            }
            else {
                //Если пациент уже прошел лечение, есть выбор идти еще лечиться или на выход
                System.out.println("Вас вылечил " + patient.myDoctor + " еще что-то беспокоит? (Нажать: 1 - нет, иначе - да)");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Нет доктор, я пойду, спасибо");
                    break;
                }
                else {
                    System.out.println("Да, знаете, у меня есть еще проблема");
                }
            }
            int healHP = 0;

            Duntist duntist = new Duntist();
            Hirurg hirurg = new Hirurg();
            Terapevt terapevt = new Terapevt();

            terapevt.direction(patient);

            //План лечения не супер подробный, но к цели приведет
            System.out.println("Ваш план лечения был следующий: " + patient.treatmentPlan);

            //Увеличение здоровья после лечения и вывод состояния пациента
            patient.health += terapevt.healHP;
            System.out.println("Здоровье пациента " + patient.name + " после лечения: " + patient.health);
        }
    }
}
