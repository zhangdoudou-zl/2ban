import java.util.*;
public class TestDemo {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int num = scan.nextInt();
	int n=2;
	for(;n<=(int)Math.sqrt(num);n++){
		if(num%n==0){
			System.out.println("不是素数");
			break;
		} 
		
		}if(n>Math.sqrt(num)){
			System.out.println("是素数");
	}
}



public static void main12(String[] args) {
	//编写代码模拟三次密码输入的场景。 最多能输入三次密码，密码正确，提示“登录成功”
	Scanner scan = new Scanner(System.in);
   
	int count=3;
	while((count--)!=0){
		System.out.println("请输入你的密码");
		String password = scan.nextLine();
		if(password.equals("123456")){
			System.out.println("密码正确");
			break;
		}else{
			
			System.out.println("密码错误你还有"+count+"次机会");

		}
	}
	
}




	public static void main11(String[] args) {
		//编写程序数一下 1到 100 的所有整数中出现多少个数字9。
		int count=0;
		for(int num=1;num<100;num++){
          if(num%10==9){
          	count++;
          }if (num/10==9){
          	count++;
          }
		}
		System.out.println(count);
	}




public static void main10(String[] args) {
	//计算1/1-1/2+1/3-1/4+1/5 …… + 1/99 - 1/100 的值
	int num=1;
	double sum=0;
	int flg=1;
	for(num=1;num<=100;num++){
		sum+=(1.0/num)*flg;
		flg=-flg;
	}
	System.out.println(sum);
}




public static void main9(String[] args) {
	//求两个数的最大公约数(辗转相除法)
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	int b = scan.nextInt();
	int c=a%b;
	while(a%b!=0)
	{
		a=b;
		b=c;
		c=a%b;
	}
	System.out.println(b);
}





public static void main8(String[] args) {
	//输出乘法口诀表
	for(int i=1;i<=9;i++) {
		for(int j=1;j<=i;j++) {
		System.out.print(i+"*"+j+"="+i*j+" ");	
		}
		System.out.println();
	}
}




	public static void main7(String[] args) {
		//打印1000-2000年间的润年
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println("1000-2000年间的润年有：");
		for(int year=1000;year<=n;year++){
			if((year%4==0 &&year%100!=0)||(year%400==0)){
				
				System.out.println(year);
			}
		}		
	}
   


	public static void main6(String[] args) {
	    //打印1-100之间的素数
		int count=0;
	    int i=0; 
		for(i=1;i<100;i++){
			int n=2;
			for(n=2;n<=(int)Math.sqrt(i);n++){
				if(i%n==0){
					break;
				}
			}
			if(n>(int)Math.sqrt(i)){
				System.out.println(i);
			}
		}				
	}





	public static void main5(String[] args) {
		//猜数字游戏
		Scanner scan= new Scanner(System.in);
		
	    Random random =new Random();
	    int randnum= random.nextInt(100)+100;
	    
	    	System.out.println("输入你要猜的数字");
    	    while(true){
	    	 int guess =scan.nextInt();

	    		if(guess<randnum){
	    	 	System.out.println("猜小了");
	            }else if(guess>randnum){
	        	System.out.println("猜大了");

	          }else {
	        	System.out.println("猜对了");
	        	break;
	    	  }
	    	 
	        }
	}



	public static void main4(String[] args) {
		//根据年龄, 来打印出当前年龄的人是少年(低于18), 青年(19-28), 中年(29-55), 老年(56以上)
		Scanner scan=new Scanner(System.in);
			int age=scan.nextInt();
			if(age<=18){
				System.out.println("少年");
				
			}
			else if(age>=19 && age<=28){
					System.out.println("青年");
					
			}else if(age>=29&&age<=55){
				System.out.println("中年");
			}else{
              System.out.println("老年");
			}
		 
	}



	public static void main3(String[] args) {
		//打印1-100000之间的水仙花数
		
	  for(int n=1;n<999999;n++){
	     	int count=0;
	     	int tmp=n;
	  		while(tmp!=0){	  			
	  			tmp/=10;
	  			count++;
	  		}
	  		  
	  		 tmp=n;
	  		 int sum=0;		  		
	  	      while(tmp!=0){
	  		  sum+= Math.pow(tmp%10,count);
	  	      tmp= tmp/10;
	      	  }
	  		
	  		
	  	if(sum==n){
	  		System.out.println(sum);
	  	}	  	
	  }
	}


	public static void main2(String[] args) {
		//给三个int变量，求最大值和最小值
		  int i,min,max;
        int A[]={74,48,30,17,62};  // 声明整数数组A,并赋初值

        min=max=A[0];
        System.out.print("数组A的元素包括：");
        for(i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
            if(A[i]>max)   // 判断最大值
                max=A[i];
            if(A[i]<min)   // 判断最小值
                min=A[i];
            }
        System.out.println("\n数组的最大值是："+max); // 输出最大值
        System.out.println("数组的最小值是："+min); // 输出最小值
    }	

	public static void main1(String[] args) {
		//交换两个整数的值

		int a=10;
		int b=20;
		int tmp=0;
		tmp=a;
		a=b;
		b=tmp;
		System.out.println(a);
		System.out.println(b);		
	}
}