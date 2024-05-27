package question1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Pilz {

    public static int getPeople (){
        int numberOfChocolate = 8;
        int people=0;
        for (int i = 0; i <=numberOfChocolate ; i++) {
            numberOfChocolate = numberOfChocolate - i;
            people =i;
        }
        return people;
    }
    public static void main(String[] args) throws IOException {
        System.out.println(getPeople());

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numInputs = Integer.parseInt(reader.readLine());
        for (int i = 0; i < numInputs; i++){
            String pattern = reader.readLine();
            try{
                Pattern pat=Pattern.compile(pattern);
                System.out.println("Valid");
            }catch(Exception e){
                System.out.println("Invalid");
            }
        }
    }

    }

