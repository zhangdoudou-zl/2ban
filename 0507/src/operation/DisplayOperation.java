package operation;

import book.Book;
import book.BookList;

/**
 * @program: 0506
 * @description: 显示书籍
 * @author: Zhang lin
 * @create: 2020-05-06 17:41
 **/
public class DisplayOperation implements IOperation{
    @Override
    public void work(BookList bookList) {
        System.out.println("显示图书");
        for (int i=0;i<bookList.getUsedSize();i++){
            Book book = bookList.getBooks(i);
            System.out.println(book);
        }
    }
}
