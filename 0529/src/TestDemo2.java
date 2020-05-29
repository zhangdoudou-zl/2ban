import java.util.ArrayList;

/**
 * @program: 0529
 * @description: 写一个通用的方法 打印集合中所有元素
 * @author: Zhang lin
 * @create: 2020-05-29 15:16
 **/
class GenericList{
    public static  <T> void  printList(ArrayList<T> list){
        for (T val: list){
            System.out.print(val+" ");
        }
        System.out.println();
    }

    /**
     * 通配符：也是一种泛型
     * 通配符一般用于读取 add（？）
     *  泛型一般用于写入  add（T）
     *
     *  通配符既有上界 又有下界
     */

    public static  <T> void  printList2(ArrayList<?> list){
        for (Object val: list){
            System.out.print(val+" ");
        }
        System.out.println();
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        ArrayList<String> list1=new ArrayList<>();
        list1.add("doudou");
        GenericList.printList2(list);
        GenericList.printList2(list1);
    }

}
