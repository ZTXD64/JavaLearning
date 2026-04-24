package commonApis.String.CommonMethod.Equals;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        “==”号的比较：
                如果是基本数据类型，比较的是具体的值
                如果是引用数据类型：比较的是内存地址

         字符串的比较：
                equals：需要完全一样的比较
                equalsIgnoreCase：忽略大小写的比较

                练习：
                    已知正确的用户名和密码，请用程序实现模拟用户登录
                    总共给三次机会，登录之后，给出相应的提示
        */

        String rightUsername = "zhangsan";
        String rightPassword = "12345678";

        Scanner sc = new Scanner(System.in);

        String userName;
        String passWord;

        for (int i = 0; i <= 2; i++) {
            System.out.println("请输入用户名：");
            userName = sc.next();
            System.out.println("请输入密码：");
            passWord = sc.next();
            Boolean result = userName.equals(rightUsername) && passWord.equals(rightPassword);
            //当对boolean类型进行判断时，最好直接写变量名。
            if (result) {
                System.out.println("登陆成功");
                break;
            } else if (i == 0) {
                System.out.println("账号或者密码错误，你还有两次机会");
            } else if (i == 1) {
                System.out.println("账号或者密码错误，你还有一次机会");
            } else {
                System.out.println("账号或者密码错误，账号"+userName+"已被锁定");
            }

        }

    }
}
