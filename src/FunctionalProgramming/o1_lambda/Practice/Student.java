package FunctionalProgramming.o1_lambda.Practice;

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
}
