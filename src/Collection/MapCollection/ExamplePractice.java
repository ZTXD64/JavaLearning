package Collection.MapCollection;

import java.util.*;

public class ExamplePractice {
    public static void main(String[] args) {
//        需求
//            ●某个班级80名学生，现在需要组织秋游活动，班长提供了四个景点依次是（A、B、C、D）,每个学
//            生只能选择一个景点，请统计出最终哪个景点想去的人数最多。
        //1.定义一个集合，存储学生选的的景点，可以重复

        ArrayList<String> locations = new ArrayList<>();
        String[] names = {"ZTXD", "Y_z00", "MAZE", "BadEgg"};
        Random r = new Random();
        for (int i = 0; i < 80 ; i++) {
            int m = r.nextInt(names.length);
            locations.add(names[m]);

        }

        //2.统计投票集合，对景点集合的值进行加法
        Map<String,Integer> map = new HashMap<>();
//        for (String location : locations) {
//            if (map.containsKey(location)) {
//                map.put(location,map.get(location)+1);
//            } else {
//                map.put(location,1);
//            }
//        }
        for (String location : locations) {
            map.put(location,map.containsKey(location)?map.get(location)+1:1);
        }
        //3.打印出最终的景点集合
        map.forEach((k,v) -> System.out.println(k+"="+v));
    }
}
