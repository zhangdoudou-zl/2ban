import com.sun.org.apache.xerces.internal.impl.xs.SchemaNamespaceSupport;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: 0512
 * @description: String
 * @author: Zhang lin
 * @create: 2020-05-12 14:45
 **/

public class TestDemo {
    public static String func2(String str,int n){  //方法二
        if (str==null||n<=0||n>=str.length()){
            return null;
        }
        String ret=reverse(str,0,n-1);
        String ret1=reverse(ret,n,str.length()-1);
        String ret2=reverse(ret1,0,str.length()-1);
        return ret2;

    }
    public static String func1(String str,int n){//方法一
        String ret=str.substring(0,n);
        String ret2=str.substring(n,str.length());
        String tmp=ret;
        ret=ret2;
        ret2=tmp;
        return ret+ret2;
    }
    public static void main(String[] args) {
//     String str= "abcdefg";
//     int n=3;
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        String str=scan.next();
        String str2=func2(str,n);
     //String str2=func1(str,n);
        System.out.println(str2);
    }


    public static String reverse(String str,int start,int end){
        char[] ch = str.toCharArray();

        while (start<end){
            char tmp=ch[start];
            ch[start]=ch[end];
            ch[end]=tmp;
            start++;
            end--;
        }
       // return new String(ch);
        return String.copyValueOf(ch);
    }
    public static void main6(String[] args) {
        String str ="doudou";
        String ret= reverse(str,0,str.length()-1);
        System.out.println(ret);
    }


    public static String func(String str){
        String[]strings=str.split(" ");
        String ret="";
        for(String ch:strings){
            ret+=ch;
        }
        return ret;
    }

    public static void main5(String[] args) {
        Scanner scan = new Scanner(System.in);
        while(scan.hasNext()){
            String str=scan.nextLine();
            String ret=func(str);
            System.out.println(ret);
        }

    }
    public static void main4(String[] args) {
        String str = "abc ab ab";
      String[] ret=  str.split(" ");
        for (String ch:ret
             ) {
            System.out.println(ch);        }

        System.out.println("===============");
        String str1 ="123\\121\\12";
       String[] ret2= str1.split("\\\\");
        for (String ch:ret2
        ) {
            System.out.println(ch);        }
        System.out.println("===============");
        String str2="name=zhangdoudou&age=18";
        String[] strings=str2.split("&");
        for (String sh:strings){
            String[] ret3=sh.split("=");
                for (String ch:ret3) {
                    System.out.println(ch);
                }
            }

    }






    public static void main2(String[] args) {
        String str = "abababababcababc";
        boolean flg=str.contains("abc");

        System.out.println(flg);

        int index = str.indexOf("abc",9);
        System.out.println(index);

        int index1=str.lastIndexOf("abc"); //从后往前找
        int index2=str.lastIndexOf("abc",8);
        System.out.println(index2);

        boolean flg1=str.startsWith("abab");
        System.out.println(flg1);
    }

    public static void main1(String[] args) {
        String str = "abababcd";
        String ret=str.replaceAll("a","p");
        System.out.println(ret);
        String ret1= str.replaceFirst("ab","cc");
        System.out.println(ret1);
        System.out.println("====================");
        String ret2=str.substring(1);  //从这个位置开始截取到结束位置
        String ret3=str.substring(1,3); //提取子串，前闭后开
        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println("====================");
        String str1="   abcde ab  ";
        String ret4=str1.trim();  //去掉字符串开头和结尾的空格
        System.out.println(ret4);

    }
}
