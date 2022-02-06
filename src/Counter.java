/*
Странный клиент любит число 3 и хочет, чтобы вы написали программу, которая выводит все числа от 1 до введенного им числа, которые либо кратны 3, либо заканчиваются на 3.

Пример вводных данных
14

Пример результата
3
6
9
12
13
 */
import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number = read.nextInt();
        int x = 1;

        while(x <= number){
            int y = x % 3;
            int z = x % 10;
            if((y == 0)|| (z == 3)){
                System.out.println(x);
            }
            x++;
        }
    }
}
