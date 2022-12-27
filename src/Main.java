public class Main {
    public static void main(String[] args) {

        int balance = 200;
        int refill = 1000;
        int percent;
        if (refill >= 1000) {
            percent = 1;
        } else {
            percent = 0;
        }
        int bonus = refill / 100 * percent;
        int totalBalance = balance + refill + bonus;

        System.out.println("Баланс составляет:" + totalBalance);

    }
}