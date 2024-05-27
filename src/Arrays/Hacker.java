package Arrays;

import java.io.*;
import java.util.Scanner;

public class Hacker {
    class Result
    {

        public static String decryptMessage(String encryptedMessage) {
            StringBuilder t = new StringBuilder();
            StringBuilder resut = new StringBuilder();
            if(!encryptedMessage.equals("null")){
                char [] letters = encryptedMessage.toCharArray();
                for (int i = 0; i <letters.length ; i++) {
                    if(Character.isDigit(letters[i])){
                        int a = Integer.parseInt(String.valueOf(letters[i]));
                        char b = letters[i-1];
                        for (int j = 1; j <a ; j++) {
                            t.append(b);
                        }
                    }
                    else{
                        t.append(letters[i]);
                    }
                }
                String  res = t.toString();

                String [] s = res.split(" ");
                for (int i = s.length-1; i >=0 ; i--) {
                    resut.append(s[i]).append(" ");
                }

            }

            return resut.toString();
        }

    }
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String res = sc.nextLine();
        Result.decryptMessage(res);
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//        String encryptedMessage = bufferedReader.readLine();
//
//        String result = Result.decryptMessage(encryptedMessage);
//
//        bufferedWriter.write(result);
//        bufferedWriter.newLine();
//
//        bufferedReader.close();
//        bufferedWriter.close();
    }
}
