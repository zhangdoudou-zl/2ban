import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static jdk.nashorn.internal.objects.NativeString.fromCharCode;
import static jdk.nashorn.internal.objects.NativeString.search;

/**
 * @program: 0616
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-19 15:01
 **/

public class Test {
    public static void func(int n,int[] array,int k){
        for (int i=0;i<k;i++){
            func1(array,array.length);
        }
        for (int i=0;i<2*n;i++) {
            System.out.print(array[i]);
        }
    }

    private static void func1(int[] array, int n) {
        ArrayList<Integer> list=new ArrayList<>(n);
        for (int i=0;i<n/2;i++){
            list.add(array[i]);
            list.add(array[i+n/2]);
        }
       for (int i=0;i<n;i++){
           array[i]= list.get(i);
       }
    }








    public static void main4(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (sc.hasNext()){
            int N=sc.nextInt();
            int[] arr=new int[N];
            for (int i=0;i<arr.length;i++){
                arr[i]=sc.nextInt();
            }
            int score=sc.nextInt();

            Search(arr,score);
        }


    }

    private static void Search(int[] arr, int score) {
        int count=0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]==score){
             count++;
            }
        }
        System.out.println(count);
    }

    public static void main3(String[] args) {
        //洗牌
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for (int i=0;i<T;i++){
            int n =sc.nextInt();
            int[] arr=new int[2*n];
            int k=sc.nextInt();
            for (int j=0;j<arr.length;j++){
                arr[j]=sc.nextInt();
            }
            func(n,arr,k);
        }


    }
    public static void main2(String[] args) {
        int i=5;
        int s=(i++ )+(++i)+(i--)+(--i);
        System.out.println(s);

    }
    public static void main1(String[] args) {
        int i=0;
        int j=0;
        if((++i)>0||(++j)>0){
            System.out.println(i);
            System.out.println(j);
        }
    }


        private int count;
        public static void main0(String[] args) {
            Test test=new Test(88);
            System. out . println(test . count);
        }
        Test(int a) {
            count=a;
        }





}
