package user;

import operation.*;

import java.util.Scanner;

/**
 * @program: 0506
 * @description: 管理员
 * @author: Zhang lin
 * @create: 2020-05-06 17:57
 **/
 public class Admin extends User {
      public Admin(String name){
//          super(name);
          this.name = name;
          this.operations = new IOperation[]{
                  new ExitOperation(),
                  new FindOperation(),
                  new AddOperation(),
                  new DelOperation(),
                  new DisplayOperation()

          };
      }

    @Override
    public int  menu() {
        System.out.println("========================");
        System.out.println("hello "+this.name+"欢迎来到图书管理系统");
        System.out.println("1.查找图书");
        System.out.println("2.新增图书");
        System.out.println("3.删除图书");
        System.out.println("4.显示所有图书");
        System.out.println("0.退出系统");
        System.out.println("========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
