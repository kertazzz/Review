import java.util.*;

/*
Вы создаете игру в боулинг!
Данный код объявляет класс Bowling с конструктором и методом addPlayer().
У каждого игрока есть имя и баллы, которые хранятся в HashMap игроков.
Код в main использует данные 3 игроков в качестве вводных данных и добавляет их в игру.
Вам необходимо добавить к классу метод getWinner(), который рассчитает и выведет в результат имя игрока с максимальным количеством баллов.

Пример вводных данных:
Dave 42
Amy 103
Rob 64

Пример результата:
Amy
 */

 class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    public void getWinner() {

        String winnerName = "";
        int winnerScore = 0;
        for (Map.Entry<String, Integer> entry: players.entrySet()){
              int points = entry.getValue();
              String name = String.valueOf(entry.getKey());
              if(winnerScore < points){
                  winnerScore = points;
                  winnerName = name;
              }
            }
        System.out.println(winnerName);
        }
    }

public class WinnerName {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }

        game.getWinner();
    }
}
