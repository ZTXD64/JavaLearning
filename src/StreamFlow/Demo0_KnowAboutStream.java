package StreamFlow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Demo0_KnowAboutStream {
    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ZTXD");
        list.add("Z_z00");
        list.add("MAZE");
        list.add("DAZE");
        list.add("DD64");

        //Stram流
        Set<String> d = list.stream().filter(s -> s.startsWith("D")).filter(s -> s.length() == 4).collect(Collectors.toSet());
        System.out.println(d);
//        1、Stream是什么？有什么作用？结合了什么技术?
//                简化集合、数组操作的APl。结合了Lambda表达式。
//        2、说说stream流处理数据的步骤是什么?
//
//                先得到集合或者数组的Stream流。
//                然后调用Stream流的方法对数据进行处理。
//                获取处理的结果。
    }
}
