package Collection.CollectionTraversal;

import java.util.ArrayList;

public class Enhanced_forloop {
    static void main() {
        //增强for又叫for each循环，可以用来遍历数组和集合。但是iterator迭代器不能遍历数组
        //foreach遍历集合，本质上就是迭代器遍历集合的简化版本

        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        for (String name : list) {
            System.out.println(name);
        }

        //遍历数组
        String[] users = {"张三", "李四", "王五", "赵六"};
        for (String user : users) {
            System.out.println(user);
        }
    }
}
