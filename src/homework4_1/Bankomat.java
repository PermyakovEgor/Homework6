package homework4_1;

import java.util.Random;
import java.util.Scanner;

public class Bankomat {
    public int[] nominal = {20, 50, 100}; // Массив допустимых номиналов
    public int[] count = new int[3]; // Массив для хранения количества купюр каждого номинала
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    //Инициализации кол-ва купюр
    public void atm() {
        for (int i = 0; i < count.length; i++) {
            count[i] = random.nextInt(1001);
            System.out.println(count[i] + "купюр данного номинала");
        }
    }

    //Пополнение банкомата, до 1000 купюр
    public void incas() {
        int nominals = 0;
        int index;

        while (true) {
            System.out.println("Введите номинал купюр (20, 50, 100):");
                nominals = scanner.nextInt();
                if (nominals == 20) {
                    index = 0;
                    break;
                } else if (nominals == 50) {
                    index = 1;
                    break;
                } else if (nominals == 100) {
                    index = 2;
                    break;
                } else {
                    System.out.println("Введите корректный номинал купюр: 20, 50 или 100");
                }
            }
                System.out.println("Сейчас в банкомате " + count[index] + " купюр номиналом: " + nominals);
                // Пополнение количества купюр
                while (true) {
                    System.out.println("Введите кол-во купюр для пополнения с номиналом: " + nominals);
                    int addCount = scanner.nextInt();

                    if (count[index] + addCount > 1000) {
                        System.out.println("Больше 1000 купюр одного номинала нельзя. Текущее количество: " + count[index]);
                    } else {
                        count[index] += addCount;
                        System.out.println("Купюр номиналом " + nominals + " рублей — " + count[index]);
                        break;
            }
        }
    }

    // Снятие денег с учётом доступных номиналов
    public void cashout(int amount) {
        System.out.println("Доступные номиналы и их количество:");
        for (int i = 0; i < nominal.length; i++) {
            System.out.println(nominal[i] + " руб. — " + count[i] + " шт.");
        }

        System.out.println("Введите сумму для снятия:");
        int remaining = amount;

        // Пытаемся снять деньги, начиная с наибольшего номинала
        for (int i = nominal.length - 1; i >= 0; i--) {
            int a = nominal[i]; //начиная с наибольшего номинала
            int maxBills = Math.min(remaining / a, count[i]); //проверка хватает ли нужных купюр

            if (maxBills > 0) {
                remaining -= maxBills * a;
                count[i] -= maxBills;
                System.out.println("Выдано " + maxBills + " купюр по " + a + " руб.");
            }
        }

        //проверка, хватило ли нужных купюр
        if (remaining > 0) {
            System.out.println("Невозможно выдать такую сумму, кончились купюры, забирай что есть и убирайся");
        } else {
            System.out.println("Сумма выдана успешно!");
        }
    }

    // Вывод текущего состояния банкомата
    public void printStatus() {
        System.out.println("\n--- Текущее состояние банкомата ---");
        for (int i = 0; i < nominal.length; i++) {
            System.out.println("Номинал " + nominal[i] + " руб.: " + count[i] + " купюр");
        }
    }
}

