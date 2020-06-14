import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

/**
 * @program: 0609
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-11 22:26
 **/

//递归生成N位格雷码
class GrayCode {
    public String[] getGray(int n) {
        String[] str = new String[2<<(n-1)];
        createGrayCode(str,n);
        return str;
    }

    private static void createGrayCode(String[] codes, int n){
        if (n == 1){
            codes[0] = "0";
            codes[1] = "1";
        }else {
            createGrayCode(codes,n-1);
            int len = 2<<(n-1);
            int mid = len>>1;
            for (int i = len-1,j = 0; i >= 0; i--){
                if (i < mid){
                    codes[i] = "0"+codes[--j];
                }else {
                    codes[i] = "1"+codes[j++];
                }
            }
        }
    }
}
public  class TestDemo{

    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        GrayCode grayCode = new GrayCode();
        String[] str = grayCode.getGray(n);
        for (String t : str)
            System.out.print(t+" ");
    }


    public static String[] getGray(int n) {
            String[] result = new String[(int) Math.pow(2, n)];
            if (n == 1) {
                result[0] = "0";
                result[1] = "1";
                return result;
            }
            String[] last = getGray(n - 1);
            System.out.println(Arrays.toString(last));
            for (int i = 0; i < last.length; i++) {
                result[i] = "0" + last[i];
                result[result.length - i - 1] = "1" + last[i];
            }
            return result;
        }


    public static void main(String[] args) {
        int n=3;
        //String[] ret=getGray(n);
        String ret[]=getGray(n);
        System.out.println(Arrays.toString(ret));
    }

        public static void main1(String[] args) {
        Byte a = 127;
        Byte b = 127;
        add(--a);
        System. out.print(a + " ");  //输出-128
        add(b);
        System. out.print(b + "");   //输出127
    }
    public static void add(Byte b)  //传值，不能改变传过来的参数本身的值
    {
        b = b--;
    }
   
}

