package homework3;

import java.util.Scanner;

public class homework3_7 {
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

        // Вывод исходного массива
        System.out.println("Массив");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Формирование числа из цифр в ПРЯМОМ порядке
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {  // начинаем с 0, идём до конца
            sum = sum * 10 + numbers[i];
        }

        // Прибавляем 1 к полученному числу
        sum++;
        System.out.println("Получили число: " + sum);

        // Подсчёт количества цифр в числе
        int temp = sum;
        int count = 0;
        if (temp == 0) {
            count = 1; // если число 0, то одна цифра
        } else {
            while (temp != 0) {
                count++;
                temp /= 10;
            }
        }

        // Создание массива цифр из числа
        int[] numbers2 = new int[count];
        temp = sum;
        for (int i = count - 1; i >= 0; i--) {
            numbers2[i] = temp % 10; // последняя цифра
            System.out.println(numbers2[i] + " остаток");
            temp /= 10;           // убираем последнюю цифру
            System.out.println(temp + " после цикла");
        }

        // Вывод нового массива
        System.out.println("Массив из числа");
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
    }
}
