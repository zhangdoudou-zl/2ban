
import java.util.Scanner;
public class TestDemo {
	public static void main(String[] args) {
		//else 只会和最近的if 结合
		int x = 10;
		int y = 10;
		if (x == 10) {
			if (y == 10) {
				System.out.println("aaa");
			} else {
				System.out.println("bbb");
			}
		}
			
	}
	public static void main4(String[] args){
		// Scanner scan = new Scanner(System.in);
		// //String str=scan.nextLine();  //nextLine（） 遇到空格也不会停止
		// String str=scan.next();        //next（）遇到空格会停止
		// System.out.println(str); 
		 Scanner scan =new Scanner(System.in);
		 
		 while(scan.hasNextInt()){   
		 //1、ctrl+c(直接中断程序)   
	     //2.ctrl+D 正常退出
		 	int year=scan.nextInt();
		 	    if( (year%4==0 && year%100!=0)  || (year %400==0)){
		 	    System.out.println("是润年");
		        }else{
		 	       System.out.println("不是润年");
		        }
		 }
		 
		 
	}


	public static void main3(String[] args){
		Scanner scan =new Scanner(System.in);
        int a=scan.nextInt();
        System.out.println(a);
        String str=scan.next();
        System.out.println(str);
   	}
	public static void main2(String[] args){
		// int a=10;
		// a=a++;   
		// System.out.println(a);   //输出结果为10
	       int a = 10;
		   int b = ++a;//a=11   b = a;
		   System.out.println(b);//11
		   int c = a++;//c = a;   a = a+1;  12
		   System.out.println(c);//11
	       System.out.println(10%3);  //1
	       System.out.println(10%-3); //1
	       System.out.println(-10%3); //-1
	       System.out.println(-10%-3);//-1
	       System.out.println(5/2);   //2
		   System.out.println(5.0/2); //2.5
		   System.out.println((float)5/2); //2.5
		   System.out.println((float)(5/2)); //2.0

	}
	public static void main1(String[] args) {
		// 计算5的阶乘的和

		int i=1;
		int ret=1;
		int sum=0;
		while(i<=5)
		{
			ret*=i;
			sum+=ret;
			i++;

		}
		System.out.println(sum);
	}

}