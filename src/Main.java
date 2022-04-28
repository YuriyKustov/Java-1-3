public class Main {

    public static void main(String[] args) {
        int account = 120; // счет
        int awarded = 900; // сумма пополнения
        int totalSumm = account + awarded;
        int bonus = totalSumm / 100; // бонус
        if (awarded >= 1000) {
            System.out.println(totalSumm + " Рублей");
            System.out.println(bonus + " бонусов");
        } else {
            System.out.println(totalSumm + " Рублей");


        }
    }
}