/**
 * @program: 0429
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-29 22:47
 **/
public class TsetDemo {
    //输入两个链表，找出它们的第一个公共结点
    public Node func2(Node headA,Node headB){
        int lenA=0;
        int lenB=0;
        Node pl=headA;
        Node ps=headB;
        while (pl!=null){
            lenA++;
            pl=pl.next;
        }
        while (ps!=null){
            lenB++;
            ps=ps.next;
        }
        pl=headA;
        ps=headB;
        int len=lenA-lenB;
        if(len<0){
            pl=headB;
            ps=headA;
            len=lenB-lenA;
        }
        while (len>0){
            pl=pl.next;
            len--;
        }
        //此时pl和ps在同一起跑线
        while (ps!=pl&&pl!=null&&ps!=null){
            pl=pl.next;
            ps=ps.next;
        }
        if(pl==ps&&pl!=null){
          return pl;
        }
        return null;

    }

}
