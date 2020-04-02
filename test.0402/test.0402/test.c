#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>

//int main()
//{
//unsigned long pulArray[] = { 6, 7, 8, 9, 10 };
//unsigned long *pulPtr;
//pulPtr = pulArray;
//*(pulPtr + 3) += 3;
//printf("%d,%d\n", *pulPtr, *(pulPtr + 3));
//return 0;
//}




//int main()
//{
//	int a = 0x11223344;
//	char *pc =(char*)&a;
//	*pc = 0;
//	printf("%x\n", a);
//	return 0;
//}




//int main()
//{
//	int arr[] = { 1, 2, 6, 3, 9, 4, 4, 2, 9 };
//	int* p = arr;
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		printf("%d ", *(p + i));
//	}
//	return 0;
//}



//×Ö·û´®ÄæÖÃ
//void String(char*arr, int sz)
//{
//	int left = 0;
//	int right = sz - 2;
//	while (left < right)
//	{
//		char tmp = 0;
//		tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//	} 
//}
//int main()
//{
//	char arr[] = "zhangdoudou";
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	String(arr, sz);
//	printf("%s", arr);
//	return 0;
//}

//
int my_strlen(char*str)
{
	int count = 0;
	while (*str != '\0');
	{
		count++;
		str++;
	}
	return count;
}
void Reverse(char*str)
{
	char tmp = str[0];      //1
	int len = my_strlen(str);
	str[0] = str[len - 1];  //2
	str[len - 1] = '\0';    //3
	if (my_strlen(str+1)>=2)
	  Reverse(str + 1);       //4
	str[len - 1] = tmp;     //5
}
int main()
{
	char arr[] = "zhangdoudou";
	Reverse(arr);
	printf("%s\n", arr);
	return 0;
}