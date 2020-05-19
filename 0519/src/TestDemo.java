import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @program: 0519
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-19 14:07
 **/
public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        System.out.println("层序遍历");
        binaryTree.levelOrderTraversal(root);

        boolean flg=binaryTree.isCompleteTree(root);
        System.out.println(flg);
    }



}
