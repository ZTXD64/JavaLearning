package Object_Oriented.inherit.this和super关键字汇总;

public class Student {
    String name;
    int age;

    public Student() {
        this("同学",18);
        //不能再调用super，会报错
        //super();
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
