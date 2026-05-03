package Collection.CollectionTraversal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Test {
    static void main() {
        /*
        Collection集合特点
        List系列集合：添加的元素是有序、可重复、有索引的:
                    ArrayList、LinekdList：有序、可重复、有索引。
        Set系列集合：添加的元素是无序、不重复、无索引:
                    HashSet:无序、不重复、无索引;
                    LinkedHashSet:有序、不重复、无索引。
                    TreeSet：按照大小默认升序排序、不重复、无索引。
        */

        //有序、可重复、有索引
        List<String> list = new ArrayList<>();
        list.add("java");
        list.add("java");
        list.add("C++");
        list.add("Python");
        list.add("鸿蒙");
        System.out.println(list);   //println自动调用toString，且集合自动重写了toString方法
        System.out.println(list.get(1));;        //有索引

        //无序、不重复、无索引
        Set<String> set = new HashSet<>();
        set.add("java");    //不可重复
        set.add("java");
        set.add("C");
        System.out.println(set);
        //set.get()     没有索引

    }
}
