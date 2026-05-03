package Collection.CollectionTraversal;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaTraversal {
    static void main() {
//        得益于JDK8开始的新技术Lambda表达式，提供了一种更简单、更直接的方式来遍历集合。
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        //匿名内部类
        //Consumer是一个函数式接口，不能直接创建他的对象，需要创建他的实现类，可以写匿名内部类
        list.forEach(new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });

        //lambda
        list.forEach(s -> System.out.println(s));


    }
}
