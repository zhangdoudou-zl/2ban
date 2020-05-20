import java.util.Scanner;

/**
 * @program: 0520
 * @description:
 * @author: Zhang lin
 * @create: 2020-05-20 11:14
 **/
class UserError extends Exception {
    public UserError(String message) {
        super(message);
    }
}
class PasswordError extends Exception {
    public PasswordError(String message) {
        super(message);
    }
}
public class TestDemo {
    private static String userName="dou dou";
    private static String passWord="123456";
    public static void main(String[] args) {
        try {
            login("dou dou", "123456");
        } catch (UserError userError) {
            userError.printStackTrace();
        } catch (PasswordError passwordError) {
            passwordError.printStackTrace();
        }
    }

    public static void login(String userName,String passWord)throws UserError,PasswordError{
        Scanner scan =new Scanner(System.in);
        String name=scan.nextLine();
        String word=scan.next();
        if (!name.equals(userName)){
            throw new UserError("用户名错误");
        }
        if (!word.equals(passWord)) {
            throw new PasswordError("密码错误");
        }
        System.out.println("登陆成功");
    }
}


