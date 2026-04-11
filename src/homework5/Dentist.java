package homework5;

public class Dentist extends Doctor {
    @Override
    public int healsPlan(int choice) { //план лечения стоматолога

        while (true) {
            if (choice == 1) {
                healHP += 5;
                System.out.println("Здоровье после установки брекетов прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 25;
                System.out.println("Здоровье после удаления зуба мудрости прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }
}
