package Collection.MapCollection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class FeaturesAnd {
    static void main() {

        //map集合不属于Collection集合体系，属于单列的集合

//        认识Map集合:
//        Map集合也被叫做"键值对集合”,格式:{keyl=value1, key2=value2,key3=value3...)
//
//        Map集合的所有键是不允许重复的，但值可以重复，键和值是一一对应的，每一个键只能找到自己对应的值

        //需要存储一一对应的数据时，可以考虑用map集合


//        Map集合体系的特点：
//        注意：Map系列集合的特点都是由键决定的，值只是一个附属品，值是不做要求的
//
//        ●HashMap（由键决定特点）：无序、不重复、无索引;（用的最多）。键值都可以是null。值不做要求
//
//        ●LinkedHashMap（由键决定特点）:由键决定的特点：有序、不重复、无索引。
//
//        ●TreeMap（由键决定特点）:按照大小默认升序排序、不重复、无索引。
            //TreeMap:按照键可排序，不重复，无索引

        Map<String,Integer> map = new HashMap<>();
        map.put("ZTXD",18);
        map.put("Y_z00",99);
        map.put("MAZE",80);
        map.put("MAZE",89);
        map.put(null,null);

        System.out.println(map);

        //LinkedHashMap-----有序，不重复，无索引。
        Map<String,Integer> map2 = new LinkedHashMap<>();
        map2.put("ZTXD",18);
        map2.put("Y_z00",99);
        map2.put("MAZE",80);
        map2.put("MAZE",89);
        map2.put(null,null);

        System.out.println(map2);
    }
}
