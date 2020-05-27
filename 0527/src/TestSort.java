import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

/**
 * @program: 0527
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-27 14:50
 **/
public class TestSort {
    //找基准
    public static int partition(int[] array,int low,int high){
        int tmp=array[low];
        while (low<high){
           while (low<high&&array[high]>=tmp){
               high--;
           }
           array[low]=array[high];
           while (low<high&&array[low]<=tmp){
               low++;
           }
           array[high]=array[low];
        }
        array[low]=tmp;
        return low;
    }

    public static void swap(int[] array,int b,int c){
           int tmp=array[b];
           array[b]=array[c];
           array[c]=tmp;
    }
    public static void three_num_mid(int[]array,int left,int right){
        //array[mid]<=array[left]<=array[right]
        int mid=(left+right)/2;
       if (array[mid]>array[left]){
           swap(array,mid,left);
       }
       if(array[left]>array[right]){
           swap(array,left,right);
        }
       if (array[mid]>array[right]){
           swap(array,mid,right);
       }
    }
    public static void insert_Sort(int[] array,int start,int end){
        int tmp = 0;
        for (int i = start+1; i <= end; i++) {
            tmp = array[i];
            int j;
            for (j = i-1; j >= start ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    break;
                }
            }
            array[j+1] = tmp;
        }
    }
    public static void quick(int[] array,int left,int right){
        if (left>=right){
            return;
        }
  // 优化方式一：当待排序序列的数据个数小于等于100的时候，用直接插入排序
        if (right-left+1<=100){
            insert_Sort(array,left,right);
            return;
        }
        //取基准前先进行三数取中
        three_num_mid(array,left,right);


       int par=partition(array,left,right);
        quick(array,left,par-1);
        quick(array,par+1,right);


    }
    public static void quickSort(int[] array){
       quick(array,0,array.length-1);
    }


    /**
     * 非递归实现快速排序
     * @param array
     */
    public static void quickSort2(int[] array) {
        Stack<Integer> stack = new Stack<>();

        int left = 0;
        int right = array.length-1;

        int par = partition(array,left,right);

        if(par > left+1) {
            stack.push(left);
            stack.push(par-1);
        }
        if(par < right-1) {
            stack.push(par+1);
            stack.push(right);
        }
        while (!stack.empty()) {
            right = stack.pop();
            left = stack.pop();
            par =  partition(array,left,right);

            if(par > left+1) {
                stack.push(left);
                stack.push(par-1);
            }
            if(par < right-1) {
                stack.push(par+1);
                stack.push(right);
            }
        }

    }
    public static void main2(String[] args) {
        int[] array= new int[10_00000];
        Random random =new Random();
        for (int i=0;i<array.length;i++){
             // array[i]=i;
            //array[i]=random.nextInt(10_00000);
        }
        long start= System.currentTimeMillis();
        quickSort(array);
        long end=System.currentTimeMillis();
        System.out.println(end-start);
    }
    public static void main(String[] args) {
       int[] array={1,5,2,4,6,3};
       quickSort2(array);
        System.out.println(Arrays.toString(array));
    }
}
