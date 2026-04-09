package homework9;

import java.util.Scanner;
import java.util.*;

public class Task1 {

    public void task1(String start) {

        //Преобразование в коллекцию, разбиение по запятой
        List<String> stringNumbers = Arrays.asList(start.split(","));

        //Преобразование строковых значений в числовые и удаление пробелов
        List<Integer> numbers = stringNumbers.stream()
                .map(String::trim) //удаляем пробелы
                .map(Integer::parseInt) //преобразует в int
                .toList(); //Собираем результат без пробелов обратно в List

        //Убираем дубликаты, преобразуем в LinkedHashSet (убираются автоматически)
        Set<Integer> intNumbers = new LinkedHashSet<>(numbers);

        System.out.println("Числа без дубликатов: " + intNumbers);
    }

}
