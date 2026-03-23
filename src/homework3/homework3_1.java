package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_1 {
    public static void main (String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        System.out.println();
        int a = scanner.nextInt();
        int b = 0;

        int[] numbers = new int[a];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100); // рандомные числа от 0 до 99
        }

        System.out.println("Массив в прямом порядке");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }

        System.out.println("Массив в обратном порядке");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}
