package Object_Oriented.inherit.继承中构造方法的特点;

public class Test {
    public static void main(String[] args) {
        //父类的构造方法不会被子类继承，只能通过super关键字调用
        //如果子类的构造方法不写super，JVM也会加一个默认的super()，先访问父类的无参构造


        //构造对象
        //ctrl+p可以看全参构造的顺序
        Student s = new Student("yz00",18,"2021级");
        System.out.println(s.name+s.age+s.grade);


        Teacher t = new Teacher("ztxd",18,"math");
        System.out.println(t.name+t.age+t.subject);

        System.out.println("_____________________________________");
        //继承中构造方法的三个小特点

        //1.子类构造方法的第一行默认有一个super（），我们没写，jvm也会加上
        Student s2 = new Student();
        //注意看，这里父类的无参构造方法也执行了

        //2.如果想要访问父类的带参构造，super（参数）必须手动写上，不能省略

        //3.在创建对象的时候，先执行父类的构造方法，再执行子类的构造方法。
    }
}
