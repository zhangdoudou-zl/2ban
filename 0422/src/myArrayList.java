import java.util.Arrays;

/**
 * @program: 0422
 * @description: 顺序表
 * @author: Zhang lin
 * @create: 2020-04-22 20:56
 **/
public class myArrayList {
    public int[] elem;
    public int usedSize;
    public final static int capacity=10;

    public myArrayList(){
        this.elem = new int[10];
        this.usedSize = 0;
    }

    private boolean isFull(){
        return this.elem.length==this.usedSize;
    }
    public void add(int pos,int data){
        if(isFull()){
            this.elem=
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }
       //判断pos合法性
        if(pos<0||pos>usedSize){
            System.out.println("不合法");
            return;
        }
        for (int i=usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    public boolean contains(int toFind) {
        for(int i=0;i<this.usedSize;i++){
            if (elem[i]==toFind){
                return true;
            }
        }return false;

    }

    public int search(int toFind) {
        for(int i=0;i<this.usedSize;i++) {
            if (elem[i] == toFind) {
                return i;
            }
        }
        return -1;
    }
    private boolean isEmpty(){
        return (this.usedSize==0);
    }
    private void checkPos(int pos){
        if(pos<0||pos>this.usedSize)
            throw  new RuntimeException("pos位置异常");
    }
    public int getPos(int pos){

        if(isEmpty()){
           throw  new RuntimeException("顺序表为空");
        }
        checkPos(pos);
//        if(pos<0||pos>usedSize){
//         return -1;
//        }
        return elem[pos];
    }
    public int size(){
        return this.usedSize;
    }
    public void remove(int toRemove){
        int index=search(toRemove);
        if(index==-1){
            System.out.println("没有需要删除的数字");
        }
        for (int i=index;i<usedSize-1;i++){
            elem[i]=elem[i+1];
        }
        usedSize--;
    }
    public void clear(){
        this.usedSize=0;
    }
    public void display(){
       for (int i=0;i<usedSize;i++){
           System.out.print(elem[i]+" ");
       }
        System.out.println();
    }

}

