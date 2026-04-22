package Object_Oriented.inherit.子类到底能继承父类的哪些内容;

public class Test {
    public static void main(String[] args) {
        //子类到底能继承父类的哪些内容？
        //1.构造方法：子类不能继承，但是可以利用super关键字调用
        //2.成员变量：可以被子类继承，private私有的也可以，但是私有的无法直接调用，需要用getset方法。
        //3.成员方法：虚方法可以被继承
                    //final修饰的最终方法不能被继承，但是可以调用
                    //static修饰的静态方法不能被继承，但是可以被调用
                    //private修饰的私有方法不能被继承，也不能被调用
    }
}
