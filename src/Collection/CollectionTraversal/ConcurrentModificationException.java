package Collection.CollectionTraversal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.function.Consumer;

public class ConcurrentModificationException {  //并发修改异常
    //遍历并修改：有索引可以i--或者倒着遍历。没索引只能iterator遍历
    static void main() {
        //新建一个集合
        ArrayList<String> list = new ArrayList<>();
        list.add("Java入门");
        list.add("宁夏枸杞");
        list.add("黑枸杞");
        list.add("人字拖");
        list.add("特级枸杞");
        list.add("枸杞子");
        list.add("西洋参");
        System.out.println(list);
        
        //遍历并修改
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);

            if (name.contains("枸杞")) {
                list.remove(i);     //这里出现并发修改异常
            }
        }

        //输出集合
        System.out.println(list);

        System.out.println("————————————————————————————————————————————————————");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Java入门");
        list2.add("宁夏枸杞");
        list2.add("黑枸杞");
        list2.add("人字拖");
        list2.add("特级枸杞");
        list2.add("枸杞子");
        list2.add("西洋参");
        System.out.println(list2);

        //解决方案1：i--
        for (int i = 0; i < list2.size(); i++) {
            String name = list2.get(i);
            if (name.contains("枸杞")) {
                list2.remove(i);
                i--;
            }
        }

        System.out.println(list2);

        System.out.println("————————————————————————————————————————————————————");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("Java入门");
        list3.add("宁夏枸杞");
        list3.add("黑枸杞");
        list3.add("人字拖");
        list3.add("特级枸杞");
        list3.add("枸杞子");
        list3.add("西洋参");
        System.out.println(list3);

        //解决方法2：倒着循环

        for (int i = list3.size()-1; i >= 0 ; i--) {
            String name = list3.get(i);
            if (name.contains("枸杞")) {
                list3.remove(i);
            }
        }

        System.out.println(list3);

        System.out.println("————————————————————————————————————————————————————");

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Java入门");
        list4.add("宁夏枸杞");
        list4.add("黑枸杞");
        list4.add("人字拖");
        list4.add("特级枸杞");
        list4.add("枸杞子");
        list4.add("西洋参");
        System.out.println(list4);

        //迭代器遍历（可以遍历无索引集合）能否解决问题？
        Iterator<String> it = list4.iterator();
        while (it.hasNext()) {
            String name = it.next();
            if (name.contains("枸杞")) {
//                list4.remove(name);   这样会报并发修改异常！！！！
                //必须用iterator的remove方法
                it.remove();
            }
        }

        System.out.println(list4);

        System.out.println("————————————————————————————————————————————————————");








        ArrayList<String> list5 = new ArrayList<>();
        list5.add("Java入门");
        list5.add("宁夏枸杞");
        list5.add("黑枸杞");
        list5.add("人字拖");
        list5.add("特级枸杞");
        list5.add("枸杞子");
        list5.add("西洋参");
        System.out.println(list5);

        //foreach能否解决呢？不能！
        /*
        for (String s : list5) {
            if (s.contains("枸杞")) {
                list5.remove(s);    //报并发修改异常
            }
        }
        */


        //lambda呢？仍然并发异常！
//        list5.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                if (s.contains("枸杞")) {
//                    list5.remove(s);
//                }
//            }
//        });
//        System.out.println(list5);



    }
}
