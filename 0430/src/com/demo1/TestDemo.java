package com.demo1;

/**
 * @program: 0430
 * @description:
 * @author: Zhang lin
 * @create: 2020-04-30 13:23
 **/
class Animal{
    public String name;
    public  void eat(){
        System.out.println(" Animal::eat()");
    } //被ststic修饰的方法不可以被重写
    public void sleep(){
        System.out.println("Animal::sleep()");
    }
    public Animal(String name){  //构造方法
        this.name=name;
        eat();
        //System.out.println(this.name+" 豆豆Animal(String)");
    }
}
class Cat extends Animal{
    public int count=99;
    //子类继承父类（继承除构造方法外所有）
    public Cat(String name){  //子类在构造的时候，要先帮助父类进行构造
        super(name);         //必须放在第一行

        // System.out.println(this.name+" 点点CatString");
    }

    public  void eat(){
        System.out.println("点点Cat::eat()");
    }
}
class  Bird extends Animal {
    public Bird(String name) {
        super(name);   //显示调用 父类的构造方法
    }

    public void fly() {
        System.out.println("Bird::fly()");
    }
}
final class ChineseGardenCat extends Cat{  //一旦一个类被final修饰，那么这个类不能被继承
    //多层继承最好不超过三次
    public ChineseGardenCat(String name){
        super(name);
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
    }
    public static void main5(String[] args) {
        Animal animal = new Cat("mimi");
        animal.eat();

    }
    public static Animal func1(){
        return new Cat("mimi");
    }
    public static void main4(String[] args) {
        Animal animal=  func1();
        animal.eat();
    }


    public static void func(Animal animal){
        animal.eat();
    }
    public static void main3(String[] args) {
        Cat cat = new Cat("doudou");
        func(cat);   //传参 发生向上转型
    }
    public static void main2(String[] args) {
        ChineseGardenCat chineseGardenCat = new ChineseGardenCat("haha");
        chineseGardenCat.eat();
    }
    public static void main1(String[] args) {
        Cat cat = new Cat("mimi");
        cat.eat();
    }
}

