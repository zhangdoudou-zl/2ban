import com.sun.xml.internal.fastinfoset.tools.XML_SAX_StAX_FI;

import java.net.Inet4Address;
import java.util.*;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * @program: 0513
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-13 09:13
 **/
public class TestDemo {
    public static void main(String[] args) {


    }
    public static void main7(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("国民女神","高圆圆");
        map.put("国民男神","王思聪");
        System.out.println(map);
        String str= map.get("国民女神");
        String str1=map.getOrDefault("国民女神","wu");
        System.out.println(str1);
        System.out.println("==============");
        Set<Map.Entry<String,String>>  set =map.entrySet();
        for (Map.Entry<String,String> ch:set       ) {
            System.out.println(ch.getKey()+"==>"+ch.getValue());
        }
    }
    public static void main6(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("doudou");
        System.out.println(collection);
        collection.clear();
        System.out.println(collection);
    }
    public static void main5(String[] args) {
        StringBuffer sb=new StringBuffer();

        char b= 'a';
        char[] ch={'a','b','c','d'};
        boolean c=false;
        sb.append(b);
        sb.append(c);
        sb.append(ch,0,3);
        System.out.println(sb);
        System.out.println("=================");
//        char ret= sb.charAt(0);  //返回 char在指定索引在这个序列值
//        int ret1=sb.codePointAt(0); //返回指定索引处的字符（Unicode代码点）。
//        int ret2=sb.codePointBefore(1); //返回指定索引之前的字符（Unicode代码点）。
        StringBuffer ret3= sb.delete(0,2);  //删除此序列的子字符串中的字符。(前闭后开）
//        System.out.println(ret1);
//        System.out.println(ret2);
        System.out.println(ret3);
        System.out.println(sb);
        System.out.println("=================");
        StringBuffer buff = new StringBuffer("doudoudou");
        StringBuffer ret= buff.deleteCharAt(7); //删除 char在这个序列中的指定位置
        System.out.println(ret);
        System.out.println("=================");
        char[] dst={'a','b','c','d','e'};
        buff.getChars(0,3,dst,2);  //字符从该序列复制到目标字符数组 dst
        System.out.println(dst);
        System.out.println("=================");
        buff.replace(0,1,"b");
        System.out.println(buff);




    }
    public static void main2(String[] args) {
       // StringBuffer stringBuffer=new StringBuffer();
        StringBuilder sb=new StringBuilder();
        sb.append("abc");
        String ret=sb.toString();
        System.out.println(ret);
        System.out.println(sb);
//        String s="world";
//        s=s+"world";
//        System.out.println(s    );
    }
    public static void main1(String[] args) {
        String str ="";
        for ( int i=0;i<10;i++){  //产生大量的临时对象
            str+='a';
        }
        System.out.println(str);
    }
}
