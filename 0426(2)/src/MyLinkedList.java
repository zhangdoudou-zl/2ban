import com.sun.xml.internal.ws.addressing.WsaTubeHelper;

import javax.management.NotificationEmitter;

/**
 * @program: 0426(2)
 * @description: 双向链表
 * @author: Zhang lin
 * @create: 2020-04-26 18:48
 **/
class Node{
    public int data;
    public Node next;
    public Node prev;

    public Node(int data){
        this.data=data;
    }
}
public class MyLinkedList {
    public  Node head; //链表的头
    public  Node tail; //链表的尾
    public void addFirst(int data){
        Node node = new Node(data);
        if(head==null){
            this.head=node;
            this.tail=node;

        }else{
            node.next=head;
            head.prev=node;
            this.head=node;
        }

    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        if(this.head==null){
            this.head=node;
            this.tail=node;
        }else{
            this.tail.next=node;
            node.prev=tail;
            this.tail=node;

        }
    }
    //查找是否包含key
    public boolean contains(int key){
        Node cur=this.head;
        while (cur!=null){
            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }

    public int size(){
        Node cur=this.head;
        int count=0;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    private void checkIndex(int index) {
        if(index < 0 || index > size()) {
            throw new RuntimeException("index不合法");
        }
    }
    public void addIndex(int index,int data){
        checkIndex(index);
        if(index==0){
            addFirst(data);
            return;
        }
        if(index==size()){
            addLast(data);
            return;
        }
        Node node = new Node(data);
        Node cur = searchIndex(index);
        cur.prev.next=node;
        cur.prev=node;
        node.next=cur;
        node.prev=cur.next;
    }
    private Node searchIndex(int index){
        Node cur = this.head;
        while (index!=0){
            cur=cur.next;
            index--;
        }
        return cur;
    }
    public void RemoveAllKey(int key){
        Node cur = this.head;
        while (cur!=null){
            if(cur.data==key){
                int oldData=cur.data;
                if(cur==this.head){
                    this.head=this.head.next;
                    if(this.head!=null){
                        this.head.prev=null;
                    }

                }else {
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{//删除的是尾巴节点，只需要移动tail
                        this.tail=cur.prev;
                    }
                }

            }
            cur=cur.next;
        }

    }
    public int remove(int key){
        Node cur = this.head;
        while (cur!=null){
            if(cur.data==key){
                int oldData=cur.data;
                if(cur==this.head){
                    this.head=this.head.next;
                    this.head.prev=null;
                }else {
                    cur.prev.next=cur.next;
                    if(cur.next!=null){
                        cur.next.prev=cur.prev;
                    }else{//删除的是尾巴节点，只需要移动tail
                        this.tail=cur.prev;
                    }
                }
                  return oldData;
            }
            cur=cur.next;
        }
        return -1;
    }

    public void clear(){
        while (this.head!=null){
            Node cur =  this.head.next;
            this.head.next=null;
            this.head.prev=null;
            head=cur;
        }
   this.tail=null;
    }

    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
        System.out.println();
    }
}
