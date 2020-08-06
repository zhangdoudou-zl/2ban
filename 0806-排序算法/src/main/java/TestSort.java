import java.util.Arrays;

public class TestSort {
    //直接插入排序
    public static void insertSort(int[] array){
        for (int i=1;i<array.length;i++){
            int tmp=array[i];
            int j=i-1;
            while (j>=0){
                if (tmp<array[j]){
                    array[j+1]=array[j];
                    j--;
                }else {
                    array[j+1]=tmp;
                    break;
                }
            }
            array[j+1]=tmp;
        }
    }


    public static void shellSort(int[] array){
        int[] drr={5,3,1};
        for (int i=0;i<drr.length;i++){
            shell(array,drr[i]);
        }

    }

    //希尔排序
    private static void shell(int[] array, int gap) {
        for (int i=gap;i<array.length;i++){
            int j;
            int tmp=array[i];
            for (j=i-gap;j>=0;j-=gap){
                if (tmp<array[j]){
                    array[j+gap]=array[j];
                }else {
                    break;
                }
            }
            array[j+gap]=tmp;
        }
    }

    //选择排序（和冒泡很像）
    public static void selectSort(int[] array){
        for (int i=0;i<array.length;i++){
            int j=i+1;
           while (j<array.length){
                if (array[j]<array[i]){
                    int tmp=array[i];
                    array[i]=array[j];
                    array[j]=tmp;
                }
                j++;
            }
        }
    }

    //堆排序
    public static void heapSort(int[] array){
        craetHeap(array);
        for (int end=array.length-1;end>0;end--){
            int tmp=array[0];
            array[0]=array[end];
            array[end]=tmp;
            adjustDown(array,0,end);
        }
    }
    public static void craetHeap(int[] array){
        for(int i=(array.length-1-1)/2;i>=0;i--){
            adjustDown(array,i,array.length);
        }
    }

    private static void adjustDown(int[] array, int i, int length) {
        int parent=i;
        int child=parent*2+1;
        while (child<length){
            if (child+1<length && array[child]<array[child+1]){
                child=child+1;
            }
            if (array[parent]<array[child]){
                int tmp=array[parent];
                array[parent]=array[child];
                array[child]=tmp;
                parent=child;
                child=parent*2+1;
            }else {
                break;
            }
        }
    }


    //冒泡排序
    public static void bubbleSort(int[] array){
        //i表示趟数
        boolean flg=false;
        for (int i =0;i<array.length;i++){
            for (int j=0;j<array.length-1-i;j++){
                if (array[j+1]<array[j]){
                    int tmp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=tmp;
                    flg=true;
                }
            }
            if (flg==false){
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] array={2,4,22,45,32,12,67};
        heapSort(array);
        System.out.println(Arrays.toString(array));
    }
}
