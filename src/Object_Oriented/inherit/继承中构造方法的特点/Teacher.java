package Object_Oriented.inherit.继承中构造方法的特点;

public class Teacher extends Person{
    String subject;

    public Teacher() {
        System.out.println("teacher无参构造执行了");
    }

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
        System.out.println("teacher带参构造执行了");
    }
}
