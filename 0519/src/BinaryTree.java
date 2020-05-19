import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.jar.JarOutputStream;

/**
 * @program: 0519
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-19 13:57
 **/
class Node {
    public char val;
    public Node left;//左孩子-》左子树
    public Node right;//右孩子-》右子树
    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }


    // 层序遍历
    void levelOrderTraversal(Node root){
        Queue<Node> queue = new LinkedList<>();
        if (root==null)return;
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur = queue.poll();
            if (cur!=null){
                System.out.print(cur.val+" ");
                if (cur.left!=null){
                    queue.offer(cur.left);
                }
                if (cur.right!=null){
                    queue.offer(cur.right);
                }
            }
        }
        System.out.println();
    }


    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ret = new LinkedList<>();
        if(root == null) return ret;
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            //1、求当前队列的大小 size
            int size = queue.size();
          List<Integer> list = new ArrayList();
            //2、while(size > 0)  -->控制当前每一层的数据个数

            while (size>0){
                Node cur= queue.poll();
                if (cur!=null){
                   // list.add(cur.val);
                    if (root.left!=null){
                        queue.offer(cur.left);
                    }
                    if (root.right!=null){
                        queue.offer(cur.right);
                    }
                }

                size--;
            }
            ret.add(list);
        }
        return ret;
    }



    // 判断一棵树是不是完全二叉树
    boolean isCompleteTree(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()){
            Node cur= queue.poll();
            if (cur!=null){
                    queue.offer(cur.left);
                    queue.offer(cur.right);
            }else {
                break;
            }
        }
        while (!queue.isEmpty()){
            Node cur2 = queue.peek();
            if (cur2!=null){
                return false;
            }else {
                queue.poll();
            }
        }
        return true;
    }


    // 前序遍历
    void preOrderTraversal(Node root){

    }
    // 中序遍历
    void inOrderTraversal(Node root){

    }
    // 后序遍历
    void postOrderTraversal(Node root){

    }

}
