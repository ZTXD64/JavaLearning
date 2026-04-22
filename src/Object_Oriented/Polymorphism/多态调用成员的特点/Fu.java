package Object_Oriented.Polymorphism.多态调用成员的特点;

public class Fu extends Ye{
    String name = "Fu";

    public void fushow() {
        System.out.println("fushow方法被调用了");
    }

    public void show() {
        System.out.println("父类的show方法被调用了");
    }
}
