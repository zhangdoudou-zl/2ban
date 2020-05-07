package user;

import operation.*;

import java.util.Scanner;

/**
 * @program: 0506
 * @description: 使用者
 * @author: Zhang lin
 * @create: 2020-05-06 17:57
 **/
public class NormalUser extends User {

    public NormalUser(String name) {
//        super(name);
        this.name=name;
        this.operations = new IOperation[]{
                new ExitOperation(),
                new FindOperation(),
                new BorrowOperation(),
                new ReturnOperation()

        };
    }

    @Override
    public int menu() {
        System.out.println("========================");
        System.out.println("hello "+this.name+"欢迎来到图书系统");
        System.out.println("1.查找图书");
        System.out.println("2.借阅图书");
        System.out.println("3.归还图书");
        System.out.println("0.退出系统");
        System.out.println("========================");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        return choice;
    }
}
