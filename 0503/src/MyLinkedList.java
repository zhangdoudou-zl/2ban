/**
 * @program: 0503
 * @description: 链表练习
 * @author: Zhang lin
 * @create: 2020-05-03 23:16
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
    public void addLast(int data){
        Node node=new Node(data);
        Node cur=this.head;
        if (head==null){
            this.head=node;
            return;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;
    }

    public void RemoveAllKey(int key){
        Node prev = this.head;
        Node cur = prev.next;
        while (cur!=null){
            if(cur.data==key){
                prev.next=cur.next;
                cur=cur.next;
            }else{
                prev=cur;
                cur=cur.next;
            }
        }
        if(this.head.data==key){
            this.head=head.next;
        }
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
