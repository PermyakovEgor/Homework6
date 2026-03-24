package homework3;

import java.util.Random;
import java.util.Scanner;

public class homework3_6 {
    public static void main(String[] args) {
        Random random = new Random();
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
            System.out.println(numbers[i]);
        }

        //Проверяем, является ли массив возрастаюищей последовательностью
        boolean istina = true;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] <= numbers[i - 1]) {
                System.out.println("Число с индексом: " + i + " равное " + numbers[i] + " меньше или равно предыдущему: " + numbers[i - 1]);
                istina = false;
                break;
            }
        }
        if (istina) {
            System.out.println("Массив является возврастающей последовательностью");
        }
        else {
            System.out.println("Массив не является возврастающей последовательностью");
        }
    }
}