package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_5 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длину массива: ");
        int a = scanner.nextInt();

        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000); // рандомные числа от 0 до 99
        }

        // Вывод массива
        System.out.println("Массив");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        //Меняем местами числа в массиве
        int b = 0;
        int c = 0;
        for (int i = 0; i < numbers.length / 2; i++) {
            b = numbers.length - 1 - i; //находим противоположный с конца индекс
            c = numbers[i];
            numbers[i] = numbers[b];
            numbers[b] = c;
        }
        // Вывод массива после перестановки
        System.out.println("Массив после исправления");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
    }
}
