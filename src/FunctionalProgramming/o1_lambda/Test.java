package FunctionalProgramming.o1_lambda;

public class Test {
    public static void main(String[] args) {
        //函数式编程:用于替代某些匿名内部类对象，从而让程序更简洁，可读性更好
        //(被重写的方法的形参列表) -> {被重写方法的方法体}



        //lambda并不是能简化所有的匿名内部类，之能重写函数式接口的匿名内部类

        Swim s = () -> {
            System.out.println("学生在游泳");
        };
        s.swim();
    }

}
//函数式接口：有且只有一个抽象方法的接口

@FunctionalInterface //声明函数式接口的注解
interface Swim {
    void swim();
}


