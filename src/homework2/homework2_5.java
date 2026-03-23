package homework2;

import java.util.Scanner;

public class homework2_5 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        System.out.println();

        int a = scanner.nextInt();
        int b = 1;
        int sum = 0;
        if (a <= 0) {
            System.out.println("Число должно быть положительным");
        } else {
            for (b = 1; b <= a; b++) {
                sum += b;
            }
            System.out.println("Сумма чисел от 1 до " + a + " равна: " + sum);
        }
    }
}
