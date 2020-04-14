import java.util.Arrays;

/**
 * @program: 0413
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-13 18:51
 **/

public class TestDemo {
    public static void main(String[] args) {

    }
    public static String myToString(int []array) {
        String ret="[ ";
        for(int i=0;i<array.length;i++) {
            ret=ret+array[i];
            if(i!=array.length-1) {
                ret=ret+",";
            }
        }
        ret=ret+"]";
        return ret;
    }
    public static void main2(String[] args) {
        //实现toString功能
        int []array={1,21,23,45,56};
        System.out.println(myToString(array));

    }



    public static int[] func(int[]array) {
        int []tmp= new int [array.length];
        for(int i=0;i<array.length;i++) {
            tmp[i]=array[i]*2;
        }
        return tmp;
    }
    public static void main1(String[] args) {
        int []array ={1,2,3,4,5,6,7};
        int []ret =func(array);
        System.out.println(Arrays.toString(ret));


    }
}
