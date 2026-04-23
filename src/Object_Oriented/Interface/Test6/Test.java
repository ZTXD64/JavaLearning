package Object_Oriented.Interface.Test6;

public class Test {
    public static void main(String[] args) {
        /*
        接口中的私有方法：
            第一种：普通的私有方法
                    作用：为了抽取默认方法中重复代码而出现的
                    格式：private返回值类型方法名(参数列表){}
            第二种：静态的私有方法
                    作用：为了抽取静态方法中重复代码而出现的
                    格式：privatestatic返回值类型方法名(参数列表){}
         */



       /* 1．JDK7以前：接口中只能定义抽象方法。
        2.JDK8：接口中可以定义有方法体的方法。（默认、静态）
        Z
        3.JDK9：接口中可以定义私有方法。
        4.私有方法分为两种：普通的私有方法，静态的私有方法


        */

        Interimple a = new Interimple();
        a.register();

//        下面代码报错：私有方法外界无法调用
        //a.check;
    }
}
