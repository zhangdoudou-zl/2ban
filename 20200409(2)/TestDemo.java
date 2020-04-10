public class TestDemo {
	public static void main(String[] args) {
		 final int NUM=10;
		 NUM=99;  //编译报错 因为常量只能被初始化一次
		 System.out.println(NUM);
	}



	/**
	 * 1.不同类型的数据进行混合运算时会发生数值提升
	 * 例如long类和int类
	 * 2.小于四个字节的数据类型，在运算时会发生整型提升
	 * @param args [description]
	 */
	  public static void main10(String[] args) {
	  	int a=10; 
	  	long b=20;
	  	long c=(long)(a+b);
	  	System.out.println(c);
	  	byte d=12;
		byte e=21;
		byte f=(byte)(d+e);
		System.out.println(f);

		//System.out.println(f); 
		//System.out.println(Integer.MAX_VALUE+1);
		//System.out.println(Byte.MAX_VALUE+1);
		//System.out.println(Character.MAX_VALUE+1);
		System.out.println(Long.MAX_VALUE+1);
       
	  }


	/**
	 * 字符串类型 String
	 * @param args [description]
	 */
	public static void main9(String[] args) {
		String str="\"doudou\"";  // \"转义字符
		String arr="dou\ndou";
        System.out.println(str);
        System.out.println(arr);
	}
	/**
	 * 布尔类型  没有明确大小 只有两个取值，true和false
	 * @param args [description]
	 */
	public static void main8(String[] args) {
		boolean flg=true;
		System.out.println(flg);
	
			System.out.println((10<20)||(10/0==0));
		
	}



	/**
	 * 短整型 short 2个字节
	 * @param args [description]
	 */
	public static void main7(String[] args) {
		short sh=12;
		System.out.println(Short.MAX_VALUE);
		System.out.println(Short.MIN_VALUE);
	}



	/**
	 * 字节：byte  1个字节  -128---127；
	 * @param args [description]
	 */
	public static void main6(String[] args) {
		byte b=12;
		byte c=21;
		byte d=(byte)(b+c);    //运算时会发生整型提升
		System.out.println(d);
		System.out.println(b+" "+c);
		System.out.println(Byte.MAX_VALUE+1);   //128
		//打印默认是以整型进行打印的
		
	}


	
	/**
	 * 字符数据类型
	 * char  2个字节   0-65535
	 * Unicode---表示的字符范围更广 包含ASCII码
	 * @param args [description]
	 */
	public static void main5(String[] args) {
		char ch='豆';
		System.out.println(ch);
		char ch1='a';
		System.out.println(ch1);
		char ch3=97;
		System.out.println(ch3);
	}




	/**
	 * 单精度的浮点型 float
	 * @param args [description]
	 */
	public static void main4(String[] args) {
		float a=12.3f;       //java 中不允许把一个double数据直接赋值为float型数据
		System.out.println(a);
	}




	/**
	 * 双精度浮点型
	 * @param args [description]
	 */
	public static void main3(String[] args) {
		
		System.out.println(Double.MAX_VALUE);
		double a=1.0;
		double b=2.0;
		System.out.println(a/b);
		
	}
	public static void main2(String[] args) {
		for(int i=0;i<args.length;i++){
			System.out.println(args[i]); //String[] args作用：输入时命令行参数
		}
		System.out.println("hahha");
	}



	/**
	 * 长整型
	 * @param args [description]
	 */
	public static void main1(String[] args) {
		long a=10L;
		System.out.println(a);
		System.out.println("最大值："+Long.MAX_VALUE);
        int c=20;
        int b=30;
        System.out.println(b+c);
        System.out.println("ahhaha"+b+c);
        //任何类型的数据 和 字符串拼接 输出结果为字符串

	}
}       
