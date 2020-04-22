/**
 * @program: 0422
 * @description: 测试
 * @author: Zhang lin
 * @create: 2020-04-22 20:59
 **/
public class TestDemo {
    public static void main(String[] args) {
        myArrayList myArrayList1 = new myArrayList();
        myArrayList1.add(0,12);
        myArrayList1.add(1,13);
//        for(int i=0;i<10;i++){
//          myArrayList1.add(i,i);
//        }
        myArrayList1.add(0,1001);
        myArrayList1.display();
        System.out.println(myArrayList1.contains(0));
        System.out.println(myArrayList1.getPos(1));
        myArrayList1.remove(4);
        myArrayList1.display();
        System.out.println("clear()");
        myArrayList1.clear();
        myArrayList1.display();
    }
}
