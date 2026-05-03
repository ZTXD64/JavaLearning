package Collection.Set;

import java.util.Set;
import java.util.TreeSet;

public class SetFeatures {
    static void main() {
//        Set系列集合特点：无序：添加数据的顺序和获取出的数据顺序不一致；不重复；无索引；
//        HashSet：无序、不重复、无索引。
//        LinkedHashSet:有序、不重复、无索引。
//        TreeSet:排序、不重复、无索引。


//        什么是哈希值？对象的哈希值有什么特点?
//                对象调用Object的hashCode()方法得到的一个随机值
//        HashSet集合的底层原理是什么样的？
//                  基于哈希表实现的。
//        JDK8之前的，哈希表：底层使用数组+链表组成
//        JDK8开始后，哈希表：底层采用数组+链表+红黑树组成。


//        注意：
//        Set要用到的常用方法，基本上就是Collection提供的！！
//        自己几乎没有额外新增一些常用功能！

//        HashSet：无序、不重复、无索引。
        Set<String> set = new java.util.HashSet<>();
        set.add("hello");
        set.add("hello");
        set.add("world");
        set.add("world");
        set.add("java");
        set.add("java");
        System.out.println(set);

//        LinkedHashSet:有序、不重复、无索引。
        Set<String> set1 = new java.util.LinkedHashSet<>();
        set1.add("hello");
        set1.add("hello");
        set1.add("world");
        set1.add("world");
        set1.add("java");
        System.out.println(set1);

//        TreeSet:排序、不重复、无索引。
        Set<Double> set2 = new TreeSet<>();
        set2.add(1.0);
        set2.add(10.4);
        set2.add(0.4);
        set2.add(4.99);
        System.out.println(set2);
    }
}
