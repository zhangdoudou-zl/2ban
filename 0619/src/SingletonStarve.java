/**
 * @program: 0619
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-19 19:10
 **/
/**
 * 饿汉模式的单例
 */
public class SingletonStarve {
    // 1. 我需要保存我仅有的一个对象
    //final 修饰了，保证了原子性了
    private static final SingletonStarve instance;

    // 2. 饿汉模式，也就是一开始就初始化
    // 静态代码块 or 直接初始化都可以
    static {
        instance = new SingletonStarve();
    }

    // 3. 如果需要该类的对象，只能使用这个 instance 指向的对象
    //    所以，需要提供方法，把对方返回
    public static SingletonStarve getInstance() {
        return instance;
    }

    // 4. 尽可能的避免有人无意中构造出该类的对象
    //    所以，把类的构造方法标记有 private，减少误用可能
//    private SingletonStarve() {
//    }
}

