
import java.util.*;

/**
 * @program: 0529
 * @description: Map和Set
 * @author: Zhang lin
 * @create: 2020-05-29 16:29
 **/
public class TestDemo3 {
    /**
     * 10w个数据中，统计重复出现的数字及次数
     * @param args
     */
    public static void main(String[] args) {
        Random random= new Random();
        ArrayList<Integer> list=new ArrayList<>();

        for (int i=0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }
        HashMap<Integer,Integer> map= new HashMap<>();
        //key：重复的数字
        //val：重复数字出现的次数
        for (Integer key:list){
            if (map.get(key)==null){  //当前map中没有key值；
                map.put(key,1);   //将key放进map，val值当前为1
            }else {
                Integer val=map.get(key);
                map.put(key,val+1);
            }
        }

        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+"出现了"+entry.getValue()+"次");
        }

    }


    /**
     *10w个数据当中有重复的元素，请去掉重复的元素
     * @param args
     */
    public static void main4(String[] args) {
     Random random = new Random();
     ArrayList<Integer> list = new ArrayList();
     for (int i =0;i<10_0000;i++){
         list.add(random.nextInt(6000));
     }

     Set<Integer> set=new HashSet();
     for (Integer val:list){
         set.add(val);
     }
        System.out.println(set);
    }


    /**
     * 找出10万个元素中第一个重复的数字
     */
    public static void main3(String[] args) {
        Random random =new Random();
        ArrayList<Integer> list=new ArrayList<>();
        for (int i =0;i<10_0000;i++){
            list.add(random.nextInt(6000));
        }
        HashSet<Integer> set = new HashSet<>();
        for (Integer val:list){
            if (set.contains(val)){
                System.out.println("找到第一个重复的数据"+val);
                return;
            }else {
                set.add(val);
            }
        }


    }
    public static void main2(String[] args) {
        Set<Integer> set= new HashSet<>();
        set.add(1);
        set.add(3);
        set.add(2);
        System.out.println(set);

        Iterator<Integer> it= set.iterator();//迭代器
        while (it.hasNext()){
            System.out.print(it.next());
            //打印it的下一个，并且it向后走一步

        }
    }
    public static void main1(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("zhanglin","doudou");
        map.put("mabaijie","baijie");
        map.put("yueshangdian","diandian");

        for (Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"-->" +entry.getValue());
        }
    }

}
