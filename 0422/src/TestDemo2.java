import java.util.Arrays;

/**
 * @program: 0422
 * @description: 数组练习
 * @author: Zhang lin
 * @create: 2020-04-22 20:59
 **/
public class TestDemo2 {
    public static void main(String[] args) {
        int[] num1={1,2,3,4,5,6,7};
        int[] num2={11,22,33,44,55,66,77};
        swap1(num1,num2);
        System.out.println(Arrays.toString(num1));
        System.out.println(Arrays.toString(num2));
    }
    public static void swap1(int[] num1,int[] num2){
        for(int i= 0; i<num1.length;i++){
            int tmp=num1[i];
            num1[i]=num2[i];
            num2[i]=tmp;
        }
    }


    public static void main1(String[] args) {
        int[] array={1,2,3,4,5,6,7,8};
        swap(array);
        System.out.println(Arrays.toString(array));
    }
    public static void swap(int[] array){
        int left = 0;
        int right =array.length-1;
        while (left<right) {
            while (left < right && array[left] % 2 == 0) {
                left++;
            }
            while (left < right && array[right] % 2 != 0) {
                right--;
            }
            int tmp =array[left];
            array[left] = array[right];
            array[right]=tmp;
        }

    }


}
