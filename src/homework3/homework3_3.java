package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int a = scanner.nextInt();

        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1000); // рандомные числа от 0 до 99
        }

        // Вывод массива
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Поиск min и max
        int min = numbers[0];
        int max = numbers[0];
        int b = 0;
        int c = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) b = i; //переопределяет значение минимального индекса, перебирая массив
            if (numbers[i] > max) c = i; //переопределяет значение максимального индекса, перебирая массив
        }

        System.out.println("индекс min: " + b);
        System.out.println("индекс max: " + c);
    }
}