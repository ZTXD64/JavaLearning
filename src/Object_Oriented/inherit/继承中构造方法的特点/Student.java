package Object_Oriented.inherit.继承中构造方法的特点;

public class Student extends Person{
    String grade;

    public Student() {
        //注意这里我没写super()
        System.out.println("Student无参构造执行了");
    }

    public Student(String name,int age,String grade) {
        super(name,age);
        this.grade = grade;

        System.out.println("Student的全参构造执行了");
    }
}
