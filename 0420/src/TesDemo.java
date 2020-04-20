/**
 * @program: 0420
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-20 22:48
 **/
public class TesDemo {
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.addFirst(11);
        myLinkList.addFirst(12);
        myLinkList.addFirst(13);
        //myLinkList.display();
        myLinkList.addLast(14);
       // myLinkList.display();
       // System.out.println(myLinkList.contains(15));
        myLinkList.addIndex(4,20);
        myLinkList.display();

    }
}
