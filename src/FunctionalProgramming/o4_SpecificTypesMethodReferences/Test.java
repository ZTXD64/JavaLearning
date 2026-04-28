package FunctionalProgramming.o4_SpecificTypesMethodReferences;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        //●如果某个Lambda表达式里只是调用一个特定类型的实例方法，并且前面参数列表中的第一个参数是作为方
        //法的主调，后面的所有参数都是作为该实例方法的入参的，则此时就可以使用特定类型的方法引用。


        //英文名字
        String[] names = {"Mike","Cat", "Tom", "Jerry", "Mary", "Lucy", "Jack", "caddy","caocao","boby","曹操"};

/*
        Arrays.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareToIgnoreCase(o2);  //调用了字符串的实例方法，忽略大小写进行排序
            }
        });
*/
        //lambda写法
//        Arrays.sort(names,(o1,o2) -> o1.compareToIgnoreCase(o2));

        //特定类型方法引用——特定类型的名称::方法
        Arrays.sort(names, String::compareToIgnoreCase);


        //Arrays.toString()         方法，打印出内容
        System.out.println(Arrays.toString(names));
    }
}
