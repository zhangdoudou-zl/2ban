import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: 0530
 * @description: Map、Set
 * @author: Zhang lin
 * @create: 2020-05-30 15:57
 **/
public class TestDemo {
    /**
     * 用集合的方法求出只出现一次的数字
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        HashSet set=new HashSet();
        for (int i=0;i<nums.length;i++){
            if (set.contains(nums[i])){
                set.remove(nums[i]);
            }else {
                set.add(nums[i]);
            }
        }
        Iterator<Integer> it = set.iterator();
        return it.next();
    }


    /**
     * 用异或的方式找出只出现一次的数
     * @param nums
     * @return
     */
    public int singleNumber2(int[] nums){
        int ret=0;
        for (int i=0;i<nums.length;i++){
            ret^=nums[i];
        }
        return ret;
    }


    public static void main(String[] args) {

    }
}
