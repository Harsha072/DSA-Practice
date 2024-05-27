package Arrays;

import java.util.Scanner;

public class ArrayGame {

    public static boolean canWin(int leap, int[] game) {
        boolean res = false;
        // Return true if you can win the game; otherwise, return false.
        int i=0;
//check if game is not null and leap is not null
        if(game[i+1]==0){
            i=i+1;
        }
        if(i - 1 >= 0 && game[i-1]==0){
            i= 0;
        }
        if(game[i+leap]==0){
            i=i+leap;
        }
        if(i+leap>=game.length){
            i=game.length-1;
            res=true;

        }
        return res;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int q = scan.nextInt();
        while (q-- > 0) {

            int n = scan.nextInt();

            int leap = scan.nextInt();

            int[] game = new int[n];

            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}