package Object_Oriented.Interface.Test1;

public class Test {
    public static void main(String[] args) {
        //什么是接口？
        //接口：接口就是一个规则（子类必须按照接口的规则进行重写），而且是独立于继承体系之外的规则（可以理解为干爹）
        //格式：使用interface关键字，：public interface 接口名{}
        //使用：接口和类之间是实现关系，通过implements实现：public class 类名 implements 接口{...}

        //注意点1：接口不能实例化
        //注意点2：接口的子类（实现类），要么重写接口中所有的抽象方法，要么实现类是一个抽象类
        //注意点3：一个类可以实现多个接口，也可以在继承一个类的同时，实现多个接口（亲爹一个，干爹很多个）
                        //public class 类名 extends 父类 implements 接口1,接口2 {...}



        Dog yz00 = new Dog("yz00","黑色");
        System.out.println(yz00.getName()+yz00.getColor());
        yz00.eat();
        yz00.swim();



    }
}
