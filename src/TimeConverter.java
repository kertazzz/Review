/*
*Вам требуется программа для перевода дней в секунды.
*Данный код использует количество дней в качестве вводных данных. Завершите код для перевода количества дней в секунды и вывода результата.

*Пример вводных данных:
*12

*Пример результата:
*1036800
 */

import java.util.Scanner;

public class TimeConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int hrsPerDay = 24;
        int minsPerHr = 60;
        int secInMins = 60;
        int secondCount = days * hrsPerDay * minsPerHr * secInMins;

        System.out.println(secondCount);
    }
    }

