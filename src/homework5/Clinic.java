package homework5;


import java.util.Scanner;

class Clinic {
    public static void main(String[] args) {

        Therapist therapist = new Therapist();
        Dentist dentist = new Dentist();
        Surgeon surgeon = new Surgeon();
        Scanner scanner = new Scanner(System.in);
        Patient patient = new Patient("Терапевт", 5, "Егор", "Плана пока нет"); // Создаём объект класса Patient
        //Выводим имя и текущее здоровье
        int visit = 0;
        System.out.println("Здоровье пациента " + patient.getName() + " на данный момент: " + patient.getHealth());
        int totalHealed = 0;

        while (true) {
            //Если пациент только пришел
            if (visit < 1) {
                System.out.println("Здравствуйте, я терапевт Иван Иванович, рассказывайте, что у вас");
                visit++;
            } else {
                //Если пациент уже прошел лечение, есть выбор идти еще лечиться или на выход
                System.out.println("Вас вылечил " + patient.getMyDoctor() + " еще что-то беспокоит? (Нажать: 1 - нет, иначе - да)");
                int choice2 = scanner.nextInt();
                if (choice2 == 1) {
                    System.out.println("Нет доктор, я пойду, спасибо");
                    break;
                } else {
                    System.out.println("Да, знаете, у меня есть еще проблема");
                }
            }

            // Ввод проблемы пациента — происходит в Clinic
            System.out.println("Какая у вас проблема? (1 — болит спина, 2 — болит зуб, иначе — другая проблема)");
            int problem = scanner.nextInt();
            int choice = 0;

            therapist.chooseDoctor(problem);

            //Терапевт советует к кому обратиться, назначает врача и план лечения
            switch (problem) {
                case 1:
                    System.out.println("Я как терапевт, могу посоветовать обратиться к хирургу");
                    patient.setMyDoctor("Хирург");
                    System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
                    System.out.println("Выберите действие: 1 — микрохирургия (+95 здоровья), 2 — пластика (+5 здоровья)");
                    choice = scanner.nextInt();
                    surgeon.healHP = surgeon.healsPlan(choice);
                    totalHealed += surgeon.healHP; // накапливаем здоровье
                    patient.setTreatmentPlan("Операция на спину, обратиться к хирургу второй кабинет");
                    break;
                case 2:
                    System.out.println("Я как терапевт, могу посоветовать обратиться к стоматологу");
                    patient.setMyDoctor("Дантист");
                    System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
                    System.out.println("Выберите действие: 1 — брекеты (+5 здоровья), 2 — удаление зуба мудрости (+25 здоровья)");
                    choice = scanner.nextInt();
                    dentist.healHP = dentist.healsPlan(choice);
                    totalHealed += dentist.healHP; // накапливаем здоровье
                    patient.setTreatmentPlan("Лечение зуба, обратиться к стоматологу третий кабинет");
                    break;
                default:
                    System.out.println("Я как терапевт могу сказать, что проблема по моей части, приступим к лечению");
                    patient.setMyDoctor("Терапевт");
                    System.out.println("Ваш лечащий врач: " + patient.getMyDoctor());
                    System.out.println("Выберите действие: 1 — таблетка (+30 здоровья), 2 — перевязка (+20 здоровья)");
                    choice = scanner.nextInt();
                    patient.setTreatmentPlan("Причина явно не касается стоматолога и хирурга, обратиться к терапевту");
                    therapist.healHP = therapist.healsPlan(choice);
                    totalHealed += therapist.healHP; // накапливаем здоровье
                    break;
            }
            //План лечения не супер подробный, но к цели приведет
            System.out.println("Ваш план лечения был следующий: " + patient.getTreatmentPlan());

            //Увеличение здоровья после лечения и вывод состояния пациента
            patient.setHealth(patient.getHealth() + totalHealed);
            System.out.println("Здоровье пациента " + patient.getName() + " после лечения: " + patient.getHealth());
        }
        scanner.close();
    }
}

