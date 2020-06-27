import java.util.*;
/**
 * @program: 0624
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-27 20:11
 **/
public class TestDemo0672 {


//检查一棵树是否是平衡二叉树
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;
        public TreeNode(int val) {
            this.val = val;
        }
    }
    public class Balance {
        public boolean isBalance(TreeNode root) {
            // write code here
            if(root==null){
                return true;
            }

            if(Math.abs(GetHight(root.left)-GetHight(root.right))>1){
                return false;
            }

            return isBalance(root.left)&&isBalance(root.right);

        }

        private int GetHight(TreeNode root) {
            if (root==null){
                return 0;
            }
            return GetHight(root.left)+GetHight(root.right)+1;
        }
    }

    /*
    给定一系列正整数，按要求对数字进行分类，并输出以下5个数字
        A1=能被5整除的数字中所有偶数的和
        A2=将被5除后余1的数字按给出的顺序进行交错求和，既计算n1-n2+n3-n4...
        A3=被5除后余2的数字个数
        A4=被5除后余3的数字的平均数，精确到小数点后1位
        A5=被5除后余4的数字中最大数字
*/

    //给定一系列的正整数，请按要求对数字进行分类，并输出

        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n = sc.nextInt();
            int []a = new int[n];
            int A1=0,A2=0,A3=0,A5,t=0,c1=0,c2=0,c3=0,c4=0,c5=0;
            double A4=0;
            int sum=0,b=0;
            int max=0;
            int count=1;
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
                if(a[i]%5==0)
                {
                    if(a[i]%2==0)
                    {
                        A1=A1+a[i];
                        c1++;
                    }
                }
                else if(a[i]%5==1)
                {
                    c2++;

                    if(count%2==1)
                        a[i]=a[i];
                    else
                        a[i]=(-1)*a[i];
                    A2=A2+a[i];
                    count++;
                }
                else if(a[i]%5==2)
                {
                    c3++;
                    A3++;
                }
                else if(a[i]%5==3)
                {
                    c4++;
                    b++;
                    sum=sum+a[i];
                }
                else if(a[i]%5==4)
                {
                    c5++;

                    if(max<a[i])
                    {
                        t=max;
                        max=a[i];
                        a[i]=t;
                    }

                }
            }

            A5=max;
            if(c1==0)
            {
                System.out.print("N"+" ");
            }
            if(c1!=0)
            {
                System.out.print(A1+" ");
            }
            if(c2==0)
            {
                System.out.print("N"+" ");
            }
            if(c2!=0)
            {
                System.out.print(A2+" ");
            }
            if(c3==0)
            {
                System.out.print("N"+" ");
            }
            if(c3!=0)
            {
                System.out.print(A3+" ");
            }
            if(c4==0)
            {
                System.out.print("N"+" ");
            }
            if(c4!=0)
            {
                A4=(float)sum/b;
                System.out.printf("%.1f"+" ",A4);
            }
            if(c5==0)
            {
                System.out.print("N");
            }
            if(c5!=0)
            {
                System.out.print(A5);
            }
        }
}
