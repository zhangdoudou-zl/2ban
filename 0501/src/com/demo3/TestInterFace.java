package com.demo3;

/**
 * @program: 0501
 * @description: 接口
 * @author: Zhang lin
 * @create: 2020-05-01 23:21
 **/

/**
 * 1.接口中的方法都是抽象方法
 * 2.可以有具体实现的方法（被default修饰）
 * 3.接口中定义的成员变量默认是常量
 * 4.接口中的成员变量默认是public static final。成员方法public abstract
 * 5.接口不可以被实例化
 * 6.接口和类之间的关系：implements
 * 7.可以实现多个接口
 */
interface Shape{
    void draw();
}
class Triangle implements Shape {
    @Override
    public void draw() {

        System.out.println("画一个▲");
    }
}

class Cycle implements Shape {
    @Override
    public void draw() {

        System.out.println("画一个⚪");
    }
}

class React implements Shape {
        @Override
        public void draw() {
            System.out.println("画一个□");
        }
 }

    public class TestInterFace {
        public static void drawMap(Shape shape) {
            shape.draw();
        }

        public static void main(String[] args) {
            Shape shape = new Cycle();
            Shape shape1 = new React();
            drawMap(shape);
            drawMap(shape1);
        }
    }

