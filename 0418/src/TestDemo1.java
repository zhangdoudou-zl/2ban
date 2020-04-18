/**
 * @program: 0418
 * @description: getter and setter
 * @author: Zhang lin
 * @create: 2020-04-18 23:16
 **/
class Person1{
    private String name;
    private int age;
    private String sex;

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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}

public class TestDemo1 {
    public static void main(String[] args) {
        Person1 person1=new Person1();
        person1.setName("piaopiao");
        String name = person1.getName();
        System.out.println(name);

        person1.setSex("male");
        String sex = person1.getSex();
        System.out.println(sex);


    }

}
