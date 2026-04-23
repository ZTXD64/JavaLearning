package Object_Oriented.Interface.Test3;

public abstract interface Inter {
    public abstract void method1();
    public abstract void method2();

    //新增了默认方法

    //public可以省略，但是default不能省略
    public default void fuction() {
        System.out.println("接口中的默认方法");
    }

    public default void f() {

    }
}
