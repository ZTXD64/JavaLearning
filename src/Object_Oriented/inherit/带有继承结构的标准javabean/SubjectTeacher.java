package Object_Oriented.inherit.带有继承结构的标准javabean;

public class SubjectTeacher extends Teacher{
    //没有私有成员变量

    //构造方法

    public SubjectTeacher() {
    }

    public SubjectTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    //重写方法

    @Override
    public void teach() {
        System.out.println("正在教授专业课知识");
    }
}
