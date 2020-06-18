/**
 * @program: 0616
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-16 19:46
 **/
/**
 * 启动两个线程，同时操作一个变量 v = 0
 * 一个线程对该变量执行 N 次 v++
 * 另一个线程对该变量执行 N 次 v--
 * 问，当两个线程都执行结束时，v 的值是多少？
 */
public class ThreadUnsafeDemo {
    private static final int N = 100_0000;
    private static int v = 0;

    static class Add extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v++;
            }
        }
    }

    static class Sub extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < N; i++) {
                v--;
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Add a = new Add();
        Sub s = new Sub();
        a.start();
        s.start();

        a.join();
        s.join();
        // 这里时，a 和 s 都结束了
        System.out.println(v);
    }
}

