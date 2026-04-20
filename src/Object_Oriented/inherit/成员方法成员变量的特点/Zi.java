package Object_Oriented.inherit.成员方法成员变量的特点;

public class Zi extends Fu {
    String name = "zi";

    public Zi(String name) {
        this.name = name;
    }

    public void show() {
        String name = "a";
        System.out.println(name);
        System.out.println(this.name);
        //super关键字
        System.out.println(super.name);
    }

    public void launch() {
        super.eat(); // 等价于this.eat,也等价于super.eat,但是我下文把父类的eat方法重写了，还是写成super.eat吧
        super.eat();
        this.drink();
    }

    //!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!快捷键alt+insert快速重写
    //@Override   为注解，给java虚拟机看的注解
    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}
