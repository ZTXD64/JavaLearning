package Object_Oriented.Interface.Test3;

public class Test {
    public static void main(String[] args) {
      /*  接口中的默认方法：
                作用：为了接口升级而存在的
                格式:publicdefault返回值类型方法名(参数列表){...}
        注意事项：
                1.默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉defau1t关键字
                2. public可以省略，default不能省略
                3．女
                如果实现了多个接口，多个接口中存在相同名字的默认方法，子类就必须对该方法进行重写

       */

        Interimple a = new Interimple();
        a.fuction();
    }
}
