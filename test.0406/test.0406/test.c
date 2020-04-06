#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
// int main()
//{
//	int n = 0;
//	scanf("%d", &n);//3
//	1!+2!+3!
//    1+2+6 = 9
//	int i = 0;
//	int ret = 1;
//	int j = 0;
//	int sum = 0;
//	for (j = 1; j <= n; j++)
//
//	{
//		计算j的阶乘
//		ret = 1;
//		for (i = 1; i <= j; i++)
//		{
//			ret *= i;
//		}
//		sum += ret;
//	}
//	printf("%d\n", sum);
//	return 0;
//}



// int main()
//
// {
// 	int n = 0;
// 	scanf("%d", &n);//3
// 	1!+2!+3!
// 	1+2+6 = 9
// 	int i = 0;
// 	int ret = 1;
// 	int j = 0;
// 	int sum = 0;
// 	for (j = 1; j <= n; j++)
// 	{
// 		ret *= j;
// 		sum += ret;
// 	}
// 	printf("%d\n", sum);
// 	return 0;
// }
//
// 
//
//
//
//#include <string.h>
// void my_strcpy(char* dest, char* src)
// {
// 	while (*src != '\0')
// 	{
// 		*dest = *src;
// 		dest++;
// 		src++;
// 	}
// 	*dest = *src;
// }
//
//
//
// void my_strcpy(char* dest, char* src)
// {
// 	while (*src != '\0')
// 	{
// 		*dest++ = *src++;
// 	}
// 	*dest = *src;
// }
//
//
// void my_strcpy(char* dest, char* src)
// {
// 	if ((dest != NULL) && (src != NULL))
// 	{
// 		while (*dest++ = *src++)
// 		{
// 			;
// 		}
// 	}
// }



//#include <assert.h>
// void my_strcpy(char* dest, const char* src)
// {
// 	assert(dest != NULL);//断言
//    assert(src != NULL);//断言
// 	while (*dest++ = *src++)
// 	{
// 		;
// 	}
// }




// char* my_strcpy(char* dest, const char* src)
// {
// 	char *ret = dest;
// 	assert(dest != NULL);//断言
// 	assert(src != NULL);//断言
// 	//把src指向的字符串拷贝到dest指向的空间中，包含'\0'
// 	while (*dest++ = *src++)
//	{
// 		;
// 	}
// 	return ret;//返回目的地的起始地址
// }

 
// int main()
// {
// 	char arr1[20] = "######";
// 	char arr2[] = "abcdef";
// 	printf("%s\n", my_strcpy(arr1, arr2));
// 	return 0;
// }



 int my_strlen(const char* str)
 {
	 int count = 0;
	 assert(str != NULL);
	 while (*str != '\0')
	 {
		 count++;
		 str++;
	 }
	 return count;
 }


 int main()
 {
	 char arr[] = "abcdef";
	 int len = my_strlen(arr);
	 printf("%d\n", len);
	 return 0;
 }