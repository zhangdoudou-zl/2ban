#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
#include<string.h>
  

//void Print( int num)           //打印出一个数字的每一位
//{
//	if (num > 9) 
//	{
//		Print(num / 10);
//	}
//	printf("%d ", num % 10);
//}
//
//
//int main()
//{
//	 int num = 0;
//	scanf("%d", &num);
//	Print(num);
//	return 0;
//}




//int my_strlen(char *str)             //非递归 实现strlen
//{
//	int count = 0;
//	while (*str != '\0')
//	{
//		count++;
//	(str)++;
//	}
//	return count;
//}
//int main()
//{
//	char arr[] = "doudou";//数组名是首元素地址
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//	return 0;
//}




//int my_strlen(char *str)             //递归实现strlen
//{
//	if (*str != '\0')
//	{
//		return 1 + my_strlen(str+1);
//	}
//	else
//		return 0;
//}
//
//int main()
//{
//	char arr[] = "doudou";//数组名是首元素地址
//	int len = my_strlen(arr);
//	printf("%d\n", len);
//	return 0;
//}

//
//int main()          //非递归求n的阶乘
//{
//	int n = 0;
//	scanf("%d", &n);
//	int i = 0;
//	int ret = 1;
//	for (i = 1; i <= n; i++)
//	{
//		ret = ret*i;
//	}
//	printf("%d", ret);
//	return 0;
//}




//int Fac(int n)    //递归 求n的阶乘
//{
//	if (n<=1)
//  {
//	return 1;
//  }
//	else
//	{
//		return n*Fac(n - 1);
//	}
//}
//
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int ret = Fac(n);
//	printf("%d", ret);
//	return 0;
//}
   



//int Add(int num)    //输入一个数，输出这个数的每一位之和
//	if (num > 9)
//	{
//		return Add(num / 10) + num % 10;
//	}
//	else
//	{
//		return num;
//	}
//}
//int main()
//{
//	int num = 1234;
//	int n = Add(num);
//	printf("%d", n);
//	return 0;
//}




//int Pow(int n, int k)           //递归实现n的k次方
//{
//	if (k == 0)
//		return 1;
//	else if (k >= 1)
//	{
//		return n*Pow(n, k - 1);
//	}
//}
//int main()
//{
//	int n = 0;
//	int k = 0;
//	scanf("%d%d", &n,&k);
//	int num = Pow(n, k);
//	printf("%d\n", num);
//	return 0;
//}





//int main()                  非递归打印第n个斐波那契数
//{
//	int n = 0;
//	int a = 1;
//	int b = 1;
//	int c = 1;
//	scanf("%d", &n);
//	while (n > 2)
//	{
//		c = a + b;
//		a = b;
//		b = c;
//		n--;
//	}
//	printf("%d", c);
//
//
//	return c;
//}
// 




//int Fib(int n)                     //递归求斐波那契数
//{ 
//	if (n <= 2)
//	{
//		return 1;
//	}
//	else
//	{
//		return Fab(n - 1) + Fab(n - 2);
//	}
//}
//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int num = Fab(n);
//	printf("%d", num);
//	return 0;
//}




//void Reverse(char* str)       //逆序打印字符串
// {
//	     if (*str == '\0')
//		     {
//		       return;
//		    }
//	     Reverse(str + 1);
//	     printf("%c", *str);
//	 }
//
// int main()
// {
//	     char* arr = "abcd";
//	     Reverse(arr);
//	
//		     return 0;
// }