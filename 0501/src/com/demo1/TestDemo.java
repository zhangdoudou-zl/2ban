package com.demo1;

/**
 * @program: 0501
 * @description: 多态
 * @author: Zhang lin
 * @create: 2020-05-01 21:00
 **/

/**
 * 什么是多态：
 * 1.父类引用 引用字类对象
 * 2.父类和子类有同名的覆盖方法
 * 3。通过父类引用调用这个重写方法的时候。（多态）
 */
class Shape{
    public void draw(){

    }
}
class Triangle extends Shape {
    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个▲");
    }
}

class Cycle extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个⚪");
    }
}
class React extends Shape{
    @Override
    public void draw() {
        super.draw();
        System.out.println("画一个□");
    }
}
public class TestDemo {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void drawShape(){
        Shape shape2 = new Triangle();
        Shape[] shapes = {shape2,new Cycle(),new React(),new Triangle()};
        for (Shape shape:shapes) {
            shape.draw();
        }

    }
    public static void main(String[] args) {
        Shape shape1 = new Cycle();
        Shape shape2 = new React();

        drawMap(shape1);
        drawMap(shape2);
        Shape shape3 = new Triangle();
        drawMap(shape3);
        System.out.println("=========");
        drawShape();

    }
}
