package Collection.MapCollection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class MapTraversal {
    static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ZTXD",18);
        map.put("Y_z00",99);
        map.put("MAZE",80);
        map.put("BadEgg",50);


        System.out.println("======================Method:1=======================");
        //Map集合遍历方法1：根据键寻找值
        Collection<String> keys = map.keySet();
        for (String key : keys) {
            Integer i = map.get(key);
            System.out.println(i);
        }


        System.out.println("=====================Method:2========================");
        //Map集合遍历方法2:键值对
        //把“键值对”看成一个整体去遍历

        //1.首先把map集合转成Set集合，里面是一个个键值对：entries=[(ZTXD=18),(Y_z00=99).....]
        Set<Map.Entry<String, Integer>> entries = map.entrySet();

        //2.遍历entries集合中的每一个元素并分别获取键，值
        for (Map.Entry<String, Integer> entry : entries) {

//            这里使用了字符串拼接操作（+ 运算符）
//            Java 在进行字符串拼接时，会自动调用对象的 toString() 方法将非字符串类型转换为字符串
//            entry.getValue() 返回的是 Integer 类型，但因为有 + 连接符，Java 会自动将其转换为字符串

//            System.out.println(entry.getKey()+"==>"+entry.getValue());
            String key = entry.getKey();

//            这里是要将一个值赋给 String 类型的变量
//            Java 是强类型语言，不能直接将 Integer 类型赋值给 String 类型
//            必须显式地进行类型转换，所以需要使用 String.valueOf() 方法将 Integer 转换为 String


            //字符串拼接时，自动进行类型转换，但是变量赋值时，需要手动进行类型转换

            String value = String.valueOf(entry.getValue());
            System.out.println(key+"==>"+value);
        }

        System.out.println("=====================Method:3========================");
        //Map集合遍历方法2:lambda
        map.forEach(new BiConsumer<String, Integer>() {
            @Override
            public void accept(String k, Integer v) {
                System.out.println(k+"="+v);
            }
        });
        System.out.println("=====================Method:3_lambda========================");

        map.forEach((k,v) -> System.out.println(k+"=>"+v));
    }
}
