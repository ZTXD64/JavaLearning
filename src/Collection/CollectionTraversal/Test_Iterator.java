package Collection.CollectionTraversal;

import java.util.ArrayList;
import java.util.Iterator;

public class Test_Iterator {
//    1、如何获取集合的迭代器？迭代器遍历集合的代码具体怎么写？
//    Iterator<E>iterator():得到迭代器对象，默认指向当前集合的索引0
//    2、通过迭代器获取集合的元素，如果取元素越界会出现什么异常？
//    会出现NoSuchElementException异常。
    static void main() {
        ArrayList<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        //得到这个集合的迭代器对象
        Iterator<String> itr = list.iterator(); //创建迭代器，起始位置为0索引位置。
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next());
//        System.out.println(itr.next()); //NoSuchElementException

        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
