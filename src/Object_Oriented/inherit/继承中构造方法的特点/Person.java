package Object_Oriented.inherit.继承中构造方法的特点;

public class Person {
    String name;
    int age;

    //alt+insert 创建无参构造
    public Person() {
        System.out.println("父类无参构造执行了");
    }

    //alt+insert 创建带参构造


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("父类带参构造执行了");
    }
}
