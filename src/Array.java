import java.sql.SQLOutput;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Array {


        public static void main (String[]args){

            int[] arr = new int[10];

            int sum = 0;
            int countOf5 = 0;
            int max = 0;
            for (int i : arr) {
                arr[i] = ThreadLocalRandom.current().nextInt(10);
                System.out.println(arr[i]);
                if (arr[i] % 2 == 0) {
                    sum += arr[i];
                }
                if (arr[i] == 5) {
                    countOf5++;
                }
                if (arr[i] > max){
                    max = arr[i];
                }
            }
            int mediumSum = (sum / arr.length);

            System.out.println("Сумма = " + sum);
            System.out.println("Количество 5 = " + countOf5);
            System.out.println("Max = " + max);
            System.out.println("Среднеарифметическое = " + mediumSum);

        }
    }
