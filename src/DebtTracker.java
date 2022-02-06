/*
Вы занимаете деньги у друга и вам необходимо рассчитать, сколько вы будете должны ему через 3 месяца.
Каждый месяц вы будете возвращать ему по 10% от суммы долга.
Создайте программу, которая использует сумму долга в качестве вводных данных, рассчитает и выведет в результат остаток суммы через 3 месяца.

Пример вводных данных:
20000

Пример результата:
10628

График платежей:
Месяц 1
Платеж: 10% от 20000 = 2000
Остаток долга: 18000
Месяц 2
Платеж: 10% от 18000 = 1800
Остаток долга: 16200
Месяц 3:
Платеж: 10% от 16200 = 1620
Остаток долга: 14580
 */

import java.util.Scanner;
public class DebtTracker {
        final static int MONTH_PERCENT = 10;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();

        int amountLeft = 0;
        for(int i = 0; i < 3; i++){
            int monthPayment = (amount * MONTH_PERCENT / 100);
            amount -= monthPayment;
            amountLeft = amount;

        }

        System.out.println(amountLeft);
    }
}
