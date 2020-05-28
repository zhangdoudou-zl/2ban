/**
 * @program: 0528
 * @description: 静态内部类
 * @author: Zhang lin
 * @create: 2020-05-28 22:22
 **/
class OutClass{
    public int data1=1;
     static public int data2=2;
    private int data3=3;

   static class InnerClass{
       /**
        * 静态
        *
        */
        public int data4=4;

         public OutClass out;
         public InnerClass(OutClass out){
             this.out=out;
         }

        public void func(){
            System.out.println(this.out.data1);
            System.out.println(this.out.data2);
            System.out.println(this.out.data3);
            System.out.println(data4);
        }
    }
}
public class TestDemo6 {
    public static void main(String[] args) {
        OutClass out=new OutClass();
        OutClass.InnerClass innerClass=new OutClass.InnerClass(out);
        innerClass.func();
    }
}
