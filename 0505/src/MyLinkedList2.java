/**
 * @program: 0505
 * @description: 链表练习
 * @author: Zhang lin
 * @create: 2020-05-05 23:17
 **/

public class MyLinkedList2 {
    public Node head;
    //判断链表是否有环
    public boolean haveCycle() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }return false;
    }
    //返回链表开始入环的第一个节点
    public Node FirstCycleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
             return slow;
            }
        }
        fast=this.head;
        while (fast!=slow){
            fast=fast.next;
            slow=slow.next;
        }
        return slow;
    }
}
