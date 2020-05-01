package com.demo2;

/**
 * @program: 0501
 * @description:抽象类
 * @author: Zhang lin
 * @create: 2020-05-01 22:15
 **/

import javax.print.attribute.standard.SheetCollate;
import java.security.cert.CertificateNotYetValidException;

/**
 * 抽象类
 * 1、一个方法被abstract修饰，那么这个方法就是抽象方法，抽象方法没有具体的实现
 * 2、包含抽象方法的类，抽象类
 * 注意：
 * 1.抽象类不可以被实例化 即不能Shape  shape  = new Shape（）；
 * 2.在抽象类内的数据成员和普通类没有区别
 * 3.抽象类主要就是用来被继承
 * 4.如果一个类继承了这个抽象类，那么这个类必须重写抽象类中的抽象方法
 * 5.当抽象类A继承抽象类B，那么B可以不重写抽象方法，但A再被继承还是要重写抽象类方法
 * 6.抽象类或抽象方法不能被final修饰
 */
abstract class Shape{
    public abstract void draw();
}
class Triangle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个▲");
    }
}
class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个⚪");
    }
}
class React extends Shape {
    @Override
    public void draw() {
        System.out.println("画一个□");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
    Shape shape = new Cycle();
    Shape shape1 = new React();
    drawMap(shape);
    }
}

