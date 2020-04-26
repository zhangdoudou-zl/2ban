/**
 * @program: 0426
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-26 15:38
 **/
public class TestDemo {
    //将两个有序链表合并为一个新的有序链表并返回
    public static Node mergeTowList(Node headA,Node headB){
        Node newHead =new Node(-1);
        Node tmp= newHead;
        while (headA!=null&&headB!=null) {
            if (headA.data < headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            } else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if(headA!=null){
            tmp.next=headA;
        }
        if(headB!=null){
            tmp.next=headB;
        }
        return newHead.next;
    }
    //找到两个链表的第一个公共结点
    public static Node getIntersectionNode(Node headA,Node headB){
         Node pL=headA;
         Node pS=headB;
         int lenA=0;
         int lenB=0;
         while (pL!=null){
             lenA++;
             pL=pL.next;
         }
         while (pS!=null){
             lenB++;
             pS=pS.next;
         }
         pL=headA;
         pS=headB;
         int len =lenA-lenB;
         if(len<0){
             pL=headB;
             pS=headA;
             len=lenB-lenA;
         }
         //走到此步，pl指向的一定是较长的链表
        for(int i=0;i<len;i++){
            pL=pL.next;
        }
        while (pL!=pS&&pL!=null&&pS!=null){
            pL=pL.next;
            pS=pS.next;
        }
        if(pL==pS&&pL!=null){
            return pL;
        }
        return null;
    }
    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();

        myLinkList.addFirst(5);
        myLinkList.addFirst(4);
        myLinkList.addFirst(3);
        myLinkList.addFirst(2);
        myLinkList.addFirst(1);

        MyLinkList myLinkList1 = new MyLinkList();
        myLinkList1.addFirst(55);
        myLinkList1.addFirst(44);
        myLinkList1.addFirst(33);
        myLinkList1.addFirst(22);
        myLinkList1.addFirst(11);

       //Node ret=  getIntersectionNode(myLinkList.head,myLinkList1.head);
       Node ret= mergeTowList(myLinkList.head,myLinkList1.head);
        myLinkList1.display2(ret);

    }
}
