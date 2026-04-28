package Generics.o2_genericsClass;

public class Test {
    static void main() {
        //目标：学会自定义泛型类
        //需求，模拟Arraylist集合，自定义一个集合MyArraylist
        MyArrayList<String> mlist = new MyArrayList<>();    //jdk7开始，后面尖括号里面的可以不写

        mlist.add("zhangsan");
        mlist.add("lisi");
        mlist.add("wangwu");

        System.out.println(mlist.remove("wangwu"));

        System.out.println(mlist.toString());
    }
}
