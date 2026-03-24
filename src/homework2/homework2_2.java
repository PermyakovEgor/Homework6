package homework2;

import java.util.Scanner;

public class homework2_2 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру на улице");
        System.out.println();

        int t = scanner.nextInt();
        if (t <= -20) {
            System.out.println("Cold");
        } else if (t <= -5) {
            System.out.println("Normal");
        } else if (t > -5) {
            System.out.println("Warm");
        }
    }
}