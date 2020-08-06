import java.util.Arrays;

/**
 * 建立一个大根堆(自己实现PriorityQueue）
 */
public class TestHeap {
    public int[] elem;
    public int usedSize;

    public TestHeap() {
        this.elem=new int[10];
    }
    public void creatHeap(int[] array){
        for (int i=0;i<array.length;i++){
            this.elem[i]=array[i];
            this.usedSize++;
        }
        for (int i=(usedSize-1-1)/2;i>=0;i--){
            adjustDown(i,usedSize);
        }
    }
    public void adjustDown(int root,int len){
        int parent=root;
        int child=parent*2+1;

        while (child<len){
            if (child+1<len && elem[child]<elem[child+1]){
                child=child+1;
            }
            if (elem[child]>elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                parent=child;
                child=parent*2+1;
            }else {
                break;
            }

        }
    }


    public void push(int val){
        if (this.usedSize==this.elem.length){
            this.elem= Arrays.copyOf(this.elem,2*elem.length);
        }
        elem[usedSize]=val;
        usedSize++;
        adjustUp(usedSize-1);
    }

    private void adjustUp(int child) {
        int parent=(child-1)/2;
        while (child>=0){
            if (elem[child]>elem[parent]){
                int tmp=elem[child];
                elem[child]=elem[parent];
                elem[parent]=tmp;
                child=parent;
                parent=(child-1)/2;
            }else {
                break;
            }
        }
    }

    public void pop(){
        int tmp=elem[0];
        elem[0]=elem[usedSize-1];
        elem[usedSize-1]=tmp;
        usedSize--;
        adjustDown(0,usedSize);
    }

    public void HeapSort(){
        int end=usedSize-1;
        while (end>0){
            int tmp=elem[0];
            elem[0]=elem[end];
            elem[end]=tmp;
            adjustDown(0,end);
            end--;
        }

    }

    public void show(){
        for (int i=0;i<usedSize;i++){
            System.out.print(elem[i]+" ");
        }
        System.out.println();
    }
}
