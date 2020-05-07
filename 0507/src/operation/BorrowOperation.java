package operation;

import book.Book;
import book.BookList;

import java.util.Scanner;

/**
 * @program: 0506
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-06 17:41
 **/
public class BorrowOperation  implements IOperation{


    @Override
    public void work(BookList bookList) {
        System.out.println("借阅图书");
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入图书的名字");
        String name = scanner.nextLine();
        for (int i=0;i<bookList.getUsedSize();i++){
            Book book = bookList.getBooks(i);
            if (book.getName().equals(name)){
                //可以借阅
                book.setBorrowed(true);
                System.out.println("借阅成功");
                return;
            }
        }
        System.out.println("没有你要借的书");
    }

}
