package Arrays;

public class test {
    private static boolean getlanguage(String[] language) {
        boolean res =false;
        for (int i = 0; i <language.length ; ++i) {
            System.out.println(i);
            if(language[i].equals("python")){
                res = true;
            }


        }
        return res;
    }
    public static void main(String[] args) {
        String [] language = {"java", "python","Javascript","php"};
        System.out.println(getlanguage(language));

    }


}
