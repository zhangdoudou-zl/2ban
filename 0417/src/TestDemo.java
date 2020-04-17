import java.util.Arrays;

/**
 * @program: 0417
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-17 22:29
 **/
public class TestDemo {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6};
      String ret=  myToString(array);
        System.out.println(ret);

    }
    public static String  myToString(int[] array){
        String ret="[";
        for(int i=0;i<array.length;i++){
            ret=ret+array[i];
            if(i<array.length-1) {
                ret += ",";
            }

        }
        return ret+"]";

    }


    public static void main4(String[] args) {
        int[] array={1,2,3,4,5,6};
        int[] ret=copyOf(array);
        System.out.println(Arrays.toString(ret));
    }
    public static int[] copyOf(int[] array){
        int[] ret=new int[array.length];
        for (int i=0;i<array.length;i++){
            ret[i]=array[i];
        }
        return ret;
    }


    public static void main3(String[] args) {
        int[] array={1,4,6,8,10};
        System.out.println(myBinarySearch(array,11));
    }
    public static int myBinarySearch(int[] array,int n){
        int left=0;
        int right=array.length-1;
        while(left<right){
            int mid=(left+right)/2;
            if(n>array[mid]){
                left=mid+1;
            }else if(n<array[mid]){
                right=mid-1;
            }else{
                return mid;
            }
        }
        return -1;
    }


    public static void main2(String[] args) {
        int[] array={5,3,41,2,4};
        System.out.println(judge(array));
    }
    public static boolean judge(int[] array){
        for(int i=0;i<array.length-1;i++) {
            if (array[i]>array[i+1]){
                return false;
            }
        }return true;
    }


    public static void main1(String[] args) {
        int[] array={20,17,18,15,11,10};
        BubbleSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void BubbleSort(int[] array){
        for(int i=0;i<array.length-1;i++){
            boolean flg=false;

            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if(flg=false){
                break;
            }
        }
    }
}
