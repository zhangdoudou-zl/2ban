public class TestDemo {
    public static void main(String[] args) {
        TestHeap testHeap=new TestHeap();
        int[] array={27,15,29,18,28,34,65,49,25,37};
        testHeap.creatHeap(array);
        testHeap.show();
        testHeap.push(80);
        testHeap.show();
//        testHeap.pop();
//        testHeap.show();
//        testHeap.HeapSort();
//        testHeap.show();
    }
}
