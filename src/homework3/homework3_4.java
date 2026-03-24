package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int a = scanner.nextInt();

        //Наполнение массива в ручную
        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Введите цифру, которая будет в массиве по индексу: " + i);
            int b = scanner.nextInt();
            numbers[i] = b;
        }

        // Вывод массива
        System.out.println("Массив");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i] + " ");
        }

        //Подсчет кол-ва нулевых элементов
        int b = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                b++;
            }
        }

        if (b != 0) {
            System.out.println("Кол-во нулей в массиве: " + b);
        }
        else {
            System.out.println("Нулей в массиве нет");
        }
    }
}