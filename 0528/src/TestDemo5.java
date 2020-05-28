/**
 * @program: 0528
 * @description: 实例内部类
 * @author: Zhang lin
 * @create: 2020-05-28 14:36
 **/

class OuterClass {
    public int data1=1;
    public static int data2=2;

    //实例内部类：-》看作是一个普通的实例数据成员

    /**
     * 1、如何拿到实例内部类的对象？
     *
     */
    class InnerClass {
        public int data1=11;

        public int data3=3;

        public static final int a = 99;//编译

        public void func() {
            System.out.println(this.data1);

            System.out.println(OuterClass.this.data1);

            System.out.println(data2);
            System.out.println(data3);
            System.out.println("innerclass func");
        }
    }

}
public class TestDemo5 {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();

        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.func();
    }
}

