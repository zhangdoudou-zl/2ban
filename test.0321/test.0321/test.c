#define _CRT_SECURE_NO_WARNINGS 1
#include <stdio.h>


//int main()
//{
//	int i = 0;
//	while (i < 10)
//	{
//		if (i == 5)
//			continue;
//		printf("%d\n", i);
//		i++;
//	}
//	return 0;
//}

//int main()
//{
//	printf("�������\n");
//	int line = 0;
//	while (line <= 20)
//	{
//		line++;
//		printf("��Ҫ����Ŭ���ô���\n");
//	}
//	if (line > 20)
//		printf("��Ϊһ������ĳ�����\n");
//	return 0;
//}


//int main()
//{
//	int i = 0;
//	while (i<10)
//	{
//		if (i == 5)
//			continue;
//			printf("%d ", i);
//		i++;
//	}
//	return 0;
//}
//��ӡ�����0 1 2 3 4 



//int main()
//{
//	int i = 1;
//	while (i <= 10)
//	{
//		i = i + 1;
//		if (i == 5)
//			continue;
//		printf("%d ", i);
//	}
//	return 0;
//}
// ��ӡ���2 3 4 6 7 8 9 10 11


//int func(int a)
//{
//	int b;
//	switch (a)
//	{
//	case 1: b = 30;
//	case 2: b = 20;
//	case 3: b = 16;
//	default: b = 0;
//	}
//	return b;
//}
//int main()
//{
//	int ret = func(1);
//	printf("%d", ret);
//	return 0;
//}
//������Ϊ0

//

//int main()
//{
//	int x, y, z, t;
//	scanf("%d %d %d", &x, &y, &z);
//	if (x<y)
//	{
//		t = x; x = y; y = t;
//	}
//	if (x<z)
//	{
//		t = z; z = x; x = t;
//	}
//	if (y<z)
//	{
//		t = y; y = z; z = t;
//	}
//	printf("�ɴ�С: %d %d %d\n", x, y, z);
//	return 0;
//}
//int main()
//{
//	int a = 12;
//	int b = 8;
//	int r = 0;
//	
//	while (r=a%b)
//
//	{
//		
//		a = b;
//		b = r;
//	}
//
//	printf("���Լ����%d", b);
//	return 0;
//}
//int main()
//{ 
//	int i = 100;
//	
//	while (i < 200)
//	{
//		int j = 2;
//		while (i>j)
//		{
//
//			if (i%j == 0) //j�Գ�i
//			{
//				break;   //�ж�i��������
//			}
//			j++;
//		}
//		if (i == j)
//		{
//			printf("%d\n", i);// �ж�i������
//			
//		}
//		i++;
//	}
//		
//	return 0;
//}


//#include <math.h>
//int main()
//{ 
//	int i = 101;
//	int count = 0;
//	while (i < 200)
//	{
//		int j = 2;
//		while (sqrt(i)>=j)
//		{
//
//			if (i%j == 0) //j�Գ�i
//			{
//				break;   //�ж�i��������
//			}
//			j++;
//		}
//		if (j>sqrt(i))
//		{
//			count++;
//			printf(" %d\n", i);// �ж�i������
//			
//		}
//		
//		i=i+2;//ż������������
//
//	}
//	printf("count:%d\n", count);
//		
//	return 0;
//} 


//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)//E0F �ļ�������־-�����ļ�ĩβ
//	{
//		putchar(ch);
//	}
//	return 0;
//}

//int main()
//{
//	char input[20] = { 0 };
//	int ch = 0;
//	printf("����������");
//	scanf("%s", input);
//	printf("ȷ������");
//	while ((ch = getchar()) != '\n')
//	{
//		;
//	}
//	ch = getchar();
//	if (ch == 'Y')
//	{
//		printf("ȷ�ϳɹ�");
//	}
//	else if (ch='N')
//	{printf("ȷ��ʧ��"); }
//	return 0;
//}

//int main()
//{
//	int ch = 0;
//	while ((ch = getchar()) != EOF)
//	{
//		if (ch < 'A' || ch > 'O')
//			continue;
//		putchar(ch);
//	}
//	return 0;
//}
//int main()
//{
//	int arr[10] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
//	int i = 0;
//	for (i = 0; i < 10; i++)
//	{
//		printf("%d ", arr[i]);
//	}
//
//	return 0;
//}
//int main()
//{
//	for (;;)         //�жϲ���ʡ����ζ���ж�������Ϊ��
//	{
//		printf("hehe");
//	}
//	return 0;
//}

//int main()
//{
//int x, y;
//for (x = 0, y = 0; x<2 && y<5; ++x, y++) //x=0,1ʱ�������
//{
//	printf("hehe\n");
//}
//return 0;
//}
  

//int main()
//{
//	int n = 0;
//	scanf("%d", &n);
//	int ret = 1;
//	int i  = 1;
//	for (i = 1; i <= n; i++)
//	{
//		ret = ret*i;
//		
//	}
//	printf("n�Ľ׳� %d\n", ret);
//	return 0;
//}

//

int main()
{
	int n = 0;
	int ret = 1;
	int i = 1;
	int sum = 0;
	for (n = 1; n <= 3; n++)
	{
		
			ret = ret*n; //�Ż�
		sum = sum + ret;
	}
	printf("�׳˵ĺ� %d\n", sum);
	return 0;
}
