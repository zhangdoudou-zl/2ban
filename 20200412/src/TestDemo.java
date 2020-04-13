import java.util.Random;
import java.util.Scanner;
public class TestDemo {
    public  static int sum(int a,int b){
        return a+b;
    }
    public  static int sum(int c,int d,int e) {
        return c+d+e;
    }
    public static void main7(String[] args) {
        /**
         * 方法的重载：
         * （1）方法名相同
         * （2）返回值不做要求
         * （3）参数列表不同（参数的个数 或者 参数的类型 不同）
         * （4）同一个类当中
         */
        int a=10;
        int b=20;
       int ret1= sum(a,b);
        System.out.println(ret1);
        int c=15;
        int d=25;
        int e=10;
        int ret2=sum(c,d,e);
        System.out.println(ret2);
    }



    public static  int factor(int n) {
        int ret=1;
        int sum=0;

     for( int i=1;i<=n;i++) {
        ret*=i;
        sum+=ret;
     }
        System.out.println(sum);
   return sum;
    }

    public static void main6(String[] args) {
        //打印阶乘的和
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        factor(n);

    }



    public static int maxNum(int num1,int num2){
        return num1>num2?num1:num2;
    }
    //调用函数找出三个数中最大的数
    public static int maxThreeNum(int num1,int num2,int num3) {
        int max=maxNum(num1,num2);
        return maxNum(max,num3);
    }

    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        int n3 = scanner.nextInt();
        int ret = maxThreeNum(n1,n2,n3);
        System.out.println(ret);
    }



    public static void main4(String[] args) {
        //打印一个数的每一位
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        while(n!=0) {
            System.out.print(n%10+" ");
            n/=10;
        }

    }




    //获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
    public static void main3(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        for(int i=31;i>=0;i-=2) {
            System.out.print((n>>i)&1);
        }
        System.out.println();
        for(int i=30;i>=0;i-=2) {
            System.out.print((n>>i)&1);
        }
    }



    public static void main2(String[] args) {
        //计算二进制数中1的个数（方法2）
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int count=0;
        while(n!=0) {
            n=n&(n-1);
            count++;
        }
        System.out.println(count);

    }




    public static void main1(String[] args) {
        //计算二进制数中1的个数（方法1）
        Scanner scanner =new Scanner(System.in);
        int n =scanner.nextInt();
        int count=0;
        for(int i=0;i<32;i++) {
            if(((n>>i)&1)==1) {
                count++;
            }
        }
        System.out.println("count:"+count);
    }
}
