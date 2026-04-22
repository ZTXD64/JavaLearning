package Object_Oriented.abstractClassMethods;

public abstract class Animal {
    private String name;
    private String color;

    public Animal() {

    }

    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //共有方法
    public void drink() {
        System.out.println("喝水");
    }

    //行为eat，抽象方法，喝水
    //鼠标点击红色波浪线，alt+回车——自动修复
    public abstract void eat();
}
