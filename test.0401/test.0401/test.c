#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
// 二进制数中一的个数   三种方法
 //方法一
//int Number_one(int a)
//{
//	int i = 0;
//	int count = 0;
//	for (i = 0; i < 32; i++)
//	{
//		if ((a >> i) & 1 == 1)
//			count++;
//	}
//	return count;
//}
//int main()
//{
//	int a = 11;
//	int ret=Number_one(a);
//	printf("二进制数中1的个数%d\n", ret);
//
//	return 0;
//}


//方法二
//int main()
//{
//	int a = 11;
//	int i = 0;
//	int count = 0;//计数
//	while (a)
//	{
//		count++;
//		a = a&(a - 1);
//	}
//	printf("二进制中1的个数 = %d\n", count);
//	return 0;
//}


 //方法三
//int main()
//{
//	unsigned int a = -1;
//	int count = 0;
//	while (a)
//	{
//		if (a % 2 == 1)
//		{
//			count++;
//		}
//		a /= 2;
//	}
//	printf("二进制数中1的个数=%d\n", count);
//	return 0;
//}




//指针-指针实现strlen   (之前用递归，计数器实现)
int my_strlen(char* str)
{
	char* start = str;
	char* end = str;
	while (*end != '\0')
	{
		end++;
	}
	return end - start;
}

int main()
{
	int len = my_strlen("abc");
	//[a][b][c][\0]
	printf("%d\n", len);
	return 0;
}




//把数组名当成地址存放到一个指针中
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
//	int *p = arr; //指针存放数组首元素的地址
//	int i = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	for (i = 0; i < sz; i++)
//	{
//		printf("&arr[%d] = %p ------ p+%d = %p\n",  &arr[i],  p + i);
//	}
//		return 0;
//}




//int main()
//{
//	int arr[10] = { 0 };
//	printf("%p\n", arr);//int*
//	printf("%p\n", arr + 1);
//
//	printf("%p\n", &arr[0]);//int*
//	printf("%p\n", &arr[0] + 1);
//
//	printf("%p\n", &arr);// 数组指针类型
//	printf("%p\n", &arr + 1);
//
//
//	//数组名是数组首元素的地址
//	//但是有两个例外：
//	//a. sizeof(数组名)，这里的数组名，表示整个数组，sizeof(数组名)计算的是整个数组的大小
//	//b. &数组名，这里的数组名，表示整个数组，&数组名 取出的是整个数组的地址
//	
//	return 0;
//}