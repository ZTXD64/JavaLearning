package Object_Oriented.Interface.Test1;

public class Dog extends Animal implements swim{
    public Dog() {
    }

    public Dog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

    @Override
    public void swim() {
        System.out.println("小狗在游泳");
    }
}
