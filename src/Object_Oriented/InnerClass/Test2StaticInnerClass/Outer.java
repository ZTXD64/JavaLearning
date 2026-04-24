package Object_Oriented.InnerClass.Test2StaticInnerClass;

public class Outer {

    int a = 10;

    static int b = 20;


    //写一个静态内部类
    public static class inner {
        //写一个非静态的方法
        public void show() {

            //由于b是静态变量可以直接调用
            System.out.println(b);

            //下面的代码会报错，因为静态内部类只能访问外部类中的静态变量和静态方法
            //System.out.println(a);

            //需要使用创建外部类对象的方法调用变量
            Outer o = new Outer();
            System.out.println(o.a);

            System.out.println("静态内部类类里面的非静态方法被调用了");
        }

        //写一个静态的方法
        public static void show2() {
            System.out.println(b);
            Outer o = new Outer();
            //System.out.println(a); 依旧报错
            System.out.println(o.a);


            System.out.println("静态内部类类里面的静态方法被调用了");
        }
    }
}
