/**
 * @program: 0423
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-23 17:35
 **/
public class TestDemo {
    public static void main(String[] args) {

        MyLinkList myLinkList =new MyLinkList();
        myLinkList.addFirst(2);
        myLinkList.addFirst(3);
        myLinkList.addFirst(4);
        myLinkList.addFirst(3);
        myLinkList.addLast(6);
        myLinkList.addIndex(0,23);
        myLinkList.display();
        myLinkList.remove(23);
        myLinkList.display();
        myLinkList.removeAllKey(3);
        myLinkList.display();

    }
}
