package commonApis.ArrayList;

import Object_Oriented.Interface.Test3.Inter;

import java.util.ArrayList;

public class Practice {
    public static void main(String[] args) {
        //需求：定义一个集合，添加数字，并进行遍历。
        //遍历格式参照：[元素1，元素2，元素3]。

        //创建集合
        ArrayList<Integer> list = new ArrayList<>();

        //添加数据
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size()-1) {
                System.out.print(list.get(i) +"]");
            } else {
                System.out.print(list.get(i)+",");
            }
        }
    }
}
