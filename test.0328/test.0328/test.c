#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>


//void BubbleSort(int arr[],int sz)
//{
//	int i = 0;
//	//确定冒泡排序的趟数
//	for (i = 0; i < sz - 1; i++)
//	{
//		 //一趟冒泡排序
//		int flag = 0;
//		int j = 0;
//		for (j = 0; j < sz-1-i; j++)
//		{ 
//			if (arr[j]>arr[j + 1])
//			{
//				int tmp = arr[j];
//				arr[j] = arr[j + 1];
//				arr[j + 1] = tmp;
//				flag = 0;
//			}
//		}
//		if (flag == 1)  //说明上面没有交换过元素，跳出
//		{
//			break;
//		}
//	}
//}
//void Print(int*arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//int main()
//{
//	int arr[] = { 10,9,8,7,6,5,4,3,2,1 };
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	Print(arr, sz);
//	BubbleSort(arr,sz);
//	Print(arr,sz);
//	return 0;
//}





//void Print(int*arr, int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//	printf("\n");
//}
//
//int main()
//{
//	int arr1[] = { 1, 2, 3, 4 };
//	int arr2[] = { 4, 5, 6, 7 };
//	int sz = sizeof(arr1) / sizeof(arr1[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{                        //交换两个数组的内容
//		int tmp = 0;
//		tmp = arr1[i];
//		arr1[i] = arr2[i];
//		arr2[i] = tmp;
//	}
//	Print(arr1,sz);
//
//		Print(arr2,sz);
//	return 0;
//}



