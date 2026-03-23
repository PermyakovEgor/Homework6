package homework1;

public class homework1_2 {
    public static void main(String[] args) {
        int n = 33;
        int sum = 0;
        while (n > 0) {
            int a = n % 10;
            System.out.println("Выводим остаток от деления n = " + n + " на 10 = " + a);
            sum += a; //прибавляем к переменной остаток
            n /= 10;
            System.out.println("n = " + n);
            System.out.println("sum = " + sum);
        }
    }
}
