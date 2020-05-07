package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: 0506
 * @description: 查找书籍
 * @author: Zhang lin
 * @create: 2020-05-06 17:42
 **/
public class FindOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("查找图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入要查找图书的名字");
        String name = scanner.nextLine();
        for (int i=0;i<bookList.getUsedSize();i++){
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                System.out.println(book);
                System.out.println("查找成功");
                return;
            }
        }
        System.out.println("没有你要查找的书");
    }
}
