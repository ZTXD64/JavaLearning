package Object_Oriented.InnerClass.Test3LocalInnerClass;

public class Outer {
    int a = 10; //成员变量

    public void show() {

        int b = 10; //局部变量

        //定义一个局部内部类
        class inner {

            public void show() {

//                该类可以直接访问外部类的成员，也可以访问方法内的局部变量
                System.out.println(a);
                System.out.println(b);

                System.out.println("局部内部类里面的方法被调用了");
            }

            public static void show2() {
                System.out.println("局部内部类里面的静态方法被调用了");
            }

        }

        //外界是无法直接使用局部内部类，需要在方法内部创建对象并使用

        inner i =new inner();
        i.show();
        inner.show2();

    }
}
