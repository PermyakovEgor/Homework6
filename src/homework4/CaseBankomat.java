package homework4;

class CaseBankomat {
    public static void main(String[] args) {
        Bankomat atm = new Bankomat();

        System.out.println("Инициализация банкомата:");
        atm.ATM();

        //метод выводящий кол-во купюр всех номиналов
        atm.printStatus();

        System.out.println("=== Операция пополнения ===");
        //нужно пройти все 3 раза по пополнению, если пополнять не нужно указать 0 купюр
        atm.incas();
        atm.incas();
        atm.incas();
        atm.printStatus();

        System.out.println("=== Операция снятия ===");
        atm.cashout();
        atm.printStatus();
    }
}
