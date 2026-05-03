package Collection.MapCollection;

import java.util.*;

public class CommonMethods {

//    public V put(K key,V value) 添加元素
//    public int size() 获取集合的大小
//    public void clear() 清空集合
//    public boolean isEmpty() 判断集合是否为空，为空返回true，反之
//    public V get(Object key) 根据键获取对应值
//    public V remove(object key) 根据键删除整个元素
//    public boolean containsKey(object key) 判断是否包含某个键
//            Z
//    public boolean containsValue(object value) 判断是否包含某个值
//    public Set<K> keySet() 获取全部键的集合
//    public Collection<V> values() 获取Map集合的全部值
    static void main(String[] args) {
        Map<String,Integer> map = new HashMap<>();
        map.put("ZTXD",18);
        map.put("Y_z00",99);
        map.put("Y",99);
        map.put("MAZE",80);
        map.put("MAZE",89);
        map.put(null,null);


        //键用Set，因为键和Set集合一样，无序，无索引，不重复
        Set<String> set = map.keySet();
        System.out.println(set);

        //值用Collection，因为值会重复
        Collection<Integer> value = map.values();
        System.out.println(value);

    }
}
