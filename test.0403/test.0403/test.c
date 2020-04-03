#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
 

//
//void reverse(char*str)
//{
//	int len = strlen(str);
//	char* left =str;
//	char* right = str + len - 1;
//	while (left < right)
//	{
//		char tmp = *left;
//		*left = *right;
//		*right = tmp;
//		left++;
//		right--;
//	}
//}
//int main()
//{
//	char arr[100] = { 0 };
//	gets(arr);
//	reverse(arr);
//	printf("%s\n", arr);
//
//	return 0;
//}

//
//int main()
//{
//	int a = 0;
//	int n = 0;
//	int i = 0;
//	int ret = 0;
//	int sum = 0;
//	scanf("%d %d", &a, &n);
//	for (i = 0; i < n; i++)
//	{
//		ret=ret*10 + a;
//		sum += ret;
//
//	}
//	printf("%d\n", sum);
//	return 0;
//}




//#include<math.h>
//int main()
//{
//	int i = 0;
//	for (i = 0; i <= 100000; i++)
//	{
//		int sum = 0;
//		int count = 1;
//		//判断i是非为水仙花数
//		//1.计算i的位数
//		int tmp = i;
//		while (tmp/=10)
//		{
//			count++;
//		}
//		//2.得到i的每一位，计算每一位的位数次方和
//		tmp = i;
//		while (tmp)
//		{
//			sum+=pow(tmp % 10, count);
//			tmp /= 10;
//		}
//		//3.判断 
//		if (sum == i)
//		{
//			printf("%d\n", i);
//		}
//	}
//	return 0;
//}



//打印下图
//      *
//     ***
//    *****
//   *******
//  *********
// ***********
//*************
// *********** 
//  *********  
//   *******   
//    *****
//     ***
//      *
int main()
{
	int line = 0;
	scanf("%d", &line);
	//打印上部分
	int i = 0;
	for (i = 0; i < line; i++)
	{
		//打印一行
		//先打印空格
		int j = 0;
		for (j = 0; j < line - 1 - i; j++)
		{
			printf(" ");
		}
		//打印
		for (j = 0; j <2*i+1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	//打印下部分
	for (i = 0; i < line-1; i++)
	{
		//打印一行
		int j = 0;
		//先打印空格
		for (j = 0; j <= i; j++)
		{
			printf(" ");
		}
		for (j = 0; j < 2 * (line - 1-i)-1; j++)
		{
			printf("*");
		}
		printf("\n");
	}
	return 0;
}