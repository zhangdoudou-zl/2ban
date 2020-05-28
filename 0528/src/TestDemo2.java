import java.util.Arrays;

/**
 * @program: 0528
 * @description:
 * 缺点：每次业务不同，要去修改类的本身
 * 自定义类型为啥要实现可比较呢？
 * @author: Zhang lin
 * @create: 2020-05-28 13:28
 **/
class Student implements Comparable<Student>{
    public int age;
    public int score;
    public String name;

    public Student(String name,int age,int score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", score=" + score +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Student o) {
        return this.age-o.age; //从小到大排序
    }
}
public class TestDemo2 {
    public static void main(String[] args) {
        Student student1 = new Student("duodou",16,89);
        Student student2 = new Student("diandian",26,66);
        Student student3 = new Student("caocao",6,96);
        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        Arrays.sort(students);

        System.out.println(Arrays.toString(students));

    }
      public static void main1(String[] args) {
        Student student1 = new Student("dandan",16,89);
        Student student2 = new Student("doudou",26,66);
        if(student1.compareTo(student2) > 0) {
            System.out.println("student1大于stu2");
        }
    }
}
