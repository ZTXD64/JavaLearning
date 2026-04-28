package FunctionalProgramming.o3_InstanceMethodReference;

import java.util.Arrays;

public class Test {
    //如果lambda表达式只是用过对象名称调用一个实例方法，并且“->”前后参数的形式一致，就可以使用实例方法引用
    //写为：对象名::实例方法
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("张三", 18, 1.75, '男');
        students[1] = new Student("李四", 19, 1.95, '女');
        students[2] = new Student("王五", 20, 1.80, '男');

        Student t = new Student();
        Arrays.sort(students,t::compareDouble); //实例方法引用

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
