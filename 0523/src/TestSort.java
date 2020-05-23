import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @program: 0523
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-23 14:17
 **/
public class TestSort {
    //插入排序
    public static void insertSort(int[] array){
       for (int i = 1;i<array.length;i++){
           int j=i-1;
           int tmp=array[i];
           while (j>=0){
               if (tmp<array[j]){
                   array[j+1]=array[j];
                   j--;
               }else {
//                   array[j+1]=tmp;
                   break;
               }
           }
           array[j+1]=tmp;
       }
    }
    public static void main(String[] args) {
        int[] array={10,2,3,53,1,9};
        insertSort(array);
        System.out.println(Arrays.toString(array));


    }
}
