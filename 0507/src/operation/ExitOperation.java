package operation;

import book.BookList;

/**
 * @program: 0506
 * @description: 退出
 * @author: Zhang lin
 * @create: 2020-05-06 17:42
 **/
public class ExitOperation implements IOperation {
    @Override
    public void work(BookList bookList) {
        System.out.println("退出系统");
        System.exit(1);
    }
}
