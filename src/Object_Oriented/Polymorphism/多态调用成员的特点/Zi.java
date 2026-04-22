package Object_Oriented.Polymorphism.多态调用成员的特点;

public class Zi extends Fu{
    String name = "Zi";

    //子类独有的方法
    public void zishow() {
        System.out.println("zishow方法被调用了");
    }

    @Override
    public void show() {
        System.out.println("子类的show方法被调用了");
    }
}
