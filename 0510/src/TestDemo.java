import java.util.*;

/**
 * @program: 0510
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-10 23:01
 **/
public class TestDemo {
    public static void main(String[] args) {
        Map<String,String> map  = new HashMap<>();
        map.put("女神","张豆");
        map.put("男神","豆豆爸爸");
        map.put("大女神","豆豆妈妈");
        for (Map.Entry<String,String> entry:map.entrySet()
        ) {
            System.out.println(entry.getValue()+"=>"+entry.getKey());
        }
        System.out.println(map.size());
        System.out.println(map.get("女神"));//根据指定的 k 查找对应的 value
    }
    public static void main1(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("豆豆");
        collection.add("is beautiful");
        collection.add("hhhh");
        System.out.println(collection);

        Object[] array = collection.toArray();
        System.out.println(Arrays.toString(array));

        collection.remove("hhhh");
        System.out.println(collection);

        for (String s:collection
        ) {
            System.out.println(s);
        }

        collection.clear();
        System.out.println(collection);
    }
}
