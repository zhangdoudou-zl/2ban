#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

//#include <string.h>
//int main()
//{
//	char arr1[20] = "########";
//	char arr2[] = "bit";
//	strcpy(arr1, arr2);                  //字符串拷贝，/0也会被拷贝
//	printf("%s\n", arr1);
//	return 0;
//}




//int main()
//{
//	char arr[] = "hello bit";
//	memset(arr, '*', 5);                    //内存设置
//	printf("%s\n",arr);
//	return 0;
//}



  
//
//int Swap(int *pa, int *pb)    //调用函数完成两个数字的交换
//{
//	int temp = 0;
//	temp = *pa; //等价于temp=a;
//	*pa = *pb;
//	*pb = temp;
//	
//	return 0;
//
//}
//int main()
//{
//	int a = 10;
//	int b = 20;
//	printf("a=%d b=%d\n", a, b);
//	Swap(&a, &b);
//	printf("a=%d b=%d\n", a, b);
//
//	return 0;
//}





//int is_leap_year(int y)                       //调用函数找出润年
//{
//	
//	if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
//	{
//		return 1;
//	}
//	else
//	{
//		return 0;
//	}
//}
//int main()
//{
//	int count = 0;
//	int year = 0;
//	for (year = 1000; year < 2001; year++)
//	{
//		if (is_leap_year(year) == 1)
//		{   
//			count++;
//			printf("%d ", year);
//			
//		}
//	}
//	printf("count=%d\n", count);
//	return 0;
//}





//#include <math.h>  //sqrt引用的头文件
//int is_prime(int n)
//{
//	//判断n是否为素数
//	int i = 0;
//	for (i = 2; i < sqrt(n); i++)
//	{
//		if (n%i == 0)
//		{
//			return 0;
//		}
//	}
//	return 1;
//}
//
//int main()
//{
//	int count = 0;
//	int i = 0;
//	for (i = 100; i <= 200; i++)
//	{
//		if (is_prime(i) == 1)
//		{
//			printf("%d\n", i);
//			count++;
//		}
//	}
//	printf("%d\n", count);
//	return 0;
//}




//int binary_search(int arr[], int k,int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	int mid = (left + right) / 2;
//	while (left <= right)
//	{
//		if (arr[mid] < k)
//		{
//			left = mid + 1;
//		}
//		else if (arr[mid]>k)
//		{
//			right = mid - 1;
//		}
//		else
//		{
//			return mid;
//		}
//	 }
//	return -1;
//
//}
//int main()
//{
//	int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int k = 0;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//
//	scanf("%d", &k);
//	//数组传参的时候，传过去一个数组名，本质上传过去的是数组首元素的地址
//    int ret=binary_search(arr,k,sz);      //二分查找     找到返回下标，找不到返回-1
//	if (ret == -1)
//	{
//		printf("找不到\n");
//	}
//	else
//	{
//		printf("找到了，下标是%d\n", ret);
//	}
//	return 0;
//}