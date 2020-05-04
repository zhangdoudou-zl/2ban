/**
 * @program: 0504
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-04 21:33
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(8);
        myLinkedList.addLast(12);
        myLinkedList.addLast(10);
        myLinkedList.addLast(13);
        myLinkedList.addLast(15);
        myLinkedList.display();
        Node ret=myLinkedList.overturn();
        myLinkedList.display2(ret);
    }


}
