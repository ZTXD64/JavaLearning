package Object_Oriented.Interface.Test6;

public interface Inter {
    public default void login() {
        check();
        System.out.println("执行登陆的逻辑");

    }

    public default void register() {
        check();
        System.out.println("执行登陆的逻辑");

    }

    //普通的私有方法：private 返回值类型 方法名(形参) {}
    private void check() {
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式~");
        System.out.println("检查用户名是否存在");
    }

    public static void login2() {
        check2();
        System.out.println("执行登陆的逻辑");
    }


    //上下行互换：alt+shift+上下方向键


    public static void register2() {
        check2();
        System.out.println("执行登陆的逻辑");
    }


    //静态的私有方法private static 返回值类型 方法名(形参) {}
    private static void check2() {
        System.out.println("检查网络");
        System.out.println("检查用户名和密码的格式~");
        System.out.println("检查用户名是否存在");
    }
}
