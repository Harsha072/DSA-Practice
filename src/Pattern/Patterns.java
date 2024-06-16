package Pattern;

public class Patterns {
    public static void main(String[] args) {

        triangle(3,0);
    }

    private static void pattern(int n) {
        for (int row = 1; row <= n; row++) {

            for (int col = 1; col <= n + row- 1; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }

    private static void pattern2(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();

        }
    }

//    private static void pattern5(int n) {
//
//        for (int row = 1; row <= 2*n; row++) {
//             int totalNumberOfColumns =  row>n? (n-row)+n : row;
//            for (int col = 1; col <=totalNumberOfColumns; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//
//        }
//    }
    private static void pattern6(int n) {

        for (int row = 1; row <=n; row++) {
            int totalNumberOfspace =  n-row;
            for (int col = 1; col <=totalNumberOfspace; col++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=row ; col++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }
    private static void triangle(int r, int c) {
       if(r==0){
           return;
       }
       if(c<r){
           triangle(r,c+1);
           System.out.print("*");
       }
       else{
           triangle(r-1,0);
           System.out.println();
       }

    }
}

