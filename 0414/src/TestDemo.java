import java.awt.print.PrinterGraphics;
import java.util.Scanner;

/**
 * @program: 0414
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-14 20:43
 **/
public class TestDemo {
    public static void main13(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n= scan.nextInt();
        System.out.println(func1(n));
    }
    public static int func1(int n){
     if(n==1){
         return 1;
     }else{
         return n*func1(n-1);
     }
    }


    public static void main12(String[] args) {
        int n=10;
        System.out.println(add2(n));
    }
    public static int add2(int n){
       int ret=0;
        if(n==1){
            return n;
        }else{
            return n+add2(n-1);
        }
    }



    public static void main11(String[] args) {
        int n=1234;
        print(n);
    }
    public static void print(int  n) {
        if (n > 9) {
            print(n / 10);
        }
        System.out.print(n % 10+" ");
    }




    public static void main10(String[] args) {
        int n=1729;
        System.out.println(add1(n));
    }
    public static int add1(int n){
        if(n>9){
            return add1(n/10)+n%10;
        }
        return n;
    }




    public static void main9(String[] args) {
        int n=5;
        System.out.println(fabrnic(n));
    }
    public static int fabrnic(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 1;
        }else{
            return fabrnic(n-1)+fabrnic(n-2);
        }
    }



    public static void main8(String[] args) {
        int a=2;
        int b=3;
        double c=2.2;
        double d=3.2;
        double e=5.1;
        System.out.println(add(a, b));
        System.out.println(add(c,d,e));
    }
    public static int add(int a,int b){
        return a+b;
    }
    public static double add(double c,double d,double e){
        return c+d+e;
    }



    public static void main7(String[] args) {
        //在同一个类中定义多个方法：要求不仅可以求两个整数的最大值，还可以求两个小数的最大值，以及两个小数和一个整数的大小关系
        int a=10;
        int b=20;
        System.out.println(max2(a, b));
        double c=1.2;
        double d=2.3;
        System.out.println(max2(c, d));
        System.out.println(max2(a, b, c));
    }
    public static int max2(int a,int b){
        return a>b?a:b;
    }
    public static double max2(double a,double b){
        return a>b?a:b;
    }
    public static double max2(double a,double b,double c){
        return max2(a,b)>c?max2(a,b):c;
    }




    public static int max(int a,int b){
        int ret=a>b?a:b;
        return ret;
    }
    public static int max1(int a,int b,int c){
        int ret=max(a,b)>c?max(a,b):c;
        return ret;
    }
    public static void main6(String[] args) {
        int a=10;
        int b=12;
        int c=20;
        System.out.println(max1(a,b,c));
    }




    public static void main(String[] args) {
        int []array={2,1,3,5,7,9,11};
          exchange(array);
       for(int i=0;i<array.length;i++){
           System.out.print(array[i]+" ");
       }
    }
    public static int[] exchange(int []array){
        int left=0;
        int right=array.length-1;
        int temp=0;
        while(left<right) {
            while(left<right && array[left]%2!=0) {
                left++;
            }
            while(left<right && array[right]%2==0){
                right--;
            }
                temp = array[left];
                array[left] = array[right];
                array[right] = temp;

        }

        return array;
    }


    public static void main4(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(sum(num));
    }
    public static int sum(int n){
        //求1！+2！+3！+4！+........+n!的和
        int ret=1;
        int sum=0;
      for(int i=1;i<=n;i++){
          ret=ret*i;
          sum=sum+ret;
      }
      return sum;
    }



    public static void main3(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(func(num));
    }
    public static int func(int n) {
        //迭代求斐波那契额数列的第n项
        int a=1;
        int b=1;
        int c=0;
        if(n==1) {
            return 1;
        }else if(n==2) {
            return 1;
        }else{
            for(int i=3;i<=n;i++) {
                c = a + b;
                a = b;
                b = c;
            }
            return c;
        }
    }



    public static void main2(String[] args) {
        int[] num = new int[]{1, 1, 3, 3, 4, 5, 6, 5, 6};
        findNumber1(num);
    }
    public static void findNumber1(int[] num) {
        int i=0;
        int j=0;
        int count=0;
        for(i=0;i<num.length;i++) {
            count=0;
            for(j=0;j<num.length;j++) {
                if(num[i]==num[j]) {
                    count++;
                }
            }if(count!=2){
                System.out.println(num[i]);
            }
        }
    }



    public static void main1(String[] args) {
        int[] num = new int[]{1,1,3,3,4,5,6,5,6};//数组里面放一组数据

    }
    public static int findNumber(int[] num){
        int n = 0;
        for(int i = 0;i<num.length;i++){//for循环，依次异或
            n ^= num[i];
        }
        return n;
    }
}
