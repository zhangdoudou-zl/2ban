#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>

//�ṹ��
//strcut-�ṹ��ؼ���
//ѧ��������
struct Stu
{   //����ѧ���������
	char name[20];
	char id[18];
	short age;
	char sex[5];
};
int main()
{
	struct Stu s1;//ѧ������s1
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

//typedef - ���Ͷ���- �����ض���
int main()
{
	int a = 10;
	//struct S s = {100, 'w', "bit", 3.14};
	//�ṹ�����.��Ա��
	//�ṹ��ָ��->��Ա��
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


//����ˮ��1ƿ��ˮ1Ԫ��2����ƿ���Ի�һƿ��ˮ����20Ԫ�����Զ�����ˮ�����ʵ�֣���
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



