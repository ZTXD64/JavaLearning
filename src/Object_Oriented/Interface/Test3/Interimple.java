package Object_Oriented.Interface.Test3;

public class Interimple implements Inter,InterB{

    @Override
    public void method1() {
        System.out.println("重写了method1");
    }

    @Override
    public void method2() {
        System.out.println("重写了method2");
    }

    //默认方法不是抽象方法，所以不强制被重写。但是如果被重写，重写的时候去掉defau1t关键字
    //这里重写去掉了default关键字
//    @Override
//    public void fuction() {
//        Inter.super.fuction();
//    }



    //两个接口中都有f方法，必须进行重写，否则会报错

    @Override
    public void f() {
        Inter.super.f();
    }
}
