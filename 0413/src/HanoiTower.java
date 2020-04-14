/**
 * @program: 0413
 * @description: 汉诺塔、青蛙跳台阶
 * @author: Zhang lin
 * @create: 2020-04-14 16:05
 **/
public class HanoiTower {
    public static int JumpFloorII(int target) {
        //变态跳台阶：一次可以跳1阶，2阶...n阶
        if(target <= 2)
            return target;
        else
            return JumpFloorII(target - 1) * 2;
        //f(n)=f(n-1)+f(n-2)+...f(1)
        //f(n-1)=f(n-2)+f(n-3)+...f(1)
        //两式相减得f(n)=2*f(n-1)

}
    public static void main(String[] args) {
   int n=3;
        System.out.println(JumpFloorII(n));
    }
    public static int jumpFloor(int target){
        //一只青蛙一次可以跳上 1 级台阶，也可以跳上2 级。求该青蛙跳上一个n 级的台阶总共有多少种跳法
        if(target==1){
            return 1;
        }else if(target==2){
            return 2;
        }else{
            return jumpFloor(target-1)+jumpFloor(target-2);
        }
    }
    public static void main2(String[] args) {
         int n=4;
        System.out.println(jumpFloor(n));
    }
    public static void move(char pos1,char pos2) {
        System.out.print(pos1+"-->"+pos2+" ");
    }

    /**
     *
     * @param n      盘子个数
     * @param pos1   起始位置
     * @param pos2   中途位置
     * @param pos3   目的地位置
     */
    public static void hanoi(int n,char pos1,char pos2,char pos3){
        if(n==1) {
            move(pos1,pos3);
        }else{
            hanoi(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hanoi(n-1,pos1,pos2,pos3);
        }
    }
    public static void main1(String[] args) {
        hanoi(1,'A','B','C');
        System.out.println();
        hanoi(2,'A','B','C');
        System.out.println();
        hanoi(3,'A','B','C');
        System.out.println();
    }
}


