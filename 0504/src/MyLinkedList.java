/**
 * @program: 0504
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-04 21:32
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MyLinkedList {
    public Node head;

    public void addLast(int data) {
        Node node = new Node(data);
        Node cur = this.head;
        if (head == null) {
            this.head = node;
            return;
        }
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = node;
    }
    //反转一个链表
    public Node overturn(){
        Node prev = null; //定义需要反转的节点的前驱
        Node cur = this.head;//需要反转的结点
        Node newHead=null;//反转完成后链表的头
        while (cur!=null){
            Node curNext= cur.next;
            if(curNext==null){
                newHead=cur;
            }
            cur.next=prev;
            prev=cur;
            cur=curNext;
        }
        return newHead;
    }

    //返回链表的中间结点
    public Node ReturnMid(){
     Node fast=this.head;
     Node slow=this.head;
     while (fast!=null&&fast.next!=null){
         fast=fast.next.next;
         slow=slow.next;
     }
     return slow;
    }
    
    public void display2(Node newHead){
        Node cur =newHead;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }

    public void display(){
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}