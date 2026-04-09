package homework9;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        Task1 task1 = new Task1();
        Animals animals = new Animals();
        Task3 task3 = new Task3();

        //Исполняется первое задание
        System.out.println("Первое задание");
        System.out.println("Введите несколько цифр через запятую: ");
        String start = scanner.nextLine();
        task1.task1(start);


        //Исполняется второе задание, начинается с добавления животного
        System.out.println("Второе задание");
        System.out.println("Введите животное, которое хотите добавить в зоопарк: ");
        String myZoo = scanner.nextLine();
        animals.addAnimal(myZoo);

        //Цикл для формирования животных в зоопарке
        while (true) {
            System.out.println("Хотите изменить зоопарк? Введите цифру 1 (если добавить), 2 (если удалить последнее животное) и любое другое, если зоопарк укомплектован");
            int choice = scanner.nextInt();
            scanner.nextLine(); //очистка, иначе не работает ввод при добавлении животного

            if (choice == 1) {
                System.out.println("Введите еще животное, которое хотите добавить в зоопарк: ");
                String myZooMore = scanner.nextLine();
                animals.addAnimal(myZooMore); //метод добавления животного из пользовательского ввода в начало списка
            } else if (choice == 2) {
                animals.removeAnimal(); //метод удаления последнего животного из списка
            }
            else {
                System.out.println("Зоопарк укомплектован");
                break;
            }
        }

        System.out.println("Третье задание");
        String[] array = {"c", "b", "c", "d", "a", "a", "d", "l"};
        task3.task3(array);
    }
}
