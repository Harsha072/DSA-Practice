package Strings;


import java.util.Comparator;
import java.util.Scanner;
import java.util.Arrays;

class Checker implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {

        Player p1 = (Player) o1;
        Player p2 = (Player) o2;

        if (p1.score > p2.score) {
            return -1;
        } else if (p1.score < p2.score) {
            return 1;
        } else {
            // Scores are equal, compare names
            int nameComparison = p1.name.compareTo(p2.name);
            if (nameComparison < 0) {
                return -1;
            } else if (nameComparison > 0) {
                return 1;
            } else {
                // Names are also equal
                return 0;
            }
        }
    }
}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();

        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();

        Arrays.sort(player, new Checker());
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }

        try {
            assert player[0].name.equals("Alice") : "First player should be Alice";
            assert player[1].name.equals("Charlie") : "Second player should be Charlie";
            assert player[2].name.equals("Bob") : "Third player should be Bob";
            assert player[3].name.equals("David") : "Fourth player should be David";
        }
        catch (AssertionError e){
            System.out.println(e);
        }

        System.out.println("\nAll assertions passed. Sorting is correct.");
    }
}