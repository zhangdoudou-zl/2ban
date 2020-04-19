import javax.swing.*;
import java.util.Arrays;

/**
 * @program: 0419
 * @description:练习
 * @author: Zhang lin
 * @create: 2020-04-19 23:25
 **/

class Calculator {
    private int num1;
    private int num2;

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add() {
        return this.num1 + this.num2;
    }

    public int sub() {
        return this.num1 - num2;
    }

    public int mul() {
        return this.num1 * this.num2;
    }
}
public class TestDemo3 {
        public static void main(String[] args) {
            Calculator calculator = new Calculator();
            calculator.setNum1(10);
            calculator.setNum2(20);
            System.out.println("加法");
            System.out.println(calculator.add());
            System.out.println("减法");
            System.out.println(calculator.sub());
        }


    public static void func(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            int tmp = array1[i];
            array1[i] = array2[i];
            array2[i] = tmp;
        }
    }
    public static void main1(String[] args) {
        int[] array1 = {1,2,3,4,5,6};
        int[] array2 = {91,81,71,61,51,41};
        func(array1,array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
    }
}


