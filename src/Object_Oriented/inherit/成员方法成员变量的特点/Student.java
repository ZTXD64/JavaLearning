package Object_Oriented.inherit.成员方法成员变量的特点;


//通过extends继承父类Person里面的name，age属性和eat方法
//public class 子类 extends 父类
public class Student extends Person {
    String grade;

    public void study(){
        System.out.println("正在学习....");
    }
}
