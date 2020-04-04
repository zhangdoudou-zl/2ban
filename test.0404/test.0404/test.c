#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//结构体
//strcut-结构体关键字
//学生的类型
struct Stu
{   //描述学生相关属性
	char name[20];
	char id[18];
	short age;
	char sex[5];
};
int main()
{
	struct Stu s1;//学生对像s1
	return 0;
}



struct S

{
	int a;
	char c;
	char arr[10];
	double d;
};
typedef struct T
{
	char buf[20];
	struct S s;
	int *p;
}T;

//typedef - 类型定义- 类型重定义
int main()
{
	int a = 10;
	//struct S s = {100, 'w', "bit", 3.14};
	//结构体变量.成员名
	//结构体指针->成员名
    T st = { "hello bit", {1000, 'b', "abcdef", 4.4}, &a};
	T* pt = &st;
	printf("%s\n", pt->buf);
	printf("%lf\n", pt->s.d);
	//printf("%s\n", st.buf);
	//printf("%d\n", st.s.a);
	//printf("%c\n", st.s.c);
	//printf("%s\n", st.s.arr);
	//printf("%lf\n", st.s.d);
	//printf("%d\n", *(st.p));


	//struct T st2;



	return 0;

}


//喝汽水，1瓶汽水1元，2个空瓶可以换一瓶汽水，给20元，可以多少汽水（编程实现）。
int main()
{
	int money = 20;
	int sum = 20;
	int empty = 20;
	while (empty > 1)
	{
		sum+=empty / 2;
		empty = empty / 2 + empty % 2;
	}
	printf("%d\n", sum);
	return 0;
}



