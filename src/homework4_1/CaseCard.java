package homework4_1;

class CaseCard {
    public static void main(String[] args) {
        // Создаём три объекта класса CreditCard с заданными номерами и начальными суммами
        CreditCard card1 = new CreditCard();
        CreditCard card2 = new CreditCard();
        CreditCard card3 = new CreditCard();

        System.out.println("=== Изначальное состояние карт ===");
        card1.cardBalance();
        card2.cardBalance();
        card3.cardBalance();

        System.out.println("=== Выполняем операции ===");
        // Тестовый сценарий:
        card1.deposit();  // Пополняем card1
        card2.deposit();  // Пополняем card2
        card3.payment(); // Снимаем с card3

        System.out.println("=== Текущее состояние всех карт ===");
        card1.cardBalance();
        card2.cardBalance();
        card3.cardBalance();
    }
}
