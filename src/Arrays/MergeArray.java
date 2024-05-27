package Arrays;

public class MergeArray {

    static  int [] mergeArray(int [] a, int []b){
        int k=0;
        //add the first array into resultant
        int [] resultant = new int[a.length+b.length];
        for(int i = 0;i<a.length;i++){
            resultant[i] = a[i];
        }
        //from the length of first array start adding the second array using another variable k
        for (int i = a.length; i <=resultant.length-1 ; i++) {
            resultant[i]=b[k++];
        }

        return resultant;
    }
    public static void main(String[] args) {
        int [] a = {2,7,8,5};
        int [] b = {2,8,4,6};
        if (a.length!=0 && b.length!=0){
          int [] res = mergeArray(a,b);
            for (int ele:res) {
                System.out.println(ele);
            }
        }

    }
}
