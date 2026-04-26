package FunctionalProgramming.o2_StaticMethodReferences;


import java.util.Arrays;
import java.util.Comparator;

public class Test {
    public static void main(String[] args) {
        //类名::静态方法

        //●如果某个Lambda表达式里只是调用一个静态方法，并且“→”前后参数的形式一致，就可以使用静态方法引用。

        show();
    }

    public static void  show() {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, 1.75, '男');
        students[1] = new Student("李四", 19, 1.65, '女');
        students[2] = new Student("王五", 20, 1.80, '男');

        //(被重写的方法的形参列表) -> {被重写方法的方法体}
/*        Arrays.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                //完整写法
//                if ((o1.getAge() - o2.getAge()) > 0) {
//                    return 1;
//                } else if ((o1.getAge() - o2.getAge()) < 0) {
//                    return -1;
//                }
//
//                return 0;

                //简化方法体写法
                return o1.getAge() - o2.getAge();
            }
        });*/



        //简化lambda为：
        //        //简化规则：1.参数类型全部不写 2.一个参数的时候，参数类型省略的同时“（）”也可以省略，但是多个参数的时候不可以省略
        //        //3.如果lambda表达式中只有一行代码，大括号可以不写，同要省略分号；如果这行代码是return语句，return也要省掉



        //lambda表达式:
         //Arrays.sort(students, (Student o1, Student o2) ->  o1.getAge() - o2.getAge());


        //静态方法引用简化为
        //●如果某个Lambda表达式里只是调用一个静态方法，并且“→”前后参数的形式一致，就可以使用静态方法引用。
        //写为类名::方法名
        Arrays.sort(students, Student::compare);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
