import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
import java.util.jar.JarOutputStream;

/**
 * @program: 0513
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-13 18:53
 **/
public class MyStack {
    public int[] elem;//数组
    public int top;//表示当前可以存放数据元素的下标

    public MyStack() {
        this.elem = new int[10];
    }

    public void push(int data) {
     if (full()){
         this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
  }
     this.elem[top++]=data;
    }

    private boolean full() {
        return this.top==this.elem.length;
    }
    public boolean empty() {
     return top==0;
    }

    public int pop() {
        if (empty()){
           throw new RuntimeException("栈为空");
        }
        int data = this.elem[this.top-1];
        this.top--;
        return data;
    }

    public int peek() { //查看栈顶元素
        if (empty()){
            throw new RuntimeException("栈为空");
        }
        return this.elem[this.top-1];
    }

    public int size() {
       return elem.length;
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.peek();
        System.out.println(myStack.peek());
        System.out.println(myStack.pop());
        System.out.println(myStack.peek());


    }
}
