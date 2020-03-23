#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
//int main()
//{
//	int arr[] = { 0 };
//	
//
//	int sz = sizeof (arr) / sizeof(arr[0]);
//	printf("sz=%d\n", sz);
//	return 0;
//}

//猜数字游戏

//#include <stdlib.h>
//#include <time.h>
//void menu()
//{
//	printf("******************************\n");
//	printf("****   1.play    0.exit   ****\n");
//	printf("******************************\n");
//}
//    //RAND_MAX-32676
//    //rand函数返回-32676之间的随机数
//    //time函数
//    //返回一个时间戳
//    //时间戳指的是：计算机在调用time函数的这个时间和计算机起始时间（1970年0时0分0秒）之间的一个差值，单位是秒 
//void game()
//{
//	int guess = 0;
//	//1.电脑生成一个随机数
//	//只调用一次srand，不能频繁调用
//	//当给定数字变化，生成的值才会变化
//	int ret = rand() % 100 + 1;           //%100之后余数在0-99之间
//	//printf("%d\n", ret);
//	while (1)
//	{
//		printf("请猜数字\n");
//		scanf("%d", &guess);
//		if (guess > ret)
//		{
//			printf("猜大了\n");
//		}
//		else if (guess < ret)
//		{
//			printf("猜小了\n");
//		}
//		else
//		{
//			printf("猜对了\n");
//			break;
//		}
//	}
//}
//
//
//	//2.猜数字
//	
//int main()
//
//{
//	int input = 0;
//	srand((unsigned int)time(NULL));
//	
//	do
//	{
//		menu();
//		printf("请选择");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			game();
//				break;
//		case 0:
//				printf("退出游戏\n");
//				break;
//		default:
//		     	printf("选择错误\n");
//				break;
//
//
//		}
//	} while (input);
//
//	return 0;
//}
//


//int main()          //找数字下标（低效率版)
//{
//	int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);   //计算元素个数
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		if (arr[i] == k)
//		{
//			printf("找到了,下标是%d\n",i); 
//		break;
//		}
//	}
//	if (i == sz)
//	{
//		printf("找不到了\n");
//	}
//	
//	return 0;
//}


//int main()          //找数字下标（优化版)
//{
//	int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);   //计算元素个数
//	int left = 0;
//	int right = sz - 1;
//	while (left<=right)
//	{
//		int mid = (left + right) / 2;
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
//			printf("找到了，下标是%d\n", mid);
//			break;
//		}
//           
//	}
//	if (left > right)
//	{
//		printf("找不到了\n");
//	}
//	return 0;
//}
