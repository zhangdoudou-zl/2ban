import java.util.*;

/**
 * @program: 0511
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-11 19:12
 **/
class Student{
    public double score;
    public String name;
    public String classes;

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Student{" +
                "score=" + score +
                ", name='" + name + '\'' +
                ", classes='" + classes + '\'' +
                '}';
    }

    //构造方法
    public Student(double score, String name, String classes) {
        this.score = score;
        this.name = name;
        this.classes = classes;


    }
}
public class TestDemo {
    public static List<Character> func(String str1,String str2){
        List<Character> list = new ArrayList<>();
        for(int i =0 ;i<str1.length();i++){
            char ch = str1.charAt(i);
            if (!str2.contains(ch+"")){
                list.add(ch);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        String str1= "welcome to myhome";
        String str2="come";
        List<Character> ret = func(str1,str2);
        for (char ch:ret
             ) {
            System.out.print(ch);
        }

    }
    public static void main2(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(5);
        list.add(2);
        list.add(4);
        list.add(3);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
    }



    public static void main1(String[] args) {
        Student student1  = new Student(12,"gaobo","2班");
        Student student2=  new Student(80,"doudou","2班");
        List<Student> list= new ArrayList<>();
        list.add(student1);
        list.add(student2);
        System.out.println(list);
    }

}
