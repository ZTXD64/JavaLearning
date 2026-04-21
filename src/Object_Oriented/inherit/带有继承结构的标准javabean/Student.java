package Object_Oriented.inherit.带有继承结构的标准javabean;

public class Student extends Person{
    //私有化成员变量
    private String grade;
    //空参构造
    public Student() {

    }

    //全参构造
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    //get和set方法，只需要写一对，因为name和age的getset方法已经继承了父类的
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    //子类特有的方法
    public void study() {
        System.out.println("学习");
    }
}
