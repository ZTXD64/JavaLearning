package Object_Oriented.inherit.带有继承结构的标准javabean;

public class BechlorStudent extends Student{
    //私有化成员变量，没有，不用写


    //无参构造
    public BechlorStudent() {
    }

    //全参构造
    public BechlorStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("本科的学生正在学习本课内容");
    }
}
