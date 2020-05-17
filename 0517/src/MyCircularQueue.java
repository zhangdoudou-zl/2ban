import com.sun.media.sound.RIFFInvalidDataException;

/**
 * @program: 0517
 * @description: 循环队列
 * @author: Zhang lin
 * @create: 2020-05-17 22:40
 **/
public class MyCircularQueue {
    public int[] elem;
    public int usedSize;
    public int front;
    public int rear;


    public MyCircularQueue(int k){
        this.elem=new int[k];
    }
    //入队
    public boolean enQueue(int value){
        if (isFull()){
            return false;
        }
        this.elem[this.rear]=value;
        this.rear=(this.rear+1)%this.elem.length;
        return true;

    }

    //出队
    public boolean deQueue(){
        if (isEmpty()){
            return false;
        }
        this.front=(this.front+1)%this.elem.length;
        return true;
    }

    //返回队头元素
    public int Front(){
        if (isEmpty()){
            return -1;
        }
        return this.elem[this.front];
    }

    //返回队尾元素
    public int Rear(){
        if (isEmpty()){
            return -1;
        }
        int index =this.rear==0?this.elem.length-1:this.rear-1;
        return this.elem[index];

    }
    public boolean isEmpty(){
        return this.rear==this.front;
    }

    public boolean isFull(){
        return (rear+1)%this.elem.length==this.front;
    }
}
