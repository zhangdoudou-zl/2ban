import org.omg.CORBA.NO_IMPLEMENT;

/**
 * @program: 0423
 * @description: 链表
 * @author: Zhang lin
 * @create: 2020-04-23 17:35
 **/
class Node{
 public int data;
 public Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class MyLinkList {
 public Node head;

 public void addFirst(int data){
     Node node = new Node(data);
     if(head==null){
         this.head = node;
         return;
     }
     node.next = this.head;
     this.head = node;
 }
 //尾插法
 public void addLast(int data){
     Node node =new Node(data);
   Node cur = this.head;
   while (cur.next!=null){
       cur=cur.next;
   }
   cur.next=node;
 }

public int size(){
     Node cur = this.head;
     int count=0;
     while (cur!=null){
         count++;
         cur=cur.next;
     }
     return count;
}
 //任意位置插入,第一个数据节点为0号下标
 public void addIndex(int index,int data){
     if(index==0){
         addFirst(data);
         return;
     }
     if(index==size()){
         addLast(data);
         return;
     }
     Node node =new Node(data);
     Node cur =IndexSearch(index);
     node.next=cur.next;
     cur.next=node;


    }
    private Node IndexSearch(int index) {
        if (index < 0 || index > size()) {
            throw new RuntimeException("index位置不合法");
        }
        Node cur = this.head;
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }


 public void remove(int key){
     if(this.head==null){
         return;
     }
     if(this.head.data==key){
         this.head=this.head.next;
         return;
     }
     Node prev = searchPrev(key);
     if(prev==null){
         System.out.println("没有这个节点");
         return;
     }
     Node del = prev.next;
     prev.next=del.next;

 }
 private Node searchPrev(int key){
     Node prev =this.head;
     while (prev.next!=null){
         if(prev.next.data==key){
             return prev;
         }else {
             prev=prev.next;
         }
     }
     return null;
 }

 public void removeAllKey(int key){
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


    public Node middleNode() {
     Node slow =this.head;
     Node fast =this.head;
     while (fast!=null&&fast.next!=null){
         fast=fast.next;
         fast=fast.next;
         slow=slow.next;
     }
     return slow;
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
