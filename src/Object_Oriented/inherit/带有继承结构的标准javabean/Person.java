package Object_Oriented.inherit.带有继承结构的标准javabean;

public class Person {
    //私有化成员变量
     private String name;
     private int age;

     //空参构造方法
    public Person() {

    }

    //全参构造方法
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //get和set方法
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //行为方法
    public void eat() {
        System.out.println("吃饭");
    }

    //行为方法
    public void sleep() {
        System.out.println("正在睡觉");
    }
}
