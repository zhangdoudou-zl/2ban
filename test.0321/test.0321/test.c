#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>


//int main()
//{
//	int i = 0;
//	while (i < 10)
//	{
//		if (i == 5)
//			continue;
//		printf("%d\n", i);
//		i++;
//	}
//	return 0;
//}

//int main()
//{
//	printf("加入比特\n");
//	int line = 0;
//	while (line <= 20)
//	{
//		line++;
//		printf("我要继续努力敲代码\n");
//	}
//	if (line > 20)
//		printf("成为一名优秀的程序媛\n");
//	return 0;
//}


//int main()
//{
//	int i = 0;
//	while (i<10)
//	{
//		if (i == 5)
//			continue;
//			printf("%d ", i);
//		i++;
//	}
//	return 0;
//}
//打印结果：0 1 2 3 4 



//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		i = i + 1;
//		if (i == 5)
//			continue;
//		printf("%d ", i);
//	}
//	return 0;
//}
// 打印结果2 3 4 6 7 8 9 10 11


//int func(int a)
//{
//	int b;
//	switch (a)
//	{
//	case 1: b = 30;
//	case 2: b = 20;
//	case 3: b = 16;
//	default: b = 0;
//	}
//	return b;
//}
//int main()
//{
//	int ret = func(1);
//	printf("%d", ret);
//	return 0;
//}
//结果输出为0

//

//int main()
//{
//	int x, y, z, t;
//	scanf("%d %d %d", &x, &y, &z);
//	if (x<y)
//	{
//		t = x; x = y; y = t;
//	}
//	if (x<z)
//	{
//		t = z; z = x; x = t;
//	}
//	if (y<z)
//	{
//		t = y; y = z; z = t;
//	}
//	printf("由大到小: %d %d %d\n", x, y, z);
//	return 0;
//}
//int main()
//{
//	int a = 12;
//	int b = 8;
//	int r = 0;
//	
//	while (r=a%b)
//
//	{
//		
//		a = b;
//		b = r;
//	}
//
//	printf("最大公约数：%d", b);
//	return 0;
//}
//int main()
//{ 
//	int i = 100;
//	
//	while (i < 200)
//	{
//		int j = 2;
//		while (i>j)
//		{
//
//			if (i%j == 0) //j试除i
//			{
//				break;   //判断i不是素数
//			}
//			j++;
//		}
//		if (i == j)
//		{
//			printf("%d\n", i);// 判断i是素数
//			
//		}
//		i++;
//	}
//		
//	return 0;
//}


//#include <math.h>
//int main()
//{ 
//	int i = 101;
//	int count = 0;
//	while (i < 200)
//	{
//		int j = 2;
//		while (sqrt(i)>=j)
//		{
//
//			if (i%j == 0) //j试除i
//			{
//				break;   //判断i不是素数
//			}
//			j++;
//		}
//		if (j>sqrt(i))
//		{
//			count++;
//			printf(" %d\n", i);// 判断i是素数
//			
//		}
//		
//		i=i+2;//偶数不会是素数
//
//	}
//	printf("count:%d\n", count);
//		
//	return 0;
//} 


//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)//E0F 文件结束标志-放在文件末尾
//	{
//		putchar(ch);
//	}
//	return 0;
//}

//int main()
//{
//	char input[20] = { 0 };
//	int ch = 0;
//	printf("请输入密码");
//	scanf("%s", input);
//	printf("确认密码");
//	while ((ch = getchar()) != '\n')
//	{
//		;
//	}
//	ch = getchar();
//	if (ch == 'Y')
//	{
//		printf("确认成功");
//	}
//	else if (ch='N')
//	{printf("确认失败"); }
//	return 0;
//}

//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch < 'A' || ch > 'O')
//			continue;
//		putchar(ch);
//	}
//	return 0;
//}
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//
//	return 0;
//}
//int main()
//{
//	for (;;)         //判断部分省略意味着判断条件恒为真
//	{
//		printf("hehe");
//	}
//	return 0;
//}

//int main()
//{
//int x, y;
//for (x = 0, y = 0; x<2 && y<5; ++x, y++) //x=0,1时才能输出
//{
//	printf("hehe\n");
//}
//return 0;
//}
  

//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int ret = 1;
//	int i  = 1;
//	for (i = 1; i <= n; i++)
//	{
//		ret = ret*i;
//		
//	}
//	printf("n的阶乘 %d\n", ret);
//	return 0;
//}

//

int main()
{
	int n = 0;
	int ret = 1;
	int i = 1;
	int sum = 0;
	for (n = 1; n <= 3; n++)
	{
		
			ret = ret*n; //优化
		sum = sum + ret;
	}
	printf("阶乘的和 %d\n", sum);
	return 0;
}
