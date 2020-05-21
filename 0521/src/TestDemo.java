/**
 * @program: 0521
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-21 19:36
 **/
public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap= new TestHeap();
        int[] array={14,24,36,6,8,54,34,29};
        testHeap.createHeap(array);
        testHeap.show();

        testHeap.push(9);
        testHeap.show();

        testHeap.pop();
        testHeap.show();

        testHeap.heapSort();
        testHeap.show();
    }
}
