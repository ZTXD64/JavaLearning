package Object_Oriented.inherit.带有继承结构的标准javabean;

public class MasterStudent extends Student{
    public MasterStudent() {

    }

    public MasterStudent(String name, int age, String grade) {
        super(name, age, grade);
    }

    @Override
    public void study() {
        System.out.println("研究生的同学正在学习硕士内容");
    }

    @Override
    public void sleep() {
        System.out.println("在豪华宿舍睡觉");
    }
}
