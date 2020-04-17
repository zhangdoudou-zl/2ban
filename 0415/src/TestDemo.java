import java.util.Arrays;

/**
 * @program: 0415
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-15 18:44
 **/
public class TestDemo {
    public static void main(String[] args) {
        int[]array=new int[100];
        func2(array);
    }
    public static void func2(int[] array){
        for(int i=0;i<array.length;i++){
            array[i]=i+1;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main7(String[] args) {
        int[] array={1,2,3,4,5};
        printArray(array);
    }
    public static void printArray(int[] array){
        String ret="[";

        for(int i=0;i<array.length;i++){
            ret=ret+array[i];
            if(i<array.length-1){
                ret=ret+",";
            }
        }
           ret=ret+"]";
        System.out.println(ret);
    }




    public static void main6(String[] args) {
        int[] array={1,2,3};
        func1(array);
    }
    public static void func1(int[] array){
        for (int i=0;i<array.length;i++){
            array[i]=2*array[i];
            System.out.print(array[i]);
        }
    }

    public static void main5(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(sum(array));
    }
    public static int sum(int[] array){
        int ret=0;
        for (int i=0;i<array.length;i++){
            ret=ret+array[i];
        }
        return ret;
    }


    public static void main4(String[] args) {
        int[] array={1,2,3,4,5,6};
        System.out.println(avg(array));
    }
public static double avg(int[] array){
        int ret=0;
        for (int i=0;i<array.length;i++){
             ret=ret+array[i];
        }
        return (double)ret/(double)(array.length);
}

    public static void main3(String[] args) {
        int[] array={1,2,3,8,5,6,7};
        System.out.println(func(array));
    }
    public static boolean func(int[] array) {
      for(int i=0;i<array.length-1;i++){
          if(array[i]>array[i+1]){
              return false;
          }
      }
      return true;
    }



    public static void main2(String[] args) {
        int[] array={1,3,4,6,8,10};
        System.out.println(binarySearch(array,1));
    }
     public static int binarySearch(int[] array,int n) {
       int left=0;
       int right=array.length-1;

       while(left<right){
           int mid=(left+right)/2;
           if(array[mid]<n){
               left=mid+1;
           }else if(array[mid]>n){
               right=mid-1;
           }else{
               return mid;
           }
       }
       return -1;
     }


    public static void main1(String[] args) {
        int[] array={-1,0,1,2,3,4,5,6,7};
        System.out.println(max(array));
    }
    public static int max(int[] array) {
        int max=0;
        for(int i=0;i<array.length;i++){
            if(max<array[i]){
                max=array[i];
            }
        }
        return max;
    }


}
