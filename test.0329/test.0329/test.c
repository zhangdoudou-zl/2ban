#define _CRT_SECURE_NO_WARNINGS 1
#include<stdio.h>
//void init(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = 0;
//	}
//}
//void reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left < right)
//	{
//		int tmp = 0;
//		tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//	}
//}
//void Print(int arr[], int sz)
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
//	int arr[10] = { 1, 3,5,7,9,11,13,15,17,19};
//	int sz = sizeof(arr) / sizeof(arr[0]);
//	printf("ԭ����\n");
//	Print(arr, sz);
//	reverse(arr, sz);
//	printf("��������\n");
//	Print(arr, sz);
//	init(arr, sz);
//	printf("��ʼ������\n");
//	Print(arr, sz);
// return 0;
//}



//
//void Init(int arr[], int sz)
//{
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		arr[i] = i;
//	}
//}
//
//void Reverse(int arr[], int sz)
//{
//	int left = 0;
//	int right = sz - 1;
//	while (left < right)
//	{
//		int tmp = arr[left];
//		arr[left] = arr[right];
//		arr[right] = tmp;
//		left++;
//		right--;
//	}
//}
//
//void Print(int arr[], int sz)
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
//	int arr[10] = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
//	int sz = sizeof(arr) / sizeof(arr[10]);
//	
//	printf("ԭ���飺\n");
//	Print(arr, sz);
//	Init(arr, sz,'0');
//	printf("��ʼ�����飺\n");
//	Print(arr, sz);
//	Reverse(arr, sz);
//	printf("�������飺\n");
//	Print(arr, sz);
//	return 0;
//}





//int main()
//{
//	int a = 10;
//	short s = 5;
//	printf("%d\n", sizeof(s = a + s));
//	printf("%d\n", sizeof(short));
//	printf("%d\n", s);
//	return 0;
//}

//int i;
//int main()
//{
//	i--;
//	if (i > sizeof(i))
//	{
//		printf(">\n");
//	}
//	else
//	{
//		printf("<\n");
//	}
//	return 0;
//}



//int main()
//{
//	int flag = 0;            //'!'�߼�������
//	if (flag)
//	{
//		printf("hehe\n");
//	}
//	if (!flag)
//	{
//		printf("haha\n");
//	}
//	return 0;
//}


//�ṹ��

//struct stu
//{
//	char name[20];
//	int age;
//	char tele[12];
//	char sex[5];
//};
//int main()
//{
//	struct stu s = { "����",20,"12123138102", "��" };     //s��һ���ṹ�����
//	//�ṹ�����.��Ա��
//	//�ṹ��ָ��->��Ա�� 
//	
//	//strcpy(s.name, "zhanglin");                        //strcpy�ַ�������
//	//printf("%s\n", s.name);
//   struct stu* ps = &s;
//   printf("%s\n", ps->name);
//   printf("%d\n", ps->age);
//	return 0;
//}


//// ��������
//int main()
//{
//	char a = 3;
//	//00000000000000000000000000000011
//    //00000011--a   �ض�
//	char b = 127;
//	//00000000000000000000000001111111
//	//01111111--b
//	char c = a + b;//������Ϊ���������
//	//00000000000000000000000000000011
//	//00000000000000000000000001111111
//	//10000010--c 
//	//11111111111111111111111110000010--����  �����������ǰ��ձ������������͵ķ���λ�������� ��
//	//11111111111111111111111110000001--����
//	//10000000000000000000000001111110--ԭ��
//	//-126
//	printf("%d\n", c); //%d
//	return 0;
//}



//int main()
//{
//	int num = 10;
//	int count = 0;//����
//	while (num)
//	{
//		if (num % 2 == 1)
//			count++;
//		num = num / 2;
//	}
//	printf("��������1�ĸ��� = %d\n", count);
//	return 0;
//}


//void Printbit(int num)
//{
//	for (int i = 31; i >= 1; i -= 2)
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//	printf("����λ����\n");
//
//	for (int i = 30; i >= 0; i -= 2)
//	{
//		printf("%d ", (num >> i) & 1);
//	}
//	printf("ż��λ����\n");
//}
//int main()
//{
//	int num = 11;
//	Printbit(num);
//	return 0;
//}

//void Dif_bit(int a, int b,int c)
//{
//	c = a^b;
//	int i = 0;
//	int count = 0;
//	for (i = 0; i < 32;i++)
//	if (c >> i & 1 == 1)
//		count++;
//	printf("%d\n", count);
//}
//
//int main()
//{  
//	int a = 0;
//	int b = 0;
//	int c = a^b;
//	scanf("%d%d", &a, &b);
//	Dif_bit(a, b, c);
//	return 0;
//}



int main()
{ 
	int a = 10;
	int b = 11;
	a = a^b;
	b = a^b;
	a = a^b;
	printf("a=%d b=%d", a, b);

	return 0;
}

