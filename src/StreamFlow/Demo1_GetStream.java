package StreamFlow;

import java.util.*;
import java.util.stream.Stream;

public class Demo1_GetStream {
    static void main(String[] args) {
        //获取Stream

        //1.获取集合的流，使用集合提供的Stream方法
        Collection<String> list = new ArrayList<>();

        Stream<String> stream = list.stream();


        //2.获取Map集合的Stream
        Map<String,Integer> map = new HashMap<>();
        //获取键流
        Stream<String> stream1 = map.keySet().stream();
        //获取值流
        Stream<Integer> stream2 = map.values().stream();
        //获取键值对流
        Stream<Map.Entry<String, Integer>> stream3 = map.entrySet().stream();

        //3.获取数组的流:Arrays类提供的stream方法或者Stream类提供的of方法
        String[] names = {"ZTXD","Y_z00","MAZE","BadEgg"};
        Stream<String> stream4 = Arrays.stream(names);

        System.out.println(stream4.count());    //4

        Stream<String> names1 = Stream.of(names);

        Stream<String> stream5 = Stream.of("ZTXD", "Y_z00", "MAZE", "BadEgg");


    }
}
