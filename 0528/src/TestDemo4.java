/**
 * @program: 0528
 * @description: 匿名内部类
 * @author: Zhang lin
 * @create: 2020-05-28 14:35
 **/

    class Animal {
        public void func(){
            System.out.println("Animal::func()");
        }
    }
    public class TestDemo4 {
        public static void main(String[] args) {
            new Animal(){
                @Override
                public void func() {
                    System.out.println("我重写了这个方法！");
                }
            }.func();
        }
    }


