package StreamFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class Demo2_StreamCommonMiddleMethod {
    static void main(String[] args) {
//        Stream<T> filter(Predicate<? super T> predicate)                              用于对流中的数据进行过滤。
//        Stream<I> sorted()                                                            对元素进行升序排序
//        Stream<I> sorted(Comparator<? super T> comparator)                            按照指定规则排序
//        Stream<T> limit(long maxSize)                                                 获取前几个元素
//        Stream<T> skip(long n)                                                        跳过前几个元素
//        Stream<T> distinct()                                                          去除流中重复的元素。
//        <R> Stream<R> map(Function<? super L,? extends R> mapper)                     对元素进行加工，并返回对应的新流
//        static <T> Stream<T> concat(Stream a, Stream b)                               合并a和b两个流为一个流

        List<String> names = new ArrayList<>();
        names.add("ZTXD");
        names.add("Z_z00");
        names.add("ZAZE");
        names.add("ZEgg");

        List<Double> numbers = new ArrayList<>();
        numbers.add(5.21);
        numbers.add(6.66);
        numbers.add(8.88);
        numbers.add(7.21);
        numbers.add(9.96);
        numbers.add(5.21);
        numbers.add(6.66);
        numbers.add(8.88);
        numbers.add(7.21);
        numbers.add(9.96);

        //1.filter过滤方法
        names.stream().filter(s -> s.startsWith("Z")).filter(s -> s.length() == 4).forEach(System.out::println);

        System.out.println("====================================================");
        //2.升序排序
        numbers.stream().sorted().forEach(System.out::println);

        System.out.println("====================================================");
        //3.按照制定规则排序 4.获取前几个元素 5.跳过前几个元素 6.去重
        numbers.stream().sorted((s1,s2) -> Double.compare(s2,s1)).distinct().skip(1).limit(2).forEach(System.out::println);
//        numbers.stream().sorted(Double::compare).forEach(System.out::println);

        System.out.println("====================================================");
        //7.对元素进行加工，并返回对应的新流
        numbers.stream().distinct().map(s -> "加十分后："+(s+10)).forEach(System.out::println);
        //8.将a和b合并为一个流
        Stream<Object> concat = Stream.concat(names.stream(), numbers.stream());
    }
}
