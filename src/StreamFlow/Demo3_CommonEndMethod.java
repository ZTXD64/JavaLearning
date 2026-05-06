package StreamFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Demo3_CommonEndMethod {
    static void main(String[] args) {

//        void forEach(Consumer action)                           对此流运算后的元素执行遍历
//        Long count()                                            统计此流运算后的元素个数
//        Optional<T> max(Comparator<? super T> comparator)       获取此流运算后的最大值元素
//        Optional<T> min(Comparator<? super T> comparator)       获取此流运算后的最小值元素


        List<Teacher> list = new ArrayList<>();
        list.add(new Teacher("ZTXD",18));
        list.add(new Teacher("y_Z00",9));
        list.add(new Teacher("maze",40));
        list.add(new Teacher("BadEgg",40));

        System.out.println("===============遍历=================");
        //1.forEach遍历
        list.stream().forEach(System.out::println);

        System.out.println("===============count=================");
        //2.统计个数
        long count = list.stream().count();
        System.out.println(count);

        System.out.println("===============max=================");
        //3.获取最大值
        Optional<Teacher> max = list.stream().max((t1, t2) -> Integer.compare(t1.getAge(), t2.getAge()));
        Teacher maxT = max.get();
        System.out.println(maxT);

        System.out.println("===============min=================");
        //3.获取最大值
        Optional<Teacher> min = list.stream().min((t1, t2) -> Integer.compare(t1.getAge(), t2.getAge()));
        Teacher minT = max.get();
        System.out.println(minT);



        System.out.println("===============收集数据=================");
        //Stream提供的常用终结方法：
//              R collect(Collector collector)                                              把流处理后的结果收集到一个指定的集合中去
        //              Object[] toArray()                                                  把流处理后的结果收集到一个数组中去
        //Collectors工具类提供的具体收集方式
//        public static <T> Collector toList()                                              把元素收集到List集合中
//        public static <T> Collector toSet()                                               把元素收集到set集合中
//        public static Collector toMap(Function keyMapper , Function valueMapper)          把元素收集到Map集合中


        //Stream提供的常用终结方法：
//        List<Teacher> collect = list.stream().filter(s -> s.getAge() > 20).collect(Collectors.toList());
        //收集到ArrayList集合
        List<Teacher> collect = list.stream().filter(s -> s.getAge() > 20).toList();

        //收集到数组中
        Object[] array = list.stream().filter(s -> s.getAge() > 20).toArray();


        //Collectors工具类提供的具体收集方式
//        List<Teacher> collect1 = list.stream().filter(s -> s.getAge() > 20).collect(Collectors.toList());

        //收集到set集合
        Map<String, Integer> collect1 = list.stream().filter(s -> s.getAge() > 20).collect(Collectors.toMap(Teacher::getName, Teacher::getAge));
        System.out.println(collect1);
    }
}
