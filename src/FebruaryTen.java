/*
Каждый элемент списка умножить на 2.(цикл без лямбдо выражений)
Удалить все элементы стоящие на четных позициях, если сами элементы не четные.
Все операции что мы сегодня разбирали попробовать на Set<String> = new любую ( получить размер, проверить contains, remove, add несколько элементов)
Все что выше сделать с MAP
PULL REQUEST ЗАДАНИЙ
1. Ветку берем, форк делаем.
2. В ней делаем дз, делаем комиты и делаем пуш на гитхаб
3. В гитхабе делаем пулл реквест новой ветки к той ветке от которой форкнулся
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class FebruaryTen {
    public static void main(String[] args) {
        List<Double> list = new ArrayList<>();
        for(int i = 0; i < 20; i++){
            list.add((double)ThreadLocalRandom.current().nextInt(1,10) / 2);
        }

        for(int i = 0; i < list.size(); i++){
            double d = (list.get(i) * 2);
            list.set(i,d);
            double g = list.get(i);
            if (i % 2 == 0 && g % 2 != 0){
                list.remove(i);
                i--;
            }
        }
    }
}
