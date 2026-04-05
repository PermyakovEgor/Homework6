package homework6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        try {
            int a = 5;
            int b = 0;
            int c = a / b;
            System.out.println(c);
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно (try-catch)");
        }
        System.out.println("Программа все равно продолжает работать\n");
        error1();
        error2();
        error3();
    }

    public static void error1() {
        Scanner scanner = new Scanner(System.in);
        try {
            int c = 5 / 2;
            System.out.println("Ввести любимое блюдо: ");
            int eat = scanner.nextInt();
            System.out.println("Ваше любимое блюдо: " + eat);
        }
        catch (ArithmeticException e) {
            System.out.println("Деление на ноль невозможно");
        }
        catch (InputMismatchException e) {
            System.out.println("В числовой переменной написали строковое значение  (try-catch-catch)");
        }
        System.out.println("Программа все равно продолжает работать\n");
    }

    public static void error2() {
        try {
            int c = 5 / 2;
            int num[] = {1, 2, 3};
            System.out.println(num[3]);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла типовая ошибка (try - multi catch)");
        }
        System.out.println("Программа все равно продолжает работать\n");
    }

    public static void error3() {
        try {
            int c = 5 / 0;
            System.out.println(c);
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошла типовая ошибка (try - catch - finally)");
        } finally {
            System.out.println("Здесь можно логировать, при любом результате работы метода");
        }
        System.out.println("Программа все равно продолжает работать");
    }
}
