package Collection.Set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet123 {
    static void main() {
//        特点：不重复、无索引、可排序（默认升序排序，按照元素的大小，由小到大排序）

//        注意：
//        对于数值类型：Integer,Double，默认按照数值本身的大小进行升序排序。
//        对于字符串类型：默认按照首字符的编号升序排序。
//        对于自定义类型如Student对象，TreeSet默认是无法直接排序的。

//        Set<Teacher> teachers = new TreeSet<>(new Comparator<Teacher>() {
//            @Override
//            public int compare(Teacher o1, Teacher o2) {
//                return Double.compare(o1.getSallary(),o2.getSallary());
//            }
//        });

        //lambda表达式写法
        Set<Teacher> teachers = new TreeSet<>((o1,o2) -> Double.compare(o1.getSallary(),o2.getSallary()));
        //这里的比较器优先于Teacher类中的比较器，离得更近

        teachers.add(new Teacher("张三",18,1899.9));
        teachers.add(new Teacher("李四",25,1999.9));
        teachers.add(new Teacher("李五",28,4999.9));
        teachers.add(new Teacher("赵六",20,3999.9));

        System.out.println(teachers);   //直接运行会报错，因为TreeSet集合默认排序，但是对象TreeSet集合无法排序
        //解决方法：
            //1.对象所属的类实现Comparable接口并重写compareTo方法
            //2.集合自定义comparator比较器对象，重写比较规则
    }
}
