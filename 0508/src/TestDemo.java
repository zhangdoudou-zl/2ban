import com.sun.javaws.IconUtil;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @program: 0508
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-08 16:55
 **/
public class TestDemo {
    public static void main(String[] args) {
        String s1="abc"+"def";//1
        String s2=new String(s1);//2
        if(s1.equals(s2))//3
            System.out.println(".equals succeeded");//4
        if(s1==s2)//5
            System.out.println("==succeeded");    }
    public static void main13(String[] args) {
        String str = " hello%$$%@#$%world 哈哈哈 " ;
        System.out.println(str.toUpperCase());  //大写转换
        System.out.println(str.toLowerCase());// 小写转换
    }


        public static boolean isAdmin(String userId){

            return userId.toLowerCase()=="admin";
        }
        public static void main12(String[] args){
            System.out.println(isAdmin("Admin"));
        }

    public static void main11(String[] args) {
        String str = "192.23.1.1" ;
        String[] result = str.split("\\.") ; // 有些特殊字符作为分割符可能无法正确切分, 需要加上转义
        for(String s: result) {
            System.out.println(s);
        }
    }


    public static String reverse(String str,int begin,int end) {
        char[] value = str.toCharArray();
        while (begin < end) {
            char tmp = value[begin];
            value[begin] = value[end];
            value[end] = tmp;
            begin++;
            end--;
        }
        //return new String(value);
        return String.copyValueOf(value);
    }

    public static String func1(String str,int n){
       String tmp = reverse(str,0,n-1);
       String tmp1= reverse(tmp,n,str.length()-1);
       String ret =reverse(tmp1,0,str.length()-1);
        return ret;
    }

    public static void main9(String[] args) {
       String str = "abcdefg";
       // String ret = reverse(str,0,str.length()-1);
        String ret =func1(str,3);
        System.out.println(ret);
    }

    public static void main8(String[] args) {
        String str = "hello world hello bit" ;
        String[] result = str.split(" ",3) ; // 按照空格拆分
        for(String s: result) {
            System.out.println(s);
        }
    }
    public static void main7(String[] args) throws UnsupportedEncodingException {
        String str ="豆豆";
        byte bytes[] = str.getBytes("gbk");
        System.out.println(Arrays.toString(bytes));
    }
    public static boolean func(String str){
        for (int i =0;i<str.length();i++){
            char ch = str.charAt(i);  //拿到字符串的某一个字符
            if (ch<'0'||ch>'9'){
                return false;
            }
        }
        return true;
    }
    public static void main6(String[] args) {
        String str = "12345a6";
        boolean flg=func(str);
        System.out.println(flg);
    }
    public static void main5(String[] args) {
        char[] val = {'a','b','c','d','e'};
        //String str = new String(val); //将数组内容变成字符串
        String str1 = new String(val,1,3);//将数组部分内容变成字符串
        System.out.println(str1);
        String str2="hello";
        char ch = str2.charAt(0); //拿到字符串的某一个字符
        System.out.println(ch);
        char[] val2=str2.toCharArray(); //字符串变成字符数组
        System.out.println(Arrays.toString(val2));
    }
    public static void main4(String[] args) {
        String str = "hello";
        str = "h"+str.substring(1);
        System.out.println(str);
    }
    public static void main3(String[] args) {
        String str1 = "hello";
        String str2 = new String ("hello").intern();
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
    public static void main2(String[] args) {
        String str1=null;
        String str2=new String("hello");
        System.out.println(str2.equals(str1));
    }
    public static void main1(String[] args) {
        String str1 = "hello";
        String str2 = new String ("hello");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));
    }
}
