package homework5;


import java.util.Scanner;

class Clinic {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient("Терапевт", 5, "Егор", "Плана пока нет"); // Создаём объект класса Patient
        //Выводим имя и текущее здоровье
        int visit = 0;
        System.out.println("Здоровье пациента " + patient.getName()  + " на данный момент: " + patient.getHealth());

        while (true) {
            //Если пациент только пришел
            if (visit < 1) {
                System.out.println("Здравствуйте, я терапевт Иван Иванович, рассказывайте, что у вас");
                visit++;
            }
            else {
                //Если пациент уже прошел лечение, есть выбор идти еще лечиться или на выход
                System.out.println("Вас вылечил " + patient.getMyDoctor() + " еще что-то беспокоит? (Нажать: 1 - нет, иначе - да)");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Нет доктор, я пойду, спасибо");
                    break;
                }
                else {
                    System.out.println("Да, знаете, у меня есть еще проблема");
                }
            }

            // Ввод проблемы пациента — происходит в Clinic
            System.out.println("Какая у вас проблема? (1 — болит спина, 2 — болит зуб, иначе — другая проблема)");
            int problem = scanner.nextInt();

            // Передаём проблему врачу
            Therapist terapevt = new Therapist();

            terapevt.direction(patient, problem);

            //План лечения не супер подробный, но к цели приведет
            System.out.println("Ваш план лечения был следующий: " + patient.getTreatmentPlan());

            //Увеличение здоровья после лечения и вывод состояния пациента
            patient.setHealth(patient.getHealth()  + terapevt.healHP);
            System.out.println("Здоровье пациента " + patient.getName() + " после лечения: " + patient.getHealth());
        }
    }
}
