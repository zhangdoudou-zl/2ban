/**
 * @program: 0429
 * @description: 链表练习
 * @author: Zhang lin
 * @create: 2020-04-29 22:46
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){ //构造方法
        this.data=data;
        this.next=null;
    }

}
public class MyLinkedList {
    public  Node head;
    //给定一个链表，判断是否有环
    public boolean func(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
            if(fast==slow){
                return true;
            }
        }return false;
    }
    //返回链表开始入环的第一个结点
    public Node func1(){
        Node fast=this.head;
        Node slow=this.head;
        while (fast!=null&&fast.next!=null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                break;
            }
        }
        fast=head;
            if(fast==null&&fast.next==null){
                return null;
            }
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return fast;
    }

}
