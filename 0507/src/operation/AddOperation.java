package operation;

import book.Book;
import book.BookList;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.util.Scanner;

/**
 * @program: 0506
 * @description:新增书籍
 * @author: Zhang lin
 * @create: 2020-05-06 17:39
 **/
public class AddOperation implements IOperation {
    @Override
    public void work(BookList bookList) {   //新增图书时是往BookList这个类里放
        System.out.println("新增图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字：");
        String name = scanner.nextLine();
        System.out.println("请输入图书的作者：");
        String author = scanner.nextLine();
        System.out.println("请输入图书的价格：");
        int price = scanner.nextInt();
        System.out.println("请输入图书的类型：");
        String type = scanner.next();

        Book book = new Book(name,author,price,type);
        int curSize = bookList.getUsedSize();
        bookList.setBooks(curSize,book);
        bookList.setUsedSize(curSize+1);
        System.out.println("新增成功！");
    }
}
