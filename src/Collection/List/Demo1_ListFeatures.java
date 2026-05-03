package Collection.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class Demo1_ListFeatures {
    static void main() {
//        void add(int index,E element)
//        E remove(int index)
//        E set(int index,E element)
//        E get(int index)

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");
        System.out.println(list);

        list.add(0,"某某");
        System.out.println(list);

        list.remove(1);
        System.out.println(list);

        list.set(1,"李小四");
        System.out.println(list);

        System.out.println(list.getLast());

        //List集合支持四种遍历，fori，iterator，foreach，lambda

        //iterator
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        //lambda
//        list.forEach((s) -> System.out.println(s));
        list.forEach(System.out::println);
    }
}
