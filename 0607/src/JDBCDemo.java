import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @program: 0607
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-07 00:30
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        Class<?> cls= Class.forName("com.mysql.jdbc.Driver");
        System.out.println(cls.getSimpleName());
    }
}
