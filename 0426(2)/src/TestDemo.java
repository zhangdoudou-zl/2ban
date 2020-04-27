/**
 * @program: 0426(2)
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-26 18:57
 **/
public class TestDemo {
    public static void main(String[] args) {
        MyLinkedList  myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        myLinkedList.addLast(2);
        //myLinkedList.display();
        myLinkedList.addIndex(4,2);
        myLinkedList.display();
        //myLinkedList.remove(4);
        //myLinkedList.RemoveAllKey(2);
        myLinkedList.clear();
        myLinkedList.display();


    }
}
