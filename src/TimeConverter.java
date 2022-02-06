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
    final static int HRS_PER_DAY = 24;
    final static int MINS_PER_HR = 60;
    final static int SECS_PER_HR = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();

        int secondCount = days * HRS_PER_DAY * MINS_PER_HR * SECS_PER_HR;

        System.out.println(secondCount);
    }
    }

