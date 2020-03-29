#define _CRT_SECURE_NO_WARNINGS 1
#include "game.h"
//初始化扫雷的棋盘
void InitBoard(char board[ROWS][COLS], int rows, int cols, char set);
void DisplayBoard(char board[ROWS][COLS], int row, int col);
void Setmine(char mine[ROWS][COLS], int row, int col);
void Findmine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int rol);


 void InitBoard(char board[ROWS][COLS], int rows, int cols,char set)
{
	int i = 0;
	int j = 0;
	for (i = 0; i < rows; i++)
	{
		for (j = 0; j < cols; j++)
		{
			board[i][j] = set;
		}
	}
}

void DisplayBoard(char board[ROWS][COLS], int row, int col)
{
	int i = 0;
	int j = 0;
	for (i = 0; i <= col; i++)
	{
		printf("%d", i);
	}
	printf("\n"); 
	for (i = 1; i <= row; i++)
	{
		printf("%d", i);
		for (j = 1; j <= col; j++)
		{ 
			printf("%c", board[i][j]);
		}
		printf("\n");
	}
}
void Setmine(char mine[ROWS][COLS], int row, int col)
{
	 int count = EASY_COUNT; 
	 while (count)
	 {
		 int x = rand() % row + 1;
		 int y = rand() % col + 1; 
		 if (mine[x][y] == '0')
		 {
			 mine[x][y] = '1';
			 count--;
		 }
	 }
}
int GetmineCount(char mine[ROWS][COLS],int x,int y)
{
	return  mine[x - 1][y] +
		mine[x - 1][y - 1] +
		mine[x][y - 1] +
		mine[x + 1][y - 1] +
		mine[x + 1][y] +
		mine[x + 1][y + 1] +
		mine[x][y + 1] +
		mine[x - 1][y + 1] - 8 * '0';
}
void Findmine(char mine[ROWS][COLS], char show[ROWS][COLS], int row, int col)
{
	int x = 0;
	int y = 0;
	int win = 0;
	while (win<row*col-EASY_COUNT)
	{

		printf("请输入排查的坐标：>");
		scanf("%d%d", &x, &y);
		if (x >= 1 && x <= row&&y >= 1 && y <= col)
		{
			if (mine[x][y] == '1')
			{
				printf("很遗憾你被炸死了\n");
				DisplayBoard(mine, row, col);
				break;
			}

			else
			{
				int count = GetmineCount(mine, x, y);
				show[x][y] = count + '0';
				DisplayBoard(show, ROW, COL);
			}
		}
		else
		{
			printf("输入坐标有误\n");
		}
	}
	if (win == row*col - EASY_COUNT)
	{
		printf("恭喜你排雷成功");
	}
}