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

//��������Ϸ

//#include <stdlib.h>
//#include <time.h>
//void menu()
//{
//	printf("******************************\n");
//	printf("****   1.play    0.exit   ****\n");
//	printf("******************************\n");
//}
//    //RAND_MAX-32676
//    //rand��������-32676֮��������
//    //time����
//    //����һ��ʱ���
//    //ʱ���ָ���ǣ�������ڵ���time���������ʱ��ͼ������ʼʱ�䣨1970��0ʱ0��0�룩֮���һ����ֵ����λ���� 
//void game()
//{
//	int guess = 0;
//	//1.��������һ�������
//	//ֻ����һ��srand������Ƶ������
//	//���������ֱ仯�����ɵ�ֵ�Ż�仯
//	int ret = rand() % 100 + 1;           //%100֮��������0-99֮��
//	//printf("%d\n", ret);
//	while (1)
//	{
//		printf("�������\n");
//		scanf("%d", &guess);
//		if (guess > ret)
//		{
//			printf("�´���\n");
//		}
//		else if (guess < ret)
//		{
//			printf("��С��\n");
//		}
//		else
//		{
//			printf("�¶���\n");
//			break;
//		}
//	}
//}
//
//
//	//2.������
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
//		printf("��ѡ��");
//		scanf("%d", &input);
//		switch (input)
//		{
//		case 1:
//			game();
//				break;
//		case 0:
//				printf("�˳���Ϸ\n");
//				break;
//		default:
//		     	printf("ѡ�����\n");
//				break;
//
//
//		}
//	} while (input);
//
//	return 0;
//}
//


//int main()          //�������±꣨��Ч�ʰ�)
//{
//	int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);   //����Ԫ�ظ���
//	int i = 0;
//	for (i = 0; i < sz; i++)
//	{
//		if (arr[i] == k)
//		{
//			printf("�ҵ���,�±���%d\n",i); 
//		break;
//		}
//	}
//	if (i == sz)
//	{
//		printf("�Ҳ�����\n");
//	}
//	
//	return 0;
//}


//int main()          //�������±꣨�Ż���)
//{
//	int arr[] = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
//	int k = 7;
//	int sz = sizeof(arr) / sizeof(arr[0]);   //����Ԫ�ظ���
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
//			printf("�ҵ��ˣ��±���%d\n", mid);
//			break;
//		}
//           
//	}
//	if (left > right)
//	{
//		printf("�Ҳ�����\n");
//	}
//	return 0;
//}
