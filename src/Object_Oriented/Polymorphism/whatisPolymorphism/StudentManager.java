package Object_Oriented.Polymorphism.whatisPolymorphism;

public class StudentManager {
    public StudentManager() {

    }

    //定义一个方法表示注册
    //参数Person：此时可以传递person本身的对象，也可以传递person所有子类的对象

    public void register(Person person) {

        System.out.println("姓名为"+person.getName()+"的用户注册成用，账号"+person.getAccount()+",密码："+person.getPassword());
        person.work();  //传入哪个子类调用哪个子类的方法
    }
}
