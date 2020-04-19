import java.util.Arrays;

/**
 * @program: 0419
 * @description:顺序表
 * @author: Zhang lin
 * @create: 2020-04-19 15:56
 **/
public class TestDemo {

        public int[] elem;//数组
        public int usedSize;//有效的数据个数
        public static final int intCapacity = 10;//初始容量

        public TestDemo() {
            this.elem = new int[intCapacity];
            this.usedSize = 0;
        }
    // 打印顺序表
    public void display() {
        for (int i = 0; i < this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    private boolean isFull() {
     /*   if(this.usedSize == this.elem.length) {
            return true;
        }
        return false;*/
        return this.usedSize == this.elem.length;
    }
    private void checkPos(int pos) {
        if(pos < 0 || pos > this.usedSize) {
            throw new RuntimeException("pos位置不合法!");
        }
    }
    public void add(int pos, int data) {
        checkPos(pos);

        if(isFull()) {
            this.elem =
                    Arrays.copyOf(this.elem,2*this.elem.length);
        }

        //挪数据了
        for (int i = this.usedSize-1; i >= pos ; i--) {
            this.elem[i+1] = this.elem[i];
        }
        this.elem[pos] = data;
        this.usedSize++;
    }
        public boolean contains(int toFind){
            for(int i=0;i<usedSize-1;i++){
                if(elem[i]==toFind){
                    return true;
                }
            }
            return false;
        }
        public int Search(int toFind){
            for(int i=0;i<usedSize-1;i++) {
                if (elem[i] == toFind) {
                    return i;
                }
            }
            return -1;
        }
    private boolean isEmpty() {
        return this.usedSize == 0;
    }
        //获取pos位置元素
        public int getPos(int pos){
            //1.顺序表是否为空
            //2.pos合法性
               if(isEmpty()) {
                            throw new RuntimeException("顺序表为空！");//手动抛出异常
                           }
                if(pos<0||pos>this.usedSize-1){
                    throw new RuntimeException("pos位置不合法!");
                }
                return this.elem[pos];
        }
        public void remove(int toRemove){

            for (int i=this.Search(toRemove);i<this.usedSize-1;i++){
                this.elem[i]=this.elem[i+1];
            }
            this.usedSize--;
        }
    // 清空顺序表
    public void clear() {
        this.usedSize = 0;
    }


}


