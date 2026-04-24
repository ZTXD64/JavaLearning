package commonApis.ArrayList;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        /*1．什么是集合?
                集合：是一种长度可变的容器
        2.集合有什么特点?
                特点1：长度可变
                特点2：只能存引用数据类型，不能存基本数据类型
        3.如何创建集合的对象?
                ArrayList<String> list = new ArrayList<>();
        4.集合的常见方法?
                增、删、改、查*/









        //集合：一种长度可变的容器
        /*
        ArrayList()  创建一个长度为0的集合
        常见的方法：
            boolean add(E e) 添加数据
            void add(int index,E e) 添加数据
            boolean remove(E e) 删除元素    （返回boolean，成功true，失败false）
            E remove(int index) 删除元素  （返回被删除的数据）
            E set(int index,E e)修改元素
            E get(int index) 获取元素
            int size()  获取集合长度
        */


        //1.创建一个长度为0的ArrayList集合
       // int[] arr = new int[3];
 //       ArrayList<> list = new ArrayList<>();
//    问题：能判断上一行集合中能存储什么类型的数据吗？
//          如果没有进行限定，此时集合里面可以存储任意数据类型的数据
//          泛型：限定集合当中的数据类型<数据类型>
//
//            用泛型去限定集合中能存储什么类型的数据
//              ArrayList<String> list = new ArrayList<String>():
//              list.add("aaa");
//          重复的内容：JDK7的时候，后面的泛型可以省略不写，但是尖括号必须保留
        ArrayList<String> list = new ArrayList<>();

        //增加数据
        //ArrayList的add方法无论什么情况下都会添加成功，忽略返回值
        //在集合中无法直接添加基本数据类型（byte，short,int,long,float,double，char，boolean）
        //只能添加引用数据类型（对象），如果非要添加基本数据类型，可以添加其对应的包装类
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");

        //指定索引位置添加数据
        list.add(0,"qqq");
        System.out.println(list);

        //修改元素
        //细节：把指定索引上的数据修改为新数据，返回被修改的数据
                //如果当前索引不存在，代码会报错
        list.set(0,"ZZZ");

        System.out.println(list);

        //获取特定索引的数据
        String string = list.get(0);
        System.out.println(string);

        //遍历 get+size
        //list.fori
        for (int i = 0; i < list.size(); i++) {
            String string1 = list.get(i);
            System.out.println(string1);
        }
    }
}
