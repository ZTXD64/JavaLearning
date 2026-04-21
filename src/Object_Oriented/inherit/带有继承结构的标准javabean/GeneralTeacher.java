package Object_Oriented.inherit.带有继承结构的标准javabean;

public class GeneralTeacher extends Teacher{
    public GeneralTeacher() {
    }

    public GeneralTeacher(String name, int age, String subject) {
        super(name, age, subject);
    }

    @Override
    public void teach() {
        System.out.println("正在教授通识课");
    }
}
