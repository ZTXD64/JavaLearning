package Object_Oriented.abstractClassMethods;

public class Cat extends Animal{
    public Cat() {

    }

    public Cat(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    //独有方法
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
