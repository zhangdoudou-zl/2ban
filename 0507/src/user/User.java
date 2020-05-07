package user;

import book.Book;
import book.BookList;
import operation.IOperation;

/**
 * @program: 0506
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-06 17:56
 **/
public abstract class User {
    protected String name;

    protected IOperation[] operations;//定义数组

//    public User(String name) {
//        this.name = name;
//    }
    public abstract int menu();

    public void doOperation(BookList bookList,int choice){
        this.operations[choice].work(bookList);
    }


}
