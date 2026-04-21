package Object_Oriented.inherit.带有继承结构的标准javabean;

public class Teacher extends Person{
    //私有化成员变量
    private String subject;

    //空参构造
    public Teacher() {

    }

    //全参数构造
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    //get和set方法
    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }


    //子类方法

    public void teach() {
        System.out.println("正在教书");
    }
}
