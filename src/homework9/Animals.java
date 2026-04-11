package homework9;

import java.util.*;

public class Animals {
    private LinkedList<String> animals = new LinkedList<>();  // нестатическое поле

    // Метод добавления животного в начало коллекции
    public void addAnimal(String animal) {
        animals.addFirst(animal);  // Добавляем животное, которое пользователь ввел в main
        System.out.println("Добавлено животное: " + animal);
        System.out.println("Текущее состояние зоопарка: " + animals);
    }

    //Метод удаления животного
    public void removeAnimal() {
        System.out.println("Последнее животное в списке было: " + animals.getLast());
        animals.removeLast();  // Удаляем последнее животное из списка
        System.out.println("Последнее животное удалено, текущее состояние зоопарка: " + animals);
    }
}