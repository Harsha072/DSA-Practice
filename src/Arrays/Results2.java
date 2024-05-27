package Arrays;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class Results21 {

    /*
     * Complete the 'designerPdfViewer' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h
     *  2. STRING word
     */

    public static int designerPdfViewer(List<Integer> h, String word) {
        char start = 'a';
        int length = word.length();
        int height =0;
        int i=0;
        HashMap <Character, Integer>  letters = new HashMap<>();
        for (Integer integer : h) {
            letters.put(start++, integer);
        }

        for (int j = 0; j <word.length() ; j++) {
            for (Map.Entry<Character,Integer> entry : letters.entrySet()) {
                if(word.charAt(j)==entry.getKey()){
                    height = Math.max(height, entry.getValue());
                }
            }
        }




        return length*height;

    }

}
public class Results2 {

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));


        List<Integer> h = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        String word = bufferedReader.readLine();


        int result = Results21.designerPdfViewer(h, word);


    }

}
