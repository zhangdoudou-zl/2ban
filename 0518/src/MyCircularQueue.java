/**
 * @program: 0518
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-18 10:16
 **/
public class MyCircularQueue {
    public int[] elem;
    public int usedSize;
    public int front;
    public int rear;



    /** Initialize your data structure here. Set the size of the queue to be k. */
    public MyCircularQueue(int k) {
        this.elem=new int[k];
    }

    /** Insert an element into the circular queue. Return true if the operation is successful. */
    public boolean enQueue(int value) {
             if (isFull()){
                 return false;
             }
             this.elem[rear]=value;
             rear=(rear+1)%this.elem.length;
             return true;
    }

    /** Delete an element from the circular queue. Return true if the operation is successful. */
    public boolean deQueue() {
     if (isEmpty()){
         return false;
     }
     front=(front+1)%elem.length;
     return true;
    }

    /** Get the front item from the queue. */
    public int Front() {
        if (isEmpty()){
            return -1;
        }
        return elem[front];
    }

    /** Get the last item from the queue. */
    public int Rear() {
        if (isEmpty()){
            return -1;
        }
        int index=rear==0?elem.length-1:rear-1;
        return elem[index];
    }

    /** Checks whether the circular queue is empty or not. */
    public boolean isEmpty() {
        return rear==front;
    }

    /** Checks whether the circular queue is full or not. */
    public boolean isFull() {
        return (this.rear+1)%this.elem.length==this.front;
    }
}
