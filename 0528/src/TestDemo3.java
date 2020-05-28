import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * @program: 0528
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-28 13:43
 **/
class Person {
    public int age;
    public int score;
    public String name;

    public Person(String name, int age, int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }
    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }


}
public class TestDemo3 {
    public static void main(String[] args) {
        AgeComparator ageComparator = new AgeComparator();
        PriorityQueue<Person> priorityQueue = new PriorityQueue<>(ageComparator);
        //小堆存放（修改比较器可以变成大堆存放）
        priorityQueue.offer(new Person("bit",16,89));
        priorityQueue.offer(new Person("gaobo",36,66));
        System.out.println(priorityQueue);
    }
    public static void main2(String[] args) {
        Person person1 = new Person("doudou", 16, 89);
        Person person2 = new Person("diandian", 26, 66);
        Person person3 = new Person("dandan", 6, 96);
        Person[] people = new Person[3];
        people[0] = person1;
        people[1] = person2;
        people[2] = person3;

        AgeComparator ageComparator = new AgeComparator();
        Arrays.sort(people,ageComparator);
        System.out.println(Arrays.toString(people));
    }

    public static void main1(String[] args) {
        Person person1 = new Person("zhanglin",16,89);
        Person person2 = new Person("doudou",26,66);

        AgeComparator ageComparator = new AgeComparator();

        System.out.println(ageComparator.compare(person1,person2));
    }
}
