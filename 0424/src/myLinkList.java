/**
 * @program: 0424
 * @description: 链表
 * @author: Zhang lin
 * @create: 2020-04-24 14:18
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class myLinkList {
  public Node head;
  //头插法
public void addFirst(int data){
    Node node = new Node(data);
    if(this.head==null){
        this.head=node;
        return;
    }node.next=head;
    this.head=node;
}
//尾插法
public void addLast(int data){
    Node node = new Node(data);
    Node cur = this.head;
    while (cur.next!=null){
        cur=cur.next;
    }
    cur.next = node;

}
public int size(){
    int count =0 ;
    Node cur=this.head;
    while (cur!=null){
        cur=cur.next;
        count++;
    }
    return count;
}
public void index(int index,int data){
    if(index==0){
        addFirst(data);
        return;
    }
    if(index==size()){
        addLast(data);
        return;
    }
    Node node=new Node(data);
    Node cur = this.head;
    while (index-1!=0){
        cur=cur.next;
        index--;
    }
    node.next=cur.next;
    cur.next=node;
}
public void remove(int key){
    Node prev = SearchPrev(key);

    if(this.head==null){
        return;
    }
    if(this.head.data==key){
        this.head=this.head.next;
        return;
    }

    Node del = prev.next;
    prev.next=del.next;

}
private Node SearchPrev(int key){
    Node prev = this.head;
    while (prev.next!=null) {
        if (prev.next.data == key) {
            return prev;
        }
        else {
            prev=prev.next;
        }
    }
    return null;
}
public void RemoveAllKey(int key){
    Node prev = this.head;
    Node cur = prev.next;
    while (cur!=null){
        if(cur.data==key){
            prev.next=cur.next;
            cur=cur.next;
        }else {
            prev=cur;
            cur=cur.next;
        }
    }
    if(this.head.data==key){
        this.head=this.head.next;
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
public void clear(){
    this.head=null;
}

public Node reverseList(){
    Node cur=this.head;
    Node prev= null;
    Node newHead=null;
    while (cur!=null){
        Node curNext= cur.next;
        if(curNext==null){
            newHead = cur;
        }
        cur.next=prev;
        prev=cur;
        cur=curNext;
    }
    return newHead;
}

public void display2(Node newHead){
    Node cur = newHead;
    while (cur!=null){
        System.out.print(cur.data+" ");
        cur=cur.next;
    }
    System.out.println();
}
//输入一个链表，输出该链表中倒数第k个结点
public Node FindKthToTail(int k){

    Node fast =this.head;
    Node slow =this.head;
    while (k-1>=0){
        if(fast.next!=null) {
            fast = fast.next;
            k--;
        }else {
            System.out.println("没有这个节点");
            return null;
        }
    }
    while (fast.next!=null){
        fast=fast.next;
        slow=slow.next;
    }
    return slow;
}

}
