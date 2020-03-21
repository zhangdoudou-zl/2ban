#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
//int main()
//{
//	int a = 0, b = 0;
//	for (a = 1, b = 1; a <= 100; a++)
//	{
//		if (b >= 20) break;
//		if (b % 3 == 1)
//		{
//			b = b + 3;
//			continue;
//		}
//		b = b - 5;
//	}
//	printf("%d\n", a);
//	return 0;
//}

//int main()
//{
//	int n = 0;
//	int count = 0;
//	while (n < 100)
//	{
//		if (n % 10 == 9)    //个位为9的数
//		{
//			printf("%d\n", n);
//			count++;
//		}
//		
//		n++;
//		if (n / 10 == 9)   //十位为9的数
//		{
//			printf("%d\n", n);
//			count++;
//
//		}
//		n++;
//	}
//	printf("count= %d\n", count);
//	return 0;
//}                                //×××

//int main()
// {
//	int k, times = 0;
//	for (int i = 1; i < 101; i++) 
//	{                                   //将循环次数限定在[1,100]
//		k = i;
//		while (k != 0) 
//		{
//			if (k % 10 == 9) 
//		  {                              //判断k的个位上是否有9，
//				times++;
//		   }
//			k = k / 10;//判断k的十位是否有9，若有，则重新进入while循环
//		}
//	}
//	printf("出现%d次数字9\n", times);
//	return 0;
//}
//int main()
//{
//	int i, flag = 1;
//	float sum = 0.0;
//	for (i = 1; i <= 100; i++)
//	{
//		sum = sum + flag*(1.0 / i);
//		flag = -flag;
//	}
//	printf("sum is %f\n", sum);
//	
//	return 0;
//}                                 //计算1-1/2+1/3-1/4+...-1/100;


//int main()
//{
//	int arr[10] = {0};
//	int i = 0;
//	int max = 0;
//	printf("输入十个数");
//	for (i = 0; i < 10; i++)
//	{
//		scanf("%d", &arr[i]);
//	}
//	for (i = 0; i < 10; i++)
//	{
//		if (arr[i]>max)
//		{
//			max = arr[i];
//			
//		}
//			
//	}
//	printf("max= %d\n", max);
//
//	return 0;
//}                                  //输入十个数输出其中最大的数

int main()
{
	int i, j;
	for (i = 1; i <= 9; i++)
	{
		for (j = 1; j <= 9; j++)
		{
			if (j>i)
				//打印八个空格，去掉空格就是右上三角形 
				printf("        ");
			else
				printf("%d*%d=%2d  ", i, j, i*j);
		}

		printf("\n");
	}

	return 0;
}
