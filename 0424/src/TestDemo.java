/**
 * @program: 0424
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-24 14:28
 **/
public class TestDemo {
    public static void main(String[] args) {
        myLinkList myLinkList = new myLinkList();
        myLinkList.addFirst(3);
        myLinkList.addFirst(2);
        myLinkList.addFirst(4);
        myLinkList.addLast(5);
        myLinkList.addLast(3);
        myLinkList.addLast(7);
        myLinkList.index(2,5);
        myLinkList.display();
        //myLinkList.RemoveAllKey(3);
        //myLinkList.display();
        //System.out.println("clear()");
        //myLinkList.clear();
        //myLinkList.display();
        //myLinkList.remove(3);
        //myLinkList.display();
        //Node ret= myLinkList.reverseList();
        //myLinkList.display2(ret);
        System.out.println(myLinkList.FindKthToTail(6).data);

    }
}
