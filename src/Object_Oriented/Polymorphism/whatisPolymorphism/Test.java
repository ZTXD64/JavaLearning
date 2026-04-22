package Object_Oriented.Polymorphism.whatisPolymorphism;

public class Test {
    public static void main(String[] args) {
        //多态
        //什么是多态？事物的多种形态
        //多态的表现形式：父类类型 对象名称 = 子类对象;
        //多态的前提：有继承关系（必须的）
                    //有父类引用指向子类对象（必须的）
                    //有方法的重写（可选的）

        //注册一个学生对象
        Student stu = new Student("张三","zhangsan","12345678");

        StudentManager sm = new StudentManager();
        sm.register(stu);

        //注册一个老师对象
        Teacher t = new Teacher("ztxd","ztxd","12345678");

        StudentManager sm2 = new StudentManager();
        sm2.register(t);

        //注册一个person对象
        Person p = new Person("yz00","yz00","12345678");
        StudentManager sm3 = new StudentManager();
        sm3.register(p);
    }
}
