
import java.util.Map;
import java.util.TreeMap;

/**
 * @program: 0619
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-24 23:48
 **/
public class TestDemo {
    public int getValue(int[] gifts, int n){
        Map<Integer,Integer> map=new TreeMap<>();
        for (int i=0;i<n;i++){
            if (map.containsKey(gifts[i])){
                map.put(gifts[i],map.get(gifts[i]+1));
            }else {
                map.put(gifts[i],1);
            }
        }
        for (int i=0;i<n;i++){
            if (map.get(gifts[i])>n/2){
                return gifts[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {

    }
}
