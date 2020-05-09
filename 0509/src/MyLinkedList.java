/**
 * @program: 0509
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-09 09:26
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
    //尾插法
    public void addList(int data){
        Node node = new Node(data);
        Node cur= this.head;
        if(this.head==null){
            this.head=node;
             return;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next = node;
    }
    //判断链表的回文结构

    public boolean chkPalindrome(Node head) {
        if(head==null){
            return false;
        }
        //只有头，必然是回文结构
        if(head.next==null){
            return true;
        }
        Node fast = head;
        Node slow = head;
        //找到中间结点
        while(fast!=null&&fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        Node cur = slow.next;
         //反转后半部分链表
        while(cur!=null){
            Node curNext = cur.next;
            cur.next=slow;
            slow=cur;
            cur=curNext;
        }
        //一个从头走一个从尾巴走，判断是否相等
        while(slow!=head){
            if(slow.data!=head.data){
                return false;
            }
            //判断链表节点数为偶数的情况
            if(head.next==slow){
                return true;
            }
            slow = slow.next;
            head=head.next;
        }
        return true;
    }
    //删除链表中的key
    public  void remove(int key) {
        Node prev = this.head;
        Node del = prev.next;
        if (head==null){
            return;
        }
        while (prev.next != null) {
            if (del.data == key) {
                prev.next = del.next;
                return;
            }
            prev = del;
            del = del.next;
        }
        if (head.data==key){
            this.head=head.next;
        }
    }


    //删除链表中所有重复的结点
    public void RemoveAllKey(int key){
        Node prev = this.head;
        Node del = prev.next;
        while (prev.next!=null){
            if (del.data==key){
                prev.next=del.next;
                del=del.next;
            }else{
                prev=del;
                del=del.next;
            }
        }
        if (this.head.data==key){
            this.head=this.head.next;
        }
    }
    //链表分割
    public Node func1(int k){
        Node bs=null;
            Node be=null;
            Node as=null;
            Node ae=null;
            Node cur = head;
            while (cur!=null){
                if (cur.data<k){
                    //第一次插入
                    if (bs==null){
                        bs=cur;
                        be=cur;
                        //不是第一次插入
                    }else{
                        be.next=cur;
                        be=be.next;
                    }
                }else {
                    //第一次插入
                    if (as==null){
                        as=cur;
                        ae=cur;
                    }else {
                        ae.next=cur;
                        ae=ae.next;
                    }
                }
        }
        //1.判断bs是否为空
        if (bs==null){
            return as;
        }

        //2.如果bs不为空，拼接
        be.next=as;
        //3.如果ae不为空。ae的next为空
        if (ae.next!=null){
            ae.next=null;
        }
        return bs;

    }
    //在一个排序的链表中，存在重复的结点，请删除该链表中重复的结点，重复的结点不保留，返回链表头指针

    public Node func2(){
        Node cur = this.head;
        Node newHead = new Node(-1);
        Node tmp = newHead;
        if(cur.next!=null&&cur.data==cur.next.data){
            //while (cur.next!=null&&cur.data==cur.next.data){
                cur=cur.next;
           // }
          // cur=cur.next;
        }else {
            tmp.next=cur.next;
            tmp=cur;
            cur=cur.next;
        }
        tmp.next=null;
        return newHead.next;
    }
    //将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的
    public Node func3(Node headA,Node headB){
        Node newHead = new Node(-1);
        Node tmp =newHead;
        while (headA!=null&&headB!=null){
            if (headA.data<headB.data) {
                tmp.next = headA;
                tmp = tmp.next;
                headA = headA.next;
            }else {
                tmp.next = headB;
                tmp = tmp.next;
                headB = headB.next;
            }
        }
        if (headA==null){
            tmp.next=headB;
        }else {
            tmp.next=headA;
        }
  return newHead.next;


    }

    //打印链表
    public void display(){
        Node cur = this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
