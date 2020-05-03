/**
 * @program: 0503
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-03 23:17
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(0);
        myLinkedList.addLast(12);
        myLinkedList.addLast(8);
        myLinkedList.addLast(12);
        myLinkedList.addLast(12);
        myLinkedList.RemoveAllKey(12);

        myLinkedList.display();
    }
}
