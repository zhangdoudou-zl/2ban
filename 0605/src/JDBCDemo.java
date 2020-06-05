import java.sql.*;

/**
 * @program: 0605
 * @description:
 * @author: Zhang lin
 * @create: 2020-06-05 19:08
 **/
public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class<?> cls= Class.forName("com.mysql.jdbc.Driver");
        //System.out.println(cls.getSimpleName());
        String defaultDatabaseName="student";
        String password ="zl343031550";
        String user="root";
        String url = "jdbc:mysql://127.0.0.1:3306/" + defaultDatabaseName + "?useSSL=false&characterEncoding=utf8";

        Connection connection = DriverManager.getConnection(url, user, password);
        // 打印 connection 对象，验证是否连接成功
        System.out.println(connection);

        updateDemo(connection);
        //queryDemo(connection);

        // -1. 关闭刚才的连接
        connection.close();

    }

    private static void updateDemo(Connection connection) throws SQLException {
        // 获取 Statement 对象
        Statement statement = connection.createStatement();
        String sql = "insert into student_0604 (sn, name, sex) values ('20200605', '小陈', '女')";
        int affectedRows = statement.executeUpdate(sql);
        System.out.printf("Query OK, %d row affected%n", affectedRows);

        statement.close();
    }


    private static void queryDemo(Connection connection) throws SQLException {
        // 要真正的执行 sql 语言，并且获取数据库返回的结果
        Statement statement = connection.createStatement();
        String sql = "select * from exam_result";  // 没有要求必须分号结尾了
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            String id = resultSet.getString(1);
            String sn = resultSet.getString(2);
            String name = resultSet.getString(3);
            String sex = resultSet.getString(4);

        }
        // -3. 关闭 resultSet 对象
        resultSet.close();
        // -2. 关闭 statement 对象
        statement.close();
    }
}
