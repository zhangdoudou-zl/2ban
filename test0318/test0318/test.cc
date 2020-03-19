#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>
////创建书的类型

//struct Book
//{
//	char name[30];
//	double price;
//	char id[30];//[ISBN123456789];
//};
//int main()
//{
//	struct Book b1 = { "家有儿女",21.51,"ISBN123456789" };
//	struct Book b2 = { "武林外传", 32.55, "ISBN09887" };
//	printf("书名:%s\n", b1.name);
//	printf("价格:%lf\n", b1.price);
//	printf("书号%s\n", b1.id);
//	printf("书名:%s\n", b2.name);
//	printf("价格:%lf\n", b2.price);
//	printf("书号%s\n", b2.id);
//
//	return 0;
//}
//



//int main()
//{
//	if (age < 18)
//		printf("weichengnian");
//	else if (age >= 18 && age < 30);
//	printf("青年人");
//}
  

//int main()
//{
//	int a = 0;
//	int b = 2;
//
//	if (a == 1)
//
//	   if (b == 2)
//		   printf("hehe\n");
//
//	   else printf("haha\n");
//
//	return 0;
//}
	
//int main()
//{
//	int i = 1;
//	while (i <= 100)
//	{
//		if (i % 2 == 1)
//			printf("1-100奇数%d\n", i);
//		i++;
//	}
//	return 0;
//}


//int main()//求1-100之间3的倍数
//{
//	
//  int i = 1;
//	while (i <= 100)
//	{
//		if (i % 3 == 0)
//			printf("%d\n", i);
//		i++;
//	}
//	return 0;
//}
  


	
//int main()//三个数从大到小排序
//{
//			int x, y, z, t;
//			scanf("%d %d %d", &x, &y, &z);
//			if (x<y)
//			{
//				t = x; x = y; y = t;//x,y交换顺序
//			} 
//			if (x<z)
//			{
//				t = z; z = x; x = t;
//			}
//			if (y<z)
//			{
//				t = y; y = z; z = t;
//			}
//			printf("由大到小: %d %d %d\n", x, y, z);
//
//			return 0;
//		}
//int main()
//{
//	int i = 1;
//	while (i <= 100)
//	{
//		if (i % 3 == 0)
//			printf("%d\n",i);
//		i++;
//	}
//	return 0;
 


//int main()     //求两个数的最大公约数
//{
//	int m, n, temp, i;
//	printf("输入两个正整数，中间空一格:");
//	scanf("%d%d", &m, &n);
//	if (m<n)                                          //比较大小，使得m中存储大数，n中存储小数
//	{                                                 //交换m和n的值
//		temp = m;
//		m = n;
//		n = temp;
//	}
//	for (i = n; i>0; i--)                              //按照从大到小的顺序寻找满足条件的自然数
//	if (m%i == 0 && n%i == 0)
//	{                                                  //输出满足条件的自然数并结束循环
//		printf(" 最大公约数是 : %d\n",i);
//		break;
//	}
//
//	return 0;
//}



	

//int main()         //求100-200之间的素数
//{
//	int i = 0;
//	for (i = 100; i <= 200; i++)    //先找出来100到200的所有整数,都为i
//	{
//		int j = 0;
//		for (j = 2; j < i; j++)     //用i去对除了1和它本身以外的数求余
//		{
//			if (i%j == 0)
//				break;
//		}
//		if (j == i)
//		{
//
//			printf("%d ", i);
//		}
//	}
//	printf("\n");
//	return 0;
//}