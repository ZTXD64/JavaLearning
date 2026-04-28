package Generics.o1_genericsKnowledge;

import java.util.ArrayList;

public class Test {
    static void main() {
//        定义类、接口、方法时，同时声明了一个或者多个类型变量（如：<E>）
//        称为泛型类、泛型接口，泛型方法、它们统称为泛型。


        //作用：泛型提供了在编译阶段约束所能操作的数据类型，并自动进行检查的能力！
        //这样可以避免强制类型转换，及其可能出现的异常。
        //泛型的本质：把具体的数据类型作为参数传给类型变量。

        ArrayList<String> list = new ArrayList<String>();
        list.add("begin");
        list.add("sad");
        list.add("happy");
        list.add("end");
        list.add("start");
//        list.add(1243);       //因为设置了泛型，除了String变量其他都不能进入到集合内部，避免出现异常

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
