package homework1;

public class homework1_6 {
    public static void main(String[] args) {
        int a = 22;
        int b = 33;
        int x = a; //сохраняем a во временной переменной
        a = b; //a присваиваем значение b
        b = x; //b присваиваем значение временной переменной x
        System.out.println("a = " + a + " и b = " + b);
    }
}
