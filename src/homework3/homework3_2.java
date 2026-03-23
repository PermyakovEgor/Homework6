package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();

        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // рандомные числа от 0 до 99
        }

        // Вывод массива
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Поиск min и max
        int min = numbers[0];
        int max = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) min = numbers[i]; //переопределяет значение минимального, перебирая массив
            if (numbers[i] > max) max = numbers[i]; //переопределяет значение максимального, перебирая массив
        }

        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}
