package homework9;

import java.util.*;

class Task3 {

    public void task3(String[] args) {
        Map<String, Integer> countMap = new LinkedHashMap<>();

        // Подсчёт кол-ва дублей с помощью цикла for each
        for (String word : args) {
            countMap.put(word, countMap.getOrDefault(word, 0) + 1); //2 метода, put - добавление, getOrDefault получение значения по ключу
        }

        //Создаем карту (строка, булевое значение)
        Map<String, Boolean> lastMap = new LinkedHashMap<>();
        //Постановка true, если кол-во строк больше одной с помощью цикла for each
        for (String word : countMap.keySet()) {
            lastMap.put(word, countMap.get(word) >= 2); //put добавляет ключ и значение, get возвращает значение, сравнивает и подставляет истина или ложь
        }
        System.out.println(lastMap);
    }
}