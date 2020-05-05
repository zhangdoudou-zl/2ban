/**
 * @program: 0505
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-05 14:44
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(4);
        myLinkedList.addFirst(3);
        myLinkedList.addLast(5);
        myLinkedList.addLast(6);
        myLinkedList.addLast(6);
//        int ret= myLinkedList.size();
//        System.out.println(ret);
        myLinkedList.addIndex(0,9);
//       boolean flag=  myLinkedList.contains(10);
//        System.out.println(flag);
//       myLinkedList.remove(6);
        myLinkedList.removeAllKey(6);
        myLinkedList.display();
        myLinkedList.clear();;
        myLinkedList.display();
    }


}
