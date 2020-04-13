import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

/**
 * @program: 20200412
 * @description: 递归
 * @author: Zhang lin
 * @create: 2020-04-13 16:58
 **/
public class TestDemo1 {
    public static int fabrnic1(int n) {
        int f1=1;
        int f2=1;
        int f3=0;
        for(int i=3;i<=n;i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println(fabrnic1(n));
    }

    public static int fabrnic(int n) {
        if(n==1||n==2) {
            return 1;
        }else{
            return fabrnic(n-1)+fabrnic(n-2);
        }
    }
    public static void main5(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        System.out.println(fabrnic(n));
    }



    public static int add(int num) {
        if(num>9) {
            return add(num/10)+num%10;
        }else{
            return num;
        }
    }
    public static void main4(String[] args) {
        int n=1729;
        System.out.println(add(n));
    }
    public static int sum(int n) {
        if(n == 1) {
            return 1;
        }
        return n+sum(n-1);
    }

    public static void main3(String[] args) {
        int n=10;
        System.out.println(sum(n));
    }


    public static void fun1(int n) {
        if(n>9){
            fun1(n/10);
        }
        System.out.println(n%10);
    }
    public static void main2(String[] args) {
        //打印一个数的每一位
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        fun1(n);
    }



    public static int fac(int n) {
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main1(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n =scanner.nextInt();
        int ret = fac(n);
        System.out.println(ret);
    }
}
