import com.sun.jmx.snmp.SnmpOidDatabase;

import javax.swing.*;
import java.security.PublicKey;

/**
 * @program: 0420
 * @description: 链表
 * @author: Zhang lin
 * @create: 2020-04-20 22:48
 **/
class Node{
    public int data;
    public Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class MyLinkList {
    public Node head;
    //头插法
    public void addFirst(int data) {
       Node node = new Node(data);
       if (head==null){
           this.head=node;
           return;
       }
       node.next=this.head;
       this.head=node;
    }
    //尾插法
    public void addLast(int data){
        Node node = new Node(data);
        Node cur =this.head;
        if (head==null){
            this.head=node;
            return;
        }
        while (cur.next!=null){
            cur=cur.next;
        }
        cur.next=node;

    }
    //判断某数是否在链表中
    public boolean contains(int key){
        Node cur=this.head;
        while(cur!=null){

            if(cur.data==key){
                return true;
            }
            cur=cur.next;
        }
        return false;
    }
    //得到单链表的长度
    public int size(){
        int count=0;
        Node cur=this.head;
        while (cur!=null){
            cur=cur.next;
            count++;
        }
        return count;
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        Node node=new Node(data);
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == this.size()) {
            addLast(data);
            return;
        }
        //先找到  index位置的前一个节点的地址
        Node cur = searchIndex(index);
        node.next = cur.next;
        cur.next=node;
        //进行插入


    }

    private Node searchIndex(int index) {

        //1、对index进行合法性检查
        if (index < 0 || index > this.size()) {
            throw new RuntimeException("index位置不合法！");
        }
        Node cur = this.head;//index-1
        while (index - 1 != 0) {
            cur = cur.next;
            index--;
        }
        return cur;
    }
    //打印链表
    public void display(){
        Node cur=this.head;
        while (cur!=null){
            System.out.print(cur.data+" ");
            cur=cur.next;
        }
    }
}
