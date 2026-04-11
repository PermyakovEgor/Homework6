package homework5;

public class Surgeon extends Doctor {

    @Override
    public int healsPlan(int choice) { //план лечения хирурга

        while (true) {
            if (choice == 1) {
                healHP += 95;
                System.out.println("Здоровье после микрохирургической операции прибавилось на: " + healHP);
                break;
            } else if (choice == 2) {
                healHP += 5;
                System.out.println("Здоровье после пластической операции прибавилось на: " + healHP);
                break;
            } else {
                System.out.println("Введите корректное значение");
            }
        }
        return healHP;
    }
}
