/**
 * @program: 0509
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-09 09:27
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList myLinkedList=new MyLinkedList();
        myLinkedList.addList(2);
        myLinkedList.addList(2);
        myLinkedList.addList(3);
        myLinkedList.addList(2);
        myLinkedList.RemoveAllKey(2);
        myLinkedList.display();
    }
}
