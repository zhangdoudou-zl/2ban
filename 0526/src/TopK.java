import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
/**
 * @program: 0526
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-26 19:04
 **/



class MyComparator implements Comparator<Integer> {

    @Override
    public int compare(Integer o1, Integer o2) {
        return o2-o1;
    }
}


public class TopK {
    public static Integer[] topK(int[] array,int k) {

        MyComparator myComparator = new MyComparator();
        //PriorityQueue<Integer> maxHeap = new PriorityQueue<>(myComparator);
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return  o2-o1;
            }
        });

        for (int i = 0; i < array.length; i++) {
            if(maxHeap.size() < k) {
                maxHeap.offer(array[i]);
            }else {
                Integer val = maxHeap.peek();
                if(val != null && val > array[i]) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        Integer[] ret = new Integer[k];
        for (int i = 0; i < k; i++) {
            int v = maxHeap.poll();
            ret[i] = v;
        }
        return ret;
    }
    public static void main(String[] args) {
        int[] array = {13,1,7,8,18,20,15};
        Integer[] ret = topK(array,4);
        System.out.println(Arrays.toString(ret));
    }
}

