package Strings;

public class ArrangeLexicoGraphically {
    public static void main(String[] args) {
        char [] arr = {'y','o','m','a'};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    char temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (char ele : arr) {
            System.out.println(ele);
        }
    }
}
