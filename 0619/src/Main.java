/**
 * @program: 0619
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-19 19:10
 **/
public class Main {
    public static void main(String[] args) {
        // 由于 SingletonStarve 构造方法是 private 的
        // 所以，会有语法错误
        // SingletonStarve mistake = new SingletonStarve();

        // 如果要用到该类的对象
        SingletonStarve right = SingletonStarve.getInstance();
    }
}

