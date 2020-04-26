/**
 * @program: 0426
 * @description: 链表练习
 * @author: Zhang lin
 * @create: 2020-04-26 15:30
 **/
class  Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }


}
public class MyLinkList {
    public Node head;

    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            this.head=node;
            return;
        }
        node.next=this.head;
        this.head=node;

    }
    //判断链表是否有环
    public boolean hasCycle(){
        Node fast =this.head;
        Node slow =this.head;
        while (fast!=null&&fast.next!=null){
            //fast一次走两步slow一次走一步
            fast=fast.next.next;
            slow=slow.next;
            //若相遇则链表有环
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

    public boolean hasCycle2(){
        Node fast =this.head;
        Node slow =this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow) {
                break;
            }
        }

        if(fast==null||fast.next==null){
            return false;
        }
        return true;
    }
    //找到链表开始入环的第一个节点
    public Node Cycle(){
        Node fast =this.head;
        Node slow =this.head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        if(fast==null||fast.next==null){
            return null;
        }
        slow=this.head;
        while(fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
    public void display2(Node newHead){
        Node cur = newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
