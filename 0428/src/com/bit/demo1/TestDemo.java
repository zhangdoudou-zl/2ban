package com.bit.demo1;

/**
 * @program: 0428
 * @description:继承
 * @author: Zhang lin
 * @create: 2020-04-28 16:41
 **/
class Animal{
    public String name;
    public void eat(){
        System.out.println(this.name+" Animal::eat()");
    }
    public void sleep(){
        System.out.println("Animal::sleep()");
    }
    public Animal(String name){  //构造方法
        this.name=name;
        System.out.println(this.name+" Animal(String)");
    }
}
class Cat extends Animal{     //子类继承父类（继承除构造方法外所有）
    public Cat(String name){  //子类在构造的时候，要先帮助父类进行构造
        super(name);         //必须放在第一行
        super.name="hhhh";
        System.out.println(this.name+" CatString");
        }

//    public void eat(){
//        System.out.println("Cat::eat()");
//   }
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
 ChineseGardenCat chineseGardenCat = new ChineseGardenCat("haha");
 chineseGardenCat.eat();
    }
    public static void main1(String[] args) {
    Cat cat = new Cat("mimi");
    cat.eat();
    }
}
