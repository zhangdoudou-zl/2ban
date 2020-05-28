import java.util.Comparator;

/**
 * @program: 0528
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-28 13:45
 **/
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
            return o1.age-o2.age;
    }
}
