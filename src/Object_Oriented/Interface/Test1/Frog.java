package Object_Oriented.Interface.Test1;

public class Frog extends Animal implements swim{
    public Frog() {
    }

    public Frog(String name, String color) {
        super(name, color);
    }

    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    @Override
    public void swim() {
        System.out.println("青蛙游泳");
    }
}
