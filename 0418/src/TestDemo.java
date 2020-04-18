/**
 * @program: 0418
 * @description:构造方法
 * @author: Zhang lin
 * @create: 2020-04-18 21:57
 **/
class Person{


    private String name;
    private int age;

   public Person(){
       this.name="doudou";
       this.age=18;
   }

/*   public Person(){
      //构造方法
        System.out.println("Person<init>");
    }
    public Person(String name,int age){
        this.name=name;
        this.age=age;
        System.out.println("Person<String,int>");
    }*/
  public Person(int age){
      System.out.println("Person<nit>");
  }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
public void show(){
    System.out.println("我叫"+name+","+age+"岁");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
public class TestDemo{
    public static void main(String[] args) {
        Person person1 = new Person(); //这里会调用构造方法
        person1.show();
        Person person2 = new Person("diandian",30);
        System.out.println(person2); //toString方法

        // System.out.println(person1);
        // Person person2 = new Person("doudou",18);
        //System.out.println(person2);
    }
}
