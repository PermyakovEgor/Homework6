package homework8;

import java.util.Arrays;
import java.util.Comparator;

class Task {
    private String str1;
    private String str2;
    private String str3;

    // Конструктор для приёма строк
    Task(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    void task1() {
        System.out.println("Задача 1 - вывести самую короткую и длинную строки");
        // Находим самую длинную строку
        String longest = str1;
        if (str2.length() > longest.length()) {
            longest = str2;
        }
        if (str3.length() > longest.length()) {
            longest = str3;
        }

        System.out.println("Самая длинная строка: " + longest + ", ее длина: " + longest.length());

        // Находим самую короткую строку
        String shortest = str1;
        if (str2.length() < shortest.length()) {
            shortest = str2;
        }
        if (str3.length() < shortest.length()) {
            shortest = str3;
        }
        System.out.println("Самая короткая строка: " + shortest + ", ее длина: " + shortest.length());
    }

    void task2() {

        String[] strings = {str1, str2, str3};

        Arrays.sort(strings, Comparator.comparing(String::length));

        // Выводим отсортированные строки
        System.out.println("Задача 2. Строки в порядке возрастания длины:");
        for (String str : strings) {
            System.out.println(str + " (длина: " + str.length() + ")");
        }
    }

    void task3() {
        System.out.println("Задача 3. Вывод строк, длина которых меньше средней");
        StringBuilder megaString = new StringBuilder();
        String[] strings = {str1, str2, str3};
        int quantity = 0;
        for (int i = 0; i < strings.length; i++) {
            megaString.append(strings[i]);
            quantity++;
        }

        int lenght = megaString.length() / quantity;
        System.out.println("Средняя длина строки: " + lenght);

        int a = 0;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < lenght) {
                System.out.println("строка: " + strings[i] + " - имеет длину меньше средней и составляет: " + strings[i].length());
                a++;
            }
        }
        if (a == 0) {
            System.out.println("Все строки одинаковой длины");
        }
    }

    void task4() {
        System.out.println("Задача 4. Вывести первую строку, у которой все символы уникальные");

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str3.toCharArray();

        boolean foundUnique = false;

        while (true) {
            // Проверяем str1
            boolean dubl1 = true;
            for (int i = 0; i < charArray1.length; i++) {
                for (int j = 0; j < charArray1.length; j++) {
                    if (i != j && charArray1[i] == charArray1[j]) {  // сравниваем разные позиции
                        dubl1 = false;  // нашли дубликат
                        break;
                    }
                }
                if (!dubl1) break;  // если нашли дубликат, дальше проверять нет смысла
            }
            if (dubl1) {
                System.out.println("Первая строка с уникальными символами: " + str1);
                break;  // выходим из while
            }

            // Аналогично для str2
            boolean dubl2 = true;
            for (int i = 0; i < charArray2.length; i++) {
                for (int j = 0; j < charArray2.length; j++) {
                    if (i != j && charArray2[i] == charArray2[j]) {
                        dubl2 = false;
                        break;
                    }
                }
                if (!dubl2) break;
            }
            if (dubl2) {
                System.out.println("Первая строка с уникальными символами: " + str2);
                break;
            }

            // Аналогично для str3
            boolean dubl3 = true;
            for (int i = 0; i < charArray3.length; i++) {
                for (int j = 0; j < charArray3.length; j++) {
                    if (i != j && charArray3[i] == charArray3[j]) {
                        dubl3 = false;
                        break;
                    }
                }
                if (!dubl3) break;
            }
            if (dubl3) {
                System.out.println("Первая строка с уникальными символами: " + str3);
                break;
            }

            // Если ни одна строка не подошла
            System.out.println("Нет строк с уникальными символами.");
            break;  // принудительно выходим из while
        }
    }

    void task5() {
        System.out.println("Задача 5. Вывести в консоль новую строку, у которой задублирована каждая буква старой строки");
        StringBuilder megaString = new StringBuilder();

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        char[] charArray3 = str3.toCharArray();

        for (int i = 0; i < charArray1.length; i++) {
            megaString.append(charArray1[i]);
            megaString.append(charArray1[i]);
        }
        System.out.println("Новая str1 = " + megaString);

        megaString = new StringBuilder();
        for (int i = 0; i < charArray2.length; i++) {
            megaString.append(charArray2[i]);
            megaString.append(charArray2[i]);
        }
        System.out.println("Новая str2 = " + megaString);

        megaString = new StringBuilder();
        for (int i = 0; i < charArray3.length; i++) {
            megaString.append(charArray3[i]);
            megaString.append(charArray3[i]);
        }
        System.out.println("Новая str3 = " + megaString);
    }
}