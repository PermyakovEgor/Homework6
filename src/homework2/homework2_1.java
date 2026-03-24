package homework2;

import java.util.Scanner;

public class homework2_1 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        System.out.println();
        int a = scanner.nextInt();
        int b = a % 2;
        if (b == 0) {
            System.out.println("Число четное");
        } else {
            System.out.println("Число нечетное");
        }
    }
}