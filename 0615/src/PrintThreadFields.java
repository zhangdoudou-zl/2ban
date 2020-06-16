/**
 * @program: 0615
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-15 18:53
 **/

public class PrintThreadFields {
    static class SubThread extends Thread{
        public void run(){
         printFields();
        }
    }
    public static void main(String[] args) {
        Thread thread=new SubThread();
        thread.start();

        printFields();
    }

    private static void printFields() {
        Thread t=Thread.currentThread();
        long id=t.getId();
        System.out.println("线程的名字"+id+":"+t.getName());
    }
}
