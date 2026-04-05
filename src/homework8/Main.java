package homework8;

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите 3 разных строковых значения:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        // Создаём объект Task и передаём строки в конструктор
        Task task = new Task(str1, str2, str3);
        task.task1(); // вызываем метод task1
        task.task2(); // вызываем метод task2
        task.task3(); // вызываем метод task3
        task.task4(); // вызываем метод task4
        task.task5(); // вызываем метод task5

        scanner.close(); // закрываем сканер
    }
}