package Object_Oriented.InnerClass.Test2StaticInnerClass;

public class Test {
    public static void main(String[] args) {
        //静态内部类

        /*注意事项：
                1.静态内部类也是成员内部类中的一种
                2.静态内部类只能访问外部类中的静态变量和静态方法，如果想要访问非静态的需要创建对象。


            创建静态内部类对象的格式：

                    外部类名.内部类名对象名=new外部类名.内部类名()；
                    调用静态方法的格式：
                    外部类名.内部类名.方法名()；*/


        //创建静态内部类的对象
        //凡是静态的，都可以通过 类名点 进行调用
        Outer.inner i = new Outer.inner();
        i.show();
        //i.show2(); //这里idea不提倡，但是也可以强行调用，为什么？
        //因为show2（）是静态的方法，静态方法不鼓励使用对象调用

        Outer.inner.show2();
        //而是鼓励使用类名调用静态方法
    }
}
