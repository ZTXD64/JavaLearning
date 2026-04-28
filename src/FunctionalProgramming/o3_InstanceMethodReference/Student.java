package FunctionalProgramming.o3_InstanceMethodReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data //Data会设置全部参数的get，set方法。并且会自动重写toString方法（toString方法详见对象类）

//全参无参构造
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    //姓名年龄身高性别
    private String name;
    private int age;
    private double height;
    private char gender;

    public static int compare(Student o1,Student o2) {
        return o1.getAge() - o2.getAge();
    }

    public int compareDouble(Student o1,Student o2) {
        return Double.compare(o1.getHeight(),o2.getHeight());
    }
}
