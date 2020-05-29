/**
 * @program: 0529
 * @description:找泛型数组最大值
 * @author: Zhang lin
 * @create: 2020-05-29 10:27
 **/
class Generic<T extends Comparable<T>>{
    public T maxNum(T[] array){
        T max = array[0];
        for (int i =0;i<array.length;i++){
            if (array[i].compareTo(max)>0){
                max=array[i];
            }
        }
        return max;
    }
}
public class TestDemo {
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(); //泛型在编译时期已经擦除成Object类型，Object没有实现Comparable接口
            Integer[] array={1,2,3,23,12,2};
        System.out.println(generic.maxNum(array));
    }
}
