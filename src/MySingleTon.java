public class MySingleTon {
    private static MySingleTon mySingleTon=null;


    public static MySingleTon getObject(){
        if(mySingleTon==null){
            mySingleTon = new MySingleTon();
        }
        return mySingleTon;
    }

    public static void main(String[] args) {
        MySingleTon m = MySingleTon.getObject();

    }

}
