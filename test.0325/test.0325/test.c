#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>


//#include<string.h>
//int main()
//{
//	int password[20] = { 0 };
//	int i = 0;
//	int input = 0;
//	
//	for (i = 0; i < 3; i++)
//	{
//		printf("请输入密码");
//		scanf("%s", password);
//		if (0==strcmp(password,"123456")) //两个字符串比较大小不能直接用==，而应该使用stecmp（），string compare		
//		{	printf("登陆成功\n");
//		break;
//
//		}
//		else
//		{
//			printf("密码错误\n");
//		}
//		if (i == 3)
//		{
//			printf("三次密码输入错误， 退出程序");
//		}
//	}
//	return 0;
//}




//int main()
//{
//	int n = 0;
//	int flag = 1;
//	float sum = 0;
//	for (n = 1; n < 100; n++)
//	{
//		sum += (1.0 / n)*flag;   //除号来说，两边的操作数都是整数，执行整数除法。只要有一个数是浮点数，执行的就是浮点操作
//		flag = -flag;
//	}
//	printf("sum=%f",sum);
//	return 0;
//}




//int table()             //调用函数打印九九乘法表
//{
//	int a = 1;
//	int b = 1;
//	for (a = 1; a <= 9; a++)
//	{
//		for (b = 1; b <=a; b++)
//		{
//			printf("%d*%d=%-3d", a, b, a*b);
//			
//		}
//		printf("\n");
//
//	}
//	return 0;
//}
//
//int main()
//{
//	
//	table();
//	
//	return 0;
//}


//int main()
//{
//	int i, j;
//	for (i = 1; i <= 9; i++)
//	{
//		for (j = 1; j <= 9; j++)
//		{
//			while (j < i)                         //打印出右上角为直角三角的九九乘法表
//			{
//				printf("\t");
//				j++;
//			}
//			printf("%d*%d=%d\t", i, j, i*j);
//		}
//		printf("\n");
//	}
//	return 0;
//}

